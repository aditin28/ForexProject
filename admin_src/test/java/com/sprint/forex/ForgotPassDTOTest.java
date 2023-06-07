package com.sprint.forex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.ForgotPassDTO;

 class ForgotPassDTOTest {

    @Test
     void testForgotPassDTOGettersAndSetters() {
        // Arrange
        String email = "test@example.com";
        String password = "password123";
        String otp = "123456";
        
        // Act
        ForgotPassDTO forgotPassDTO = new ForgotPassDTO();
        forgotPassDTO.setEmail(email);
        forgotPassDTO.setPassword(password);
        forgotPassDTO.setOtp(otp);
        
        // Assert
        Assertions.assertEquals(email, forgotPassDTO.getEmail());
        Assertions.assertEquals(password, forgotPassDTO.getPassword());
        Assertions.assertEquals(otp, forgotPassDTO.getOtp());
    }
    
    @Test
     void testForgotPassDTOConstructor() {
        // Arrange
        String email = "test@example.com";
        String password = "password123";
        String otp = "123456";
        
        // Act
        ForgotPassDTO forgotPassDTO = new ForgotPassDTO(email, password, otp);
        
        // Assert
        Assertions.assertEquals(email, forgotPassDTO.getEmail());
        Assertions.assertEquals(password, forgotPassDTO.getPassword());
        Assertions.assertEquals(otp, forgotPassDTO.getOtp());
    }
    
    @Test
     void testForgotPassDTOEmptyConstructor() {
        // Arrange
        
        // Act
        ForgotPassDTO forgotPassDTO = new ForgotPassDTO();
        
        // Assert
        Assertions.assertNull(forgotPassDTO.getEmail());
        Assertions.assertNull(forgotPassDTO.getPassword());
        Assertions.assertNull(forgotPassDTO.getOtp());
    }
}
