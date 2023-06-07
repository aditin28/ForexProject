package com.sprint.forex;
import com.sprint.forex.dto.ExceptionDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class ExceptionDTOTest {

    @Test
     void testConstructorWithSuccessAndMessage_SuccessfulInitialization() {
        // Arrange
        boolean isSuccess = true;
        String message = "Success";

        // Act
        ExceptionDTO exceptionDTO = new ExceptionDTO(isSuccess, message);

        // Assert
        Assertions.assertEquals(isSuccess, exceptionDTO.isSuccess());
        Assertions.assertEquals(message, exceptionDTO.getMessage());
    }

    @Test
     void testConstructorWithMessage_SuccessfulInitializationWithDefaultSuccessValue() {
        // Arrange
        String message = "Error";

        // Act
        ExceptionDTO exceptionDTO = new ExceptionDTO(message);

        // Assert
        Assertions.assertFalse(exceptionDTO.isSuccess());
        Assertions.assertEquals(message, exceptionDTO.getMessage());
    }

    @Test
     void testDefaultConstructor_SuccessfulInitializationWithDefaultValues() {
        // Act
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        // Assert
        Assertions.assertFalse(exceptionDTO.isSuccess());
        Assertions.assertNull(exceptionDTO.getMessage());
    }

    @Test
    void testSetSuccess_SuccessfulModificationOfSuccessValue() {
        // Arrange
        boolean isSuccess = true;
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        // Act
        exceptionDTO.setSuccess(isSuccess);

        // Assert
        Assertions.assertEquals(isSuccess, exceptionDTO.isSuccess());
    }

    @Test
     void testSetMessage_SuccessfulModificationOfMessage() {
        // Arrange
        String message = "New message";
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        // Act
        exceptionDTO.setMessage(message);

        // Assert
        Assertions.assertEquals(message, exceptionDTO.getMessage());
    }
}
