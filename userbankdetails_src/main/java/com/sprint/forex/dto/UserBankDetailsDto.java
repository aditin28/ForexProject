package com.sprint.forex.dto;



public class UserBankDetailsDto {
	 private int userBankId;
	 private String accountHolderName;
	 private String bankName;
	 private String ifscCode;
	 private Long accountNumber;
	 private String contactNumber;
	 private int userId;
	public int getUserBankId() {
		return userBankId;
	}
	public void setUserBankId(int userBankId) {
		this.userBankId = userBankId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long i) {
		this.accountNumber = i;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	 
	 

}
