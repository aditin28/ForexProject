package com.sprint.forex.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class APIResponsedto {
	private CommonDTO common;
	private UsersDto user;
	private UserBankDetailsDto userbankdetails;
	public void setUser(UsersDto usersdto) {

		
	}
	public void setUserbankdetails(UserBankDetailsDto bankDto) {

		
	}

}
