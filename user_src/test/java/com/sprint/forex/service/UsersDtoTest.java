package com.sprint.forex.service;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.ForgotPassDTO;
import com.sprint.forex.dto.UsersDto;
import com.sprint.forex.entity.Users;

 class UsersDtoTest {

    @Test
    void testGettersAndSetters() {
        // Arrange
        UsersDto usersDto = new UsersDto();

        // Act
        usersDto.setUsersId(1);
        usersDto.setName("John Doe");
        usersDto.setLocation("New York");
        usersDto.setGender("Male");
        usersDto.setEmail("john.doe@example.com");
        usersDto.setPassword("password");
        usersDto.setMobileNo("1234567890");

        // Assert
        Assert.assertEquals(1, usersDto.getUsersId());
        Assert.assertEquals("John Doe", usersDto.getName());
        Assert.assertEquals("New York", usersDto.getLocation());
        Assert.assertEquals("Male", usersDto.getGender());
        Assert.assertEquals("john.doe@example.com", usersDto.getEmail());
        Assert.assertEquals("password", usersDto.getPassword());
        Assert.assertEquals("1234567890", usersDto.getMobileNo());
    }
    @Test
     void testGettersAndSetters1() {
        // Arrange
        Users users = new Users();

        // Act
        users.setUsersId(1);
        users.setName("John Doe");
        users.setLocation("New York");
        users.setGender("Male");
        users.setEmail("john.doe@example.com");
        users.setPassword("password123");

        // Assert
        Assert.assertEquals(1, users.getUsersId());
        Assert.assertEquals("John Doe", users.getName());
        Assert.assertEquals("New York", users.getLocation());
        Assert.assertEquals("Male", users.getGender());
        Assert.assertEquals("john.doe@example.com", users.getEmail());
        Assert.assertEquals("password123", users.getPassword());
    }
    
   
   

        @Test
        void testConstructorAndGetters() {
            // Arrange
            String email = "john.doe@example.com";
            String password = "newPassword";
            String otp = "123456";
            
            // Act
            ForgotPassDTO forgotPassDTO = new ForgotPassDTO(email, password, otp);

            // Assert
            Assert.assertEquals(email, forgotPassDTO.getEmail());
            Assert.assertEquals(password, forgotPassDTO.getPassword());
            Assert.assertEquals(otp, forgotPassDTO.getOtp());
        }

        @Test
         void testSetters() {
            // Arrange
            ForgotPassDTO forgotPassDTO = new ForgotPassDTO();
            String email = "john.doe@example.com";
            String password = "newPassword";
            String otp = "123456";

            // Act
            forgotPassDTO.setEmail(email);
            forgotPassDTO.setPassword(password);
            forgotPassDTO.setOtp(otp);

            // Assert
            Assert.assertEquals(email, forgotPassDTO.getEmail());
            Assert.assertEquals(password, forgotPassDTO.getPassword());
            Assert.assertEquals(otp, forgotPassDTO.getOtp());
        }
        
        
        
        
      

            @Test
             void testEmptyConstructor() {
                // Arrange & Act
                ForgotPassDTO forgotPassDTO = new ForgotPassDTO();

                // Assert
                Assert.assertNull(forgotPassDTO.getEmail());
                Assert.assertNull(forgotPassDTO.getPassword());
                Assert.assertNull(forgotPassDTO.getOtp());
            }

            @Test
            void testConstructorWithParameters() {
                // Arrange
                String email = "john.doe@example.com";
                String password = "newPassword";
                String otp = "123456";

                // Act
                ForgotPassDTO forgotPassDTO = new ForgotPassDTO(email, password, otp);

                // Assert
                Assert.assertEquals(email, forgotPassDTO.getEmail());
                Assert.assertEquals(password, forgotPassDTO.getPassword());
                Assert.assertEquals(otp, forgotPassDTO.getOtp());
            }

            @Test
           void testSetEmail() {
                // Arrange
                ForgotPassDTO forgotPassDTO = new ForgotPassDTO();
                String email = "john.doe@example.com";

                // Act
                forgotPassDTO.setEmail(email);

                // Assert
                Assert.assertEquals(email, forgotPassDTO.getEmail());
            }

            @Test
             void testSetPassword() {
                // Arrange
                ForgotPassDTO forgotPassDTO = new ForgotPassDTO();
                String password = "newPassword";

                // Act
                forgotPassDTO.setPassword(password);

                // Assert
                Assert.assertEquals(password, forgotPassDTO.getPassword());
            }

            @Test
            void testSetOtp() {
                // Arrange
                ForgotPassDTO forgotPassDTO = new ForgotPassDTO();
                String otp = "123456";

                // Act
                forgotPassDTO.setOtp(otp);

                // Assert
                Assert.assertEquals(otp, forgotPassDTO.getOtp());
            }
        }

    









   

