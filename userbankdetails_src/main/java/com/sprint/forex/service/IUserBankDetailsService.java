package com.sprint.forex.service;

import java.util.List;

import com.sprint.forex.dto.APIResponsedto;
import com.sprint.forex.dto.UserBankDetailsDto;
import com.sprint.forex.entity.UserBankDetails;

public interface IUserBankDetailsService
{
	

	public APIResponsedto saveBankDetails(UserBankDetailsDto bankDto) ;
	public UserBankDetailsDto updateBankDetails(UserBankDetailsDto bankDto) ;

	
	public List<UserBankDetails> getAllBankDetails();

	public UserBankDetails findByUserId(int userId);
	
}