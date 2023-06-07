package com.sprint.forex.service;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.CommonDTO;

 class CommonDTOTest {
    
    @Test
   void testConstructorWithSuccessMessageAndData() {
        // Arrange
        boolean isSuccess = true;
        String message = "Success";
        Integer data = 10;
        
        // Act
        CommonDTO<Integer> commonDTO = new CommonDTO<>(isSuccess, message, data);
        
        // Assert
        Assert.assertTrue(commonDTO.isSuccess());
        Assert.assertEquals(message, commonDTO.getMessage());
        Assert.assertEquals(data, commonDTO.getData());
    }
    
    @Test
     void testConstructorWithSuccessMessageAndNullData() {
        // Arrange
        boolean isSuccess = true;
        String message = "Success";
        
        // Act
        CommonDTO<String> commonDTO = new CommonDTO<>(isSuccess, message);
        
        // Assert
        Assert.assertTrue(commonDTO.isSuccess());
        Assert.assertEquals(message, commonDTO.getMessage());
        Assert.assertNull(commonDTO.getData());
    }
    

    
    @Test
   void testDefaultConstructor() {
        // Arrange & Act
        CommonDTO<Object> commonDTO = new CommonDTO<>();
        
        // Assert
        Assert.assertFalse(commonDTO.isSuccess());
        Assert.assertNull(commonDTO.getMessage());
        Assert.assertNull(commonDTO.getData());
    }
    
    @Test
    void testSettersAndGetters() {
        // Arrange
        CommonDTO<String> commonDTO = new CommonDTO<>();
        
        // Act
        commonDTO.setSuccess(true);
        commonDTO.setMessage("Test");
        commonDTO.setData("Data");
        
        // Assert
        Assert.assertTrue(commonDTO.isSuccess());
        Assert.assertEquals("Test", commonDTO.getMessage());
        Assert.assertEquals("Data", commonDTO.getData());
    }
}
