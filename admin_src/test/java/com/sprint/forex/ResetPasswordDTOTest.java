package com.sprint.forex;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.ResetPasswordDTO;

class ResetPasswordDTOTest {

    @Test
    void setEmail_ValidEmail_SetsEmail() {
        // Arrange
        ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO();
        String email = "user@example.com";

        // Act
        resetPasswordDTO.setEmail(email);

        // Assert
        assertEquals(email, resetPasswordDTO.getEmail());
    }

    @Test
    void setOldPassword_ValidOldPassword_SetsOldPassword() {
        // Arrange
        ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO();
        String oldPassword = "oldpassword";

        // Act
        resetPasswordDTO.setOldPassword(oldPassword);

        // Assert
        assertEquals(oldPassword, resetPasswordDTO.getOldPassword());
    }

    @Test
    void setNewPassword_ValidNewPassword_SetsNewPassword() {
        // Arrange
        ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO();
        String newPassword = "newpassword";

        // Act
        resetPasswordDTO.setNewPassword(newPassword);

        // Assert
        assertEquals(newPassword, resetPasswordDTO.getNewPassword());
    }
}
