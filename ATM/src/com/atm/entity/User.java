package com.atm.entity;

//This is a template that defines a user and its details
//Also called POJO -> Plain Old Java Object or simply an entity
//This represents a user
public class User {
	private long userId;
	private String firstName;
	private String lastName;
	private String cardNo;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(long userId, String firstName, String lastName, String cardNo, String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardNo = cardNo;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", cardNo=" + cardNo
				+ ", password=" + password + "]";
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
