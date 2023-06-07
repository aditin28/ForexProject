package com.sprint.forex.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Assert;

 

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

 

import com.sprint.forex.dto.UsersDto;
import com.sprint.forex.entity.Users;
import com.sprint.forex.exception.InvalidInputException;
import com.sprint.forex.exception.UsersNotFoundException;
import com.sprint.forex.repository.UsersRepository;

 

class UsersServiceImplTest {

 

    @Mock
    private UsersRepository usersRepository;

 

    @InjectMocks
    private UsersServiceImpl usersService;

 

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

 

    @Test
    void getAllUsers_WithExistingUsers_ReturnsListOfUsers() {
        // Arrange
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users());
        usersList.add(new Users());
        when(usersRepository.findAll()).thenReturn(usersList);

 

        // Act
        List<Users> result = usersService.getAllUsers();

 

        // Assert
        assertEquals(2, result.size());
    }

 

    @Test
    void getUsersById_WithExistingUsers_ReturnsUsers() throws UsersNotFoundException {
        // Arrange
        int userId = 1;
        Users users = new Users();
        when(usersRepository.findById(userId)).thenReturn(Optional.of(users));

 

        // Act
        Users result = usersService.getUsersById(userId);

 

        // Assert
        assertEquals(users, result);
    }

 

    @Test
    void getUsersById_WithNonExistingUsers_ThrowsUsersNotFoundException() {
        // Arrange
        int userId = 1;
        when(usersRepository.findById(userId)).thenReturn(Optional.empty());

 

        // Act & Assert
        assertThrows(UsersNotFoundException.class, () -> usersService.getUsersById(userId));
    }

 

    @Test
    void saveUsers_WithValidUsersDto_ReturnsSavedUsersDto() {
        // Arrange
        UsersDto usersDto = new UsersDto();
        usersDto.setName("John Doe");
        usersDto.setLocation("New York");
        // Set other properties of the usersDto

 

        Users savedUsers = new Users();
        savedUsers.setUsersId(1); // Set the ID of the saved users
        when(usersRepository.save(any(Users.class))).thenReturn(savedUsers);

 

        // Act
        UsersDto result = usersService.saveUsers(usersDto);

 

        // Assert
        assertEquals(savedUsers.getUsersId(), result.getUsersId());
        // Assert other properties of the result
    }

 

    @Test
    void deleteUsers_WithExistingUsers_DeletesUsers() throws UsersNotFoundException {
        // Arrange
        int userId = 1;
        when(usersRepository.findById(userId)).thenReturn(Optional.of(new Users()));

 

        // Act
        usersService.deleteUsers(userId);

 

        // Assert
        verify(usersRepository).deleteById(userId);
    }

 

    @Test
    void deleteUsers_WithNonExistingUsers_ThrowsUsersNotFoundException() {
        // Arrange
        int userId = 1;
        when(usersRepository.findById(userId)).thenReturn(Optional.empty());

 

        // Act & Assert
        assertThrows(UsersNotFoundException.class, () -> usersService.deleteUsers(userId));
    }
    @Test
  void testDeleteUsersExistingId() throws UsersNotFoundException {
        int userId = 1;
        
        Mockito.when(usersRepository.findById(userId)).thenReturn(Optional.of(new Users()));
        
        usersService.deleteUsers(userId);
        
        Mockito.verify(usersRepository, Mockito.times(1)).deleteById(userId);
    }
   
    
    
    


        @Test
        void testGetAllUsers() {
            // Arrange
            List<Users> usersList = new ArrayList<>();
            usersList.add(new Users());
            usersList.add(new Users());
            when(usersRepository.findAll()).thenReturn(usersList);

            // Act
            List<Users> result = usersService.getAllUsers();

            // Assert
            Assert.assertEquals(usersList, result);
            verify(usersRepository, times(1)).findAll();
        }

        @Test
        void testGetUsersById() throws UsersNotFoundException {
            // Arrange
            int userId = 1;
            Users user = new Users();
            user.setUsersId(userId);
            Optional<Users> optionalUser = Optional.of(user);
            when(usersRepository.findById(userId)).thenReturn(optionalUser);

            // Act
            Users result = usersService.getUsersById(userId);

            // Assert
            Assert.assertEquals(user, result);
            verify(usersRepository, times(1)).findById(userId);
        }


        @Test
      void testSaveUsers() {
            // Arrange
            UsersDto usersDto = new UsersDto();
            usersDto.setName("John Doe");
            usersDto.setLocation("New York");
            usersDto.setGender("Male");
            usersDto.setEmail("john.doe@example.com");
            usersDto.setPassword("password123");
            Users savedUsers = new Users();
            savedUsers.setUsersId(1);
            when(usersRepository.save(any(Users.class))).thenReturn(savedUsers);

            // Act
            UsersDto result = usersService.saveUsers(usersDto);

            // Assert
            Assert.assertEquals(savedUsers.getUsersId(), result.getUsersId());
            verify(usersRepository, times(1)).save(any(Users.class));
        }

        @Test
       void testDeleteUsers() throws UsersNotFoundException {
            // Arrange
            int userId = 1;
            Users user = new Users();
            user.setUsersId(userId);
            Optional<Users> optionalUser = Optional.of(user);
            when(usersRepository.findById(userId)).thenReturn(optionalUser);

            // Act
            usersService.deleteUsers(userId);

            // Assert
            verify(usersRepository, times(1)).deleteById(userId);
        }


}    