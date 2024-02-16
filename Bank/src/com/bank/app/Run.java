package com.bank.app;

import java.util.Scanner;

import com.bank.dao.UserDAO;

public class Run {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to XYZ ATM");
		System.out.println("---------*********---------");
		System.out.println("Please enter your card number below");
		String cardNo = s.next();
		boolean isCardNoPresent = userDAO.verifyCardNumber(cardNo);
		
		
		
		
		

	}

}
