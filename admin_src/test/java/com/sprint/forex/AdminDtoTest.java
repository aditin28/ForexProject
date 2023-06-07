package com.sprint.forex;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.AdminDto;

class AdminDtoTest {

    @Test
    void setAdminId_ValidAdminId_SetsAdminId() {
        // Arrange
        AdminDto adminDto = new AdminDto();
        int adminId = 1;

        // Act
        adminDto.setAdminId(adminId);

        // Assert
        assertEquals(adminId, adminDto.getAdminId());
    }

    @Test
    void setAdminName_ValidAdminName_SetsAdminName() {
        // Arrange
        AdminDto adminDto = new AdminDto();
        String adminName = "John Doe";

        // Act
        adminDto.setAdminName(adminName);

        // Assert
        assertEquals(adminName, adminDto.getAdminName());
    }

    @Test
    void setAdminEmail_ValidAdminEmail_SetsAdminEmail() {
        // Arrange
        AdminDto adminDto = new AdminDto();
        String adminEmail = "admin@example.com";

        // Act
        adminDto.setAdminEmail(adminEmail);

        // Assert
        assertEquals(adminEmail, adminDto.getAdminEmail());
    }

    @Test
    void setAdminUsername_ValidAdminUsername_SetsAdminUsername() {
        // Arrange
        AdminDto adminDto = new AdminDto();
        String adminUsername = "admin";

        // Act
        adminDto.setAdminUsername(adminUsername);

        // Assert
        assertEquals(adminUsername, adminDto.getAdminUsername());
    }

    @Test
    void setAdminPassword_ValidAdminPassword_SetsAdminPassword() {
        // Arrange
        AdminDto adminDto = new AdminDto();
        String adminPassword = "password123";

        // Act
        adminDto.setAdminPassword(adminPassword);

        // Assert
        assertEquals(adminPassword, adminDto.getAdminPassword());
    }
}
