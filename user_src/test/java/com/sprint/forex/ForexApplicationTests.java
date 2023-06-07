package com.sprint.forex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprint.forex.entity.Users;
import com.sprint.forex.exception.InvalidInputException;
import com.sprint.forex.repository.UsersRepository;
import com.sprint.forex.service.UsersServiceImpl;

@SpringBootTest
class ForexApplicationTests {
    @Mock
    private UsersRepository usersRepository;

    @InjectMocks
    private UsersServiceImpl usersService;

    @Test
     void testResetPassword() throws InvalidInputException {
        String email = "test@example.com";
        String password = "oldPassword";
        String newPassword = "newPassword";

        Users user = new Users();
        user.setEmail(email);
        user.setPassword(password);

        when(usersRepository.findByEmail(email)).thenReturn(Optional.of(user));

        String result = usersService.resetPassword(email, password, newPassword);

        assertEquals("Password reset successfully", result);
        assertEquals(newPassword, user.getPassword());

        verify(usersRepository, times(1)).findByEmail(email);
        verify(usersRepository, times(1)).save(user);
    }
    
    
    
}


	

