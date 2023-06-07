package com.sprint.forex.service;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.LoginDto;
import com.sprint.forex.dto.SendOtpDTO;

class LoginDtoTest {

    @Test
    void testGetEmail() {
        // Arrange
        LoginDto loginDto = new LoginDto();
        String email = "john.doe@example.com";
        loginDto.setEmail(email);

        // Act
        String result = loginDto.getEmail();

        // Assert
        Assert.assertEquals(email, result);
    }

    @Test
    void testSetEmail() {
        // Arrange
        LoginDto loginDto = new LoginDto();
        String email = "john.doe@example.com";

        // Act
        loginDto.setEmail(email);

        // Assert
        Assert.assertEquals(email, loginDto.getEmail());
    }

    @Test
    void testGetPassword() {
        // Arrange
        LoginDto loginDto = new LoginDto();
        String password = "password";
        loginDto.setPassword(password);

        // Act
        String result = loginDto.getPassword();

        // Assert
        Assert.assertEquals(password, result);
    }

    @Test
    void testSetPassword() {
        // Arrange
        LoginDto loginDto = new LoginDto();
        String password = "password";

        // Act
        loginDto.setPassword(password);

        // Assert
        Assert.assertEquals(password, loginDto.getPassword());
    }
    
        @Test
         void testGetEmail1() {
            // Arrange
            SendOtpDTO sendOtpDTO = new SendOtpDTO();
            String email = "john.doe@example.com";
            sendOtpDTO.setEmail(email);

            // Act
            String result = sendOtpDTO.getEmail();

            // Assert
            Assert.assertEquals(email, result);
        }

        @Test
         void testSetEmail1() {
            // Arrange
            SendOtpDTO sendOtpDTO = new SendOtpDTO();
            String email = "john.doe@example.com";

            // Act
            sendOtpDTO.setEmail(email);

            // Assert
            Assert.assertEquals(email, sendOtpDTO.getEmail());
        }
    }


