package com.sprint.forex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.CommonDTO;

 class CommonDTOTest {
  
    @Test
     void testCommonDTOSuccessWithData() {
        // Arrange
        boolean isSuccess = true;
        String message = "Success";
        String data = "Test Data";
        
        // Act
        CommonDTO<String> commonDTO = new CommonDTO<>(isSuccess, message, data);
        
        // Assert
        Assertions.assertTrue(commonDTO.isSuccess());
        Assertions.assertEquals(message, commonDTO.getMessage());
        Assertions.assertEquals(data, commonDTO.getData());
    }
  
    @Test
     void testCommonDTOSuccessWithoutData() {
        // Arrange
        boolean isSuccess = true;
        String message = "Success";
        
        // Act
        CommonDTO<String> commonDTO = new CommonDTO<>(isSuccess, message);
        
        // Assert
        Assertions.assertTrue(commonDTO.isSuccess());
        Assertions.assertEquals(message, commonDTO.getMessage());
        Assertions.assertNull(commonDTO.getData());
    }
  
    @Test
    void testCommonDTOFailureWithData() {
        // Arrange
        boolean isSuccess = false;
        String message = "Failure";
        Integer data = 100;
        
        // Act
        CommonDTO<Integer> commonDTO = new CommonDTO<>(message, data);
        
        // Assert
//        Assertions.assertFalse(commonDTO.isSuccess());
        Assertions.assertEquals(message, commonDTO.getMessage());
        Assertions.assertEquals(data, commonDTO.getData());
    }
  
    @Test
    void testCommonDTOEmptyConstructor() {
        // Arrange
        
        // Act
        CommonDTO<Object> commonDTO = new CommonDTO<>();
        
        // Assert
        Assertions.assertNull(commonDTO.getMessage());
        Assertions.assertNull(commonDTO.getData());
        Assertions.assertFalse(commonDTO.isSuccess());
    }
}
