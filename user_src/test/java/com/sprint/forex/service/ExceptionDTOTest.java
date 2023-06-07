package com.sprint.forex.service;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.sprint.forex.dto.ExceptionDTO;

 class ExceptionDTOTest {

    @Test
     void testConstructorAndGetters() {
        // Arrange
        ExceptionDTO exceptionDTO = new ExceptionDTO("Error occurred");

        // Assert
        Assert.assertFalse(exceptionDTO.isSuccess());
        Assert.assertEquals("Error occurred", exceptionDTO.getMessage());
    }

    @Test
    void testSetters() {
        // Arrange
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        // Act
        exceptionDTO.setSuccess(true);
        exceptionDTO.setMessage("Success");

        // Assert
        Assert.assertTrue(exceptionDTO.isSuccess());
        Assert.assertEquals("Success", exceptionDTO.getMessage());
    }
}
