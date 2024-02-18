package com.bank.app;

import java.util.Scanner;

import com.bank.dao.UserDAO;
import com.bank.entity.User;

public class Run {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to XYZ ATM");
		System.out.println("---------*********---------");
		System.out.println("Please enter your card number below");
		String cardNo = s.next();
		boolean isCardNoPresent = userDAO.verifyCardNumber(cardNo);
		
		while(isCardNoPresent == false) {
			System.out.println("Wrong credentials!!!\n"
					+ "Re-enter your card number!!!");
			cardNo = s.next();
			isCardNoPresent =  userDAO.verifyCardNumber(cardNo);	
		}
		
//		for(;isCardNoPresent == false;) {
//			//code
//			System.out.println("Wrong credentials!!!\n"
//					+ "Re-enter your card number!!!");
//			cardNo = s.next();
//			isCardNoPresent =  userDAO.verifyCardNumber(cardNo);
//			
//		}
		
		//if isCardNoPresent == true
		System.out.println("Please enter your 4-digit pin");
		int pin = s.nextInt();
		User user = userDAO.findByCardNoAndPin(cardNo, pin);
		
		
		
		
		
		
		

	}

}
