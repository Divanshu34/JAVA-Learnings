package com.bank.dao;

import java.util.ArrayList;
import java.util.List;

import com.bank.entity.User;

public class UserDAO {
//	private static User u1 = new User(1, "Divanshu", "Jain", 1234, "987654321", 5000.69);
//	private static User u2 = new User(2, "Ashish", "Jain", 1234, "123456789", 10000.69);
//	private static User u3 = new User(3, "Dev", "Jain", 1234, "365756935", 2357.69);
//	private static User u4 = new User(4, "Suraj", "Raghuwanshi", 1234, "537547461", 67890.69);
//	
//	private static User[] users = new User[4];
//	
//	static {
//		users[0] = u1;
//		users[1] = u2;
//		users[2] = u3;
//		users[3] = u4;
//	}

//	public static User[] users = { 
//			new User(1, "Divanshu", "Jain", 1234, "987654321", 5000.69),
//			new User(2, "Ashish", "Jain", 1234, "123456789", 10000.69),
//			new User(3, "Dev", "Jain", 1234, "365756935", 2357.69),
//			new User(4, "Suraj", "Raghuwanshi", 1234, "537547461", 67890.69) 
//	};
	
	public static List<User> users = new ArrayList<>();
	//static initialiser block
	static {
		users.add(new User(1, "Divanshu", "Jain", 1234, "987654321", 5000.69));
		users.add(new User(2, "Ashish", "Jain", 1234, "123456789", 10000.69));
		users.add(new User(3, "Dev", "Jain", 1234, "365756935", 2357.69));
		users.add(new User(4, "Suraj", "Raghuwanshi", 1234, "537547461", 67890.69));
	}
	
	public User verifyCardNumber(String cardNo) {
		//cardNo = 537547461
		User user = null;
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getCardNo().equals(cardNo)) {
				user = users.get(i);
				return user;
			}
		}
		return user;
	}
	
	public User findByCardNoAndPin(String cardNo, int pin, User user) {
//		User user = null;
		if(user.getCardNo().equals(cardNo) && user.getPin() == pin) {
			return user;
		}
		user = null;
		return user;
		
//		for(int i = 0; i < users.size(); i++) {
//			if(users.get(i).getCardNo().equals(cardNo) && users.get(i).getPin() == pin) {
//				user = users.get(i);
//				return user;
////				break;
//			}
//		}
		
//		return user;
	}
	
	
//	static List<Integer> list = new ArrayList<>();
//	static {
//		//	list[0] = 1;
//		list.add(1);
//		list.add(10); //=> list.set(1,10)
//		list.add(50);
////		list.set(10, 99);
//		
//	}
	
	
	

}

//class Test {
//	public static void main(String[] args) {
////		UserDAO u1 = new UserDAO();
////		UserDAO u2 = new UserDAO();
//
////		u1.y = 15;
////		u2.y = 20;
////		u1.x = 25;
////		u2.x = 30;
////		System.out.println(u1.y); //=> 15
////		System.out.println(u2.y); // => 20
////		System.out.println(u1.x); //=> 25
////		System.out.println(u2.x); // => 30
////		System.out.println(UserDAO.x);
//		
////		for(int i = 0; i < UserDAO.list.size(); i++) {
////			System.out.println(UserDAO.list.get(i));
////		}
//		
//
//	}
//}
