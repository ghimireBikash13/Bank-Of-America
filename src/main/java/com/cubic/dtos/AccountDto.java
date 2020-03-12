package com.cubic.dtos;

public class AccountDto {

	private String customerUuid;
	private String accountType;
	private String amountDeposited;
	private String accountCreated;
	private String accountNo;
	private String routingNo;

	public String getCustomerUuid() {
		return customerUuid;
	}

	public void setCustomerUuid(String customerUuid) {
		this.customerUuid = customerUuid;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAmountDeposited() {
		return amountDeposited;
	}

	public void setAmountDeposited(String amountDeposited) {
		this.amountDeposited = amountDeposited;
	}

	public String getAccountCreated() {
		return accountCreated;
	}

	public void setAccountCreated(String accountCreated) {
		this.accountCreated = accountCreated;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getRoutingNo() {
		return routingNo;
	}

	public void setRoutingNo(String routingNo) {
		this.routingNo = routingNo;
	}

}
