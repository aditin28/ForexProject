package com.sprint.forex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.forex.dto.UsersDto;
import com.sprint.forex.entity.Users;
import com.sprint.forex.exception.InvalidInputException;
import com.sprint.forex.exception.UsersNotFoundException;
import com.sprint.forex.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository usersRepository;
	String msg= "Password reset successfully";

	@Override
	public List<Users> getAllUsers() {

		return usersRepository.findAll();
	}
//	

	@Override
	public Users getUsersById(int usersId) throws UsersNotFoundException {
		Optional<Users> optionalUsers = usersRepository.findById(usersId);
		if (optionalUsers.isEmpty()) {
			throw new UsersNotFoundException("Users Not Found with id: " + usersId);
		}
		return optionalUsers.get();
		
	}

//	
	@Override
	public UsersDto saveUsers(UsersDto usersDto) {

		Users users = new Users();

		users.setName(usersDto.getName());
		users.setLocation(usersDto.getLocation());
		users.setGender(usersDto.getGender());
		users.setEmail(usersDto.getEmail());
		users.setPassword(usersDto.getPassword());
		
		Users newUsers = usersRepository.save(users);
		usersDto.setUsersId(newUsers.getUsersId());
		return usersDto;
	}

	@Override
	public void deleteUsers(int usersId) throws UsersNotFoundException {
		Optional<Users> optionalUsers = usersRepository.findById(usersId);
		if (optionalUsers.isEmpty()) {
			throw new UsersNotFoundException("Users not existing with id:" + usersId);
		}
		usersRepository.deleteById(usersId);
	}

	@Override
	public String resetPassword(String email, String password, String newPassword) throws InvalidInputException {
		Optional<Users> loginObj = usersRepository.findByEmail(email);
		String s = "";
		if (loginObj.isPresent()) {
			if (loginObj.get().getPassword().equals(password)) {
				Users users = loginObj.get();
				users.setPassword(newPassword);
				usersRepository.save(users);
				return msg;
			}
			else {
				s="enter valid password";
				}
		} else {
			s = msg;
		}
		
				return s;
	}

	@Override
	public String resetForgotPassword(String email, String newPassword, String confirmPassword)  {//throws InvalidInputException
		Optional<Users> loginObj= usersRepository.findByEmail(email);
		String s="";
		if(loginObj.isPresent()) {
			if(newPassword.equals(confirmPassword)) {
				Users users = loginObj.get();
				users.setPassword(newPassword);
				usersRepository.save(users);
				return msg;
			}
			else {
				s="password not match";
				}
			}
		else {
			s="enter valid email";
			}
		
		return s;
	}
}
