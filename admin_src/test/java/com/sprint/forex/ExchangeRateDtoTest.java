package com.sprint.forex;

import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.ExchangeRateDto;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ExchangeRateDtoTest {

    @Test
    void setAdminId_ValidAdminId_SetsAdminId() {
        // Arrange
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        int adminId = 1;

        // Act
        exchangeRateDto.setAdminId(adminId);

        // Assert
        assertEquals(adminId, exchangeRateDto.getAdminId());
    }

    @Test
    void setId_ValidId_SetsId() {
        // Arrange
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        int id = 1;

        // Act
        exchangeRateDto.setId(id);

        // Assert
        assertEquals(id, exchangeRateDto.getId());
    }

    @Test
    void setFromCurrency_ValidFromCurrency_SetsFromCurrency() {
        // Arrange
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        String fromCurrency = "USD";

        // Act
        exchangeRateDto.setFromCurrency(fromCurrency);

        // Assert
        assertEquals(fromCurrency, exchangeRateDto.getFromCurrency());
    }

    @Test
    void setToCurrency_ValidToCurrency_SetsToCurrency() {
        // Arrange
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        String toCurrency = "EUR";

        // Act
        exchangeRateDto.setToCurrency(toCurrency);

        // Assert
        assertEquals(toCurrency, exchangeRateDto.getToCurrency());
    }

    @Test
    void setRate_ValidRate_SetsRate() {
        // Arrange
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        double rate = 1.5;

        // Act
        exchangeRateDto.setRate(rate);

        // Assert
        assertEquals(rate, exchangeRateDto.getRate());
    }

    @Test
    void setDate_ValidDate_SetsDate() {
        // Arrange
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        LocalDate date = LocalDate.now();

        // Act
        exchangeRateDto.setDate(date);

        // Assert
        assertEquals(date, exchangeRateDto.getDate());
    }
}
