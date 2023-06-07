package com.sprint.forex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.RateConvertDTO;

 class RateConvertDTOTest {

    @Test
     void testRateConvertDTOGettersAndSetters() {
        // Arrange
        Double amount = 100.0;
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        
        // Act
        RateConvertDTO rateConvertDTO = new RateConvertDTO();
        rateConvertDTO.setAmount(amount);
        rateConvertDTO.setFromCurrency(fromCurrency);
        rateConvertDTO.setToCurrency(toCurrency);
        
        // Assert
        Assertions.assertEquals(amount, rateConvertDTO.getAmount());
        Assertions.assertEquals(fromCurrency, rateConvertDTO.getFromCurrency());
        Assertions.assertEquals(toCurrency, rateConvertDTO.getToCurrency());
    }
    
    @Test
     void testRateConvertDTOConstructor() {
        // Arrange
        Double amount = 100.0;
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        
        // Act
        RateConvertDTO rateConvertDTO = new RateConvertDTO(amount, fromCurrency, toCurrency);
        
        // Assert
        Assertions.assertEquals(amount, rateConvertDTO.getAmount());
        Assertions.assertEquals(fromCurrency, rateConvertDTO.getFromCurrency());
        Assertions.assertEquals(toCurrency, rateConvertDTO.getToCurrency());
    }
    
    @Test
     void testRateConvertDTOEmptyConstructor() {
        // Arrange
        
        // Act
        RateConvertDTO rateConvertDTO = new RateConvertDTO();
        
        // Assert
        Assertions.assertNull(rateConvertDTO.getAmount());
        Assertions.assertNull(rateConvertDTO.getFromCurrency());
        Assertions.assertNull(rateConvertDTO.getToCurrency());
    }
}
