package com.bank.entity;

public class User {
	private long userId;
	private String firstName;
	private String lastName;
	private int pin;
	private String cardNo;
	private double availableBalance;
	
	public User(long userId, String firstName, String lastName, int pin, String cardNo, double availableBalance) {
		this.userId = userId;
		this.availableBalance = availableBalance;
		this.cardNo = cardNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pin = pin;
	}
	
	public User() {}
	
	//setter of userId
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	//getter of userId
	public long getUserId() {
		return this.userId;
	}
	
	//setter of availableBalance
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	//getter of availableBalance
	public double getAvailableBalance() {
		return this.availableBalance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	
	
	

}
