package com.sprint.forex.service;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.ResetPasswordDTO;

 class ResetPasswordDTOTest {

    @Test
    void testEmptyConstructor() {
        // Arrange & Act
        ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO();

        // Assert
        Assert.assertNull(resetPasswordDTO.getEmail());
        Assert.assertNull(resetPasswordDTO.getOldPassword());
        Assert.assertNull(resetPasswordDTO.getNewPassword());
    }

    @Test
    void testConstructorWithParameters() {
        // Arrange
        String email = "john.doe@example.com";
        String oldPassword = "oldPassword";
        String newPassword = "newPassword";

        // Act
        ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO(email, oldPassword, newPassword);

        // Assert
        Assert.assertEquals(email, resetPasswordDTO.getEmail());
        Assert.assertEquals(oldPassword, resetPasswordDTO.getOldPassword());
        Assert.assertEquals(newPassword, resetPasswordDTO.getNewPassword());
    }

    @Test
    void testSetEmail() {
        // Arrange
        ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO();
        String email = "john.doe@example.com";

        // Act
        resetPasswordDTO.setEmail(email);

        // Assert
        Assert.assertEquals(email, resetPasswordDTO.getEmail());
    }

    @Test
    void testSetOldPassword() {
        // Arrange
        ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO();
        String oldPassword = "oldPassword";

        // Act
        resetPasswordDTO.setOldPassword(oldPassword);

        // Assert
        Assert.assertEquals(oldPassword, resetPasswordDTO.getOldPassword());
    }

    @Test
    void testSetNewPassword() {
        // Arrange
        ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO();
        String newPassword = "newPassword";

        // Act
        resetPasswordDTO.setNewPassword(newPassword);

        // Assert
        Assert.assertEquals(newPassword, resetPasswordDTO.getNewPassword());
    }
}
