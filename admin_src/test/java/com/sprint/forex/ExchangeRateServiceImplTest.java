package com.sprint.forex;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.MessageSource;

import com.sprint.forex.dto.ExchangeRateDto;
import com.sprint.forex.entity.Admin;
import com.sprint.forex.entity.ExchangeRate;
import com.sprint.forex.exception.AdminNotFoundException;
import com.sprint.forex.exception.ExchangeRateNotFoundException;
import com.sprint.forex.repository.AdminRepository;
import com.sprint.forex.repository.ExchangeRateRepository;
import com.sprint.forex.service.ExchangeRateServiceImpl;

class ExchangeRateServiceImplTest {

    @Mock
    private ExchangeRateRepository exchangeRateRepository;

    @Mock
    private MessageSource messageSource;

    @Mock
    private AdminRepository adminRepository;

    @InjectMocks
    private ExchangeRateServiceImpl exchangeRateService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveExchangeRate_ValidExchangeRateDto_ReturnsExchangeRateDto() {
        // Arrange
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        exchangeRateDto.setFromCurrency("USD");
        exchangeRateDto.setToCurrency("EUR");
        exchangeRateDto.setRate(1.2);
        exchangeRateDto.setDate(LocalDate.now());
        exchangeRateDto.setAdminId(1);

        Admin admin = new Admin();
        admin.setAdminId(1);

        when(adminRepository.findById(1)).thenReturn(Optional.of(admin));

        // Act
        ExchangeRateDto result = exchangeRateService.saveExchangeRate(exchangeRateDto);

        // Assert
        assertEquals(exchangeRateDto, result);
        verify(adminRepository, times(1)).findById(1);
        verify(exchangeRateRepository, times(1)).save(any(ExchangeRate.class));
    }

    @Test
    void saveExchangeRate_NonExistingAdmin_ThrowsAdminNotFoundException() {
        // Arrange
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        exchangeRateDto.setAdminId(1);

        when(adminRepository.findById(1)).thenReturn(Optional.empty());

        // Act and Assert
        assertThrows(AdminNotFoundException.class, () -> exchangeRateService.saveExchangeRate(exchangeRateDto));
        verify(adminRepository, times(1)).findById(1);
        verify(exchangeRateRepository, times(0)).save(any(ExchangeRate.class));
    }

    @Test
    void convertAmount_ExistingExchangeRate_ReturnsConvertedAmount() {
        // Arrange
        double amount = 100.0;
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.setRate(1.2);

        when(exchangeRateRepository.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency))
                .thenReturn(exchangeRate);

        // Act
        double result = exchangeRateService.convertAmount(amount, fromCurrency, toCurrency);

