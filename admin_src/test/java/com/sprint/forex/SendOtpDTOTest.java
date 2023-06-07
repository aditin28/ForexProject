package com.sprint.forex;
import com.sprint.forex.dto.SendOtpDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class SendOtpDTOTest {

    @Test
     void testConstructorWithEmail_SuccessfulInitialization() {
        // Arrange
        String email = "test@example.com";

        // Act
        SendOtpDTO sendOtpDTO = new SendOtpDTO(email);

        // Assert
        Assertions.assertEquals(email, sendOtpDTO.getEmail());
    }

    @Test
     void testDefaultConstructor_SuccessfulInitializationWithNullEmail() {
        // Act
        SendOtpDTO sendOtpDTO = new SendOtpDTO();

        // Assert
        Assertions.assertNull(sendOtpDTO.getEmail());
    }

    @Test
     void testSetEmail_SuccessfulModificationOfEmail() {
        // Arrange
        String email = "test@example.com";
        SendOtpDTO sendOtpDTO = new SendOtpDTO();

        // Act
        sendOtpDTO.setEmail(email);

        // Assert
        Assertions.assertEquals(email, sendOtpDTO.getEmail());
    }
}
