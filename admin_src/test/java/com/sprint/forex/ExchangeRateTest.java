package com.sprint.forex;

import org.junit.jupiter.api.Test;

import com.sprint.forex.entity.Admin;
import com.sprint.forex.entity.ExchangeRate;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ExchangeRateTest {

    @Test
    void setId_ValidId_SetsId() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        int id = 1;

        // Act
        exchangeRate.setId(id);

        // Assert
        assertEquals(id, exchangeRate.getId());
    }

    @Test
    void setFromCurrency_ValidFromCurrency_SetsFromCurrency() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        String fromCurrency = "USD";

        // Act
        exchangeRate.setFromCurrency(fromCurrency);

        // Assert
        assertEquals(fromCurrency, exchangeRate.getFromCurrency());
    }

    @Test
    void setToCurrency_ValidToCurrency_SetsToCurrency() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        String toCurrency = "EUR";

        // Act
        exchangeRate.setToCurrency(toCurrency);

        // Assert
        assertEquals(toCurrency, exchangeRate.getToCurrency());
    }

    @Test
    void setRate_ValidRate_SetsRate() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        double rate = 1.5;

        // Act
        exchangeRate.setRate(rate);

        // Assert
        assertEquals(rate, exchangeRate.getRate());
    }

    @Test
    void setDate_ValidDate_SetsDate() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        LocalDate date = LocalDate.now();

        // Act
        exchangeRate.setDate(date);

        // Assert
        assertEquals(date, exchangeRate.getDate());
    }

    @Test
    void setAdmin_ValidAdmin_SetsAdmin() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();
        Admin admin = new Admin();

        // Act
        exchangeRate.setAdmin(admin);

        // Assert
        assertEquals(admin, exchangeRate.getAdmin());
    }

    @Test
    void getAdmin_WithJsonIgnoreAnnotation_ReturnsNull() {
        // Arrange
        ExchangeRate exchangeRate = new ExchangeRate();

        // Act
        Admin result = exchangeRate.getAdmin();

        // Assert
        assertNull(result);
    }
}