        // Assert
        assertEquals(120.0, result);
        verify(exchangeRateRepository, times(1)).findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);
    }

    @Test
    void convertAmount_NonExistingExchangeRate_ThrowsExchangeRateNotFoundException() {
        // Arrange
        double amount = 100.0;
        String fromCurrency = "USD";
        String toCurrency = "EUR";

        when(exchangeRateRepository.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency)).thenReturn(null);

        // Act and Assert
        assertThrows(ExchangeRateNotFoundException.class,
                () -> exchangeRateService.convertAmount(amount, fromCurrency, toCurrency));
        verify(exchangeRateRepository, times(1)).findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);
    }

    @Test
    void getRatesByDate_ExistingExchangeRates_ReturnsExchangeRates() {
        // Arrange
        String dateString = "2023-01-01";
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        List<ExchangeRate> exchangeRates = new ArrayList<>();
        exchangeRates.add(new ExchangeRate());
        exchangeRates.add(new ExchangeRate());

        when(exchangeRateRepository.findByDate(date)).thenReturn(exchangeRates);

        // Act
        List<ExchangeRate> result = exchangeRateService.getRatesByDate(dateString);

        // Assert
        assertEquals(exchangeRates, result);
        verify(exchangeRateRepository, times(1)).findByDate(date);
    }

    @Test
    void getRatesByDate_NonExistingExchangeRates_ThrowsExchangeRateNotFoundException() {
        // Arrange
        String dateString = "2023-01-01";
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        when(exchangeRateRepository.findByDate(date)).thenReturn(new ArrayList<>());

        // Act and Assert
        assertThrows(ExchangeRateNotFoundException.class, () -> exchangeRateService.getRatesByDate(dateString));
        verify(exchangeRateRepository, times(1)).findByDate(date);
    }

    @Test
    void getRatesByFromToCurrencyAndDate_ExistingExchangeRates_ReturnsExchangeRates() {
        // Arrange
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        String dateString = "2023-01-01";
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        List<ExchangeRate> exchangeRates = new ArrayList<>();
        exchangeRates.add(new ExchangeRate());
        exchangeRates.add(new ExchangeRate());

        when(exchangeRateRepository.findByFromCurrencyAndToCurrencyAndDate(fromCurrency, toCurrency, date))
                .thenReturn(exchangeRates);

        // Act
        List<ExchangeRate> result = exchangeRateService.getRatesByFromToCurrencyAndDate(fromCurrency, toCurrency, date);

        // Assert
        assertEquals(exchangeRates, result);
        verify(exchangeRateRepository, times(1)).findByFromCurrencyAndToCurrencyAndDate(fromCurrency, toCurrency, date);
    }

    @Test
    void getRatesByFromToCurrencyAndDate_NonExistingExchangeRates_ThrowsExchangeRateNotFoundException() {
        // Arrange
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        String dateString = "2023-01-01";
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        when(exchangeRateRepository.findByFromCurrencyAndToCurrencyAndDate(fromCurrency, toCurrency, date))
                .thenReturn(new ArrayList<>());

        // Act and Assert
        assertThrows(ExchangeRateNotFoundException.class,
                () -> exchangeRateService.getRatesByFromToCurrencyAndDate(fromCurrency, toCurrency, date));
        verify(exchangeRateRepository, times(1)).findByFromCurrencyAndToCurrencyAndDate(fromCurrency, toCurrency, date);
    }

    @Test
    void updateExchangeRate_ExistingExchangeRate_ReturnsUpdatedExchangeRate() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.setId(1);

        when(exchangeRateRepository.findById(1)).thenReturn(Optional.of(exchangeRate));
        when(exchangeRateRepository.save(exchangeRate)).thenReturn(exchangeRate);

        // Act
        ExchangeRate result = exchangeRateService.updateExchangeRate(exchangeRate);

        // Assert
        assertEquals(exchangeRate, result);
        verify(exchangeRateRepository, times(1)).findById(1);
        verify(exchangeRateRepository, times(1)).save(exchangeRate);
    }

    @Test
    void updateExchangeRate_NonExistingExchangeRate_ThrowsExchangeRateNotFoundException() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.setId(1);

        when(exchangeRateRepository.findById(1)).thenReturn(Optional.empty());

        // Act and Assert
        assertThrows(ExchangeRateNotFoundException.class,
                () -> exchangeRateService.updateExchangeRate(exchangeRate));
        verify(exchangeRateRepository, times(1)).findById(1);
        verify(exchangeRateRepository, times(0)).save(exchangeRate);
    }

    @Test
    void getById_ExistingExchangeRate_ReturnsExchangeRate() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.setId(1);

        when(exchangeRateRepository.findById(1)).thenReturn(Optional.of(exchangeRate));

        // Act
        ExchangeRate result = exchangeRateService.getById(1);

        // Assert
        assertEquals(exchangeRate, result);
        verify(exchangeRateRepository, times(1)).findById(1);
    }

    @Test
    void getById_NonExistingExchangeRate_ThrowsExchangeRateNotFoundException() {
        // Arrange
        int id = 1;

        when(exchangeRateRepository.findById(id)).thenReturn(Optional.empty());

        // Act and Assert
        assertThrows(ExchangeRateNotFoundException.class, () -> exchangeRateService.getById(id));
        verify(exchangeRateRepository, times(1)).findById(id);
    }

    @Test
    void findAllRates_ExistingExchangeRates_ReturnsAllExchangeRates() {
        // Arrange
        List<ExchangeRate> exchangeRates = new ArrayList<>();
        exchangeRates.add(new ExchangeRate());
        exchangeRates.add(new ExchangeRate());

        when(exchangeRateRepository.findAll()).thenReturn(exchangeRates);

        // Act
        List<ExchangeRate> result = exchangeRateService.findAllRates();

        // Assert
        assertEquals(exchangeRates, result);
        verify(exchangeRateRepository, times(1)).findAll();
    }
}
