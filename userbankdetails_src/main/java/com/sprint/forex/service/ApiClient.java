package com.sprint.forex.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.sprint.forex.dto.UsersDto;


@FeignClient(url="http://localhost:8081" , value="USER-SERVICE")
public interface ApiClient {
	@GetMapping("/user/find/{id}")
	UsersDto fetchUsersDetails(@PathVariable("id") int usersId);
}




