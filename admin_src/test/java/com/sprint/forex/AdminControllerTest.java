package com.sprint.forex;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sprint.forex.controller.AdminController;
import com.sprint.forex.dto.AdminDto;
import com.sprint.forex.dto.AdminLoginDto;
import com.sprint.forex.dto.CommonDTO;
import com.sprint.forex.dto.ExchangeRateDto;
import com.sprint.forex.entity.Admin;
import com.sprint.forex.service.AdminAuthenticationService;
import com.sprint.forex.service.AdminService;
import com.sprint.forex.service.ExchangeRateService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
 class AdminControllerTest {

    @Mock
    private AdminAuthenticationService adminAuthenticationService;

    @Mock
    private AdminService adminService;

    @Mock
    private ExchangeRateService exchangeRateService;


    @InjectMocks
    private AdminController adminController;

    @Test
     void testAddAdmin() {
        AdminDto adminDto = new AdminDto();
        adminDto.setAdminId(1);
        adminDto.setAdminName("Aditi");
        adminDto.setAdminUsername("ad123");
        adminDto.setAdminPassword("ad@123");

        when(adminService.saveAdmin(any(AdminDto.class))).thenReturn(adminDto);

        ResponseEntity<CommonDTO<AdminDto>> responseEntity = adminController.addAdmin(adminDto);

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals("Successfully admin created", responseEntity.getBody().getMessage());
        assertEquals(adminDto, responseEntity.getBody().getData());
    }

    @Test
     void testAdminLogin() {
        AdminLoginDto adminLoginDto = new AdminLoginDto();
        adminLoginDto.setAdminUsername("ad123");
        adminLoginDto.setAdminPassword("ad@123");

        Admin admin = new Admin();
        admin.setAdminId(1);
        admin.setAdminName("Aditi");
        admin.setAdminUsername("ad123");
        admin.setAdminPassword("ad@123");

        when(adminAuthenticationService.doLogin("ad123", "ad@123")).thenReturn(admin);

        ResponseEntity<CommonDTO<Admin>> responseEntity = adminController.adminLogin(adminLoginDto);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals("Success", responseEntity.getBody().getMessage());
        assertEquals(admin, responseEntity.getBody().getData());
    }

    @Test
     void testAddExchangeRate() {
        ExchangeRateDto exchangeRateDto = new ExchangeRateDto();
        exchangeRateDto.setId(1);
        exchangeRateDto.setFromCurrency("USD");
        exchangeRateDto.setToCurrency("EUR");
        exchangeRateDto.setRate(0.85);

        when(adminService.saveExchangeRate(any(ExchangeRateDto.class))).thenReturn(exchangeRateDto);

        ResponseEntity<ExchangeRateDto> responseEntity = adminController.addExchangeRate(exchangeRateDto);

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals(exchangeRateDto, responseEntity.getBody());
    }
}
