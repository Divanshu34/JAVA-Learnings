package com.atm.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.atm.entity.User;

public class UserDAO {

	private static List<User> users = new ArrayList<>();

	static {
		Collections.addAll(users, new User(1, "Divanshu", "Jain", "12345678", "Dev@1"),
				new User(2, "Ashish", "Jain", "98765432", "Dev@1"), 
				new User(3, "Dev", "Jain", "64783973", "Dev@1"),
				new User(4, "Suraj", "Raghuwanshi", "35728974", "Dev@1"));
	}

	public User getUserById(long id) {
		User user = null;
		for (User u : users) {
			if (u.getUserId() == id) {
				user = u;
			}
		}
		return user;
	}

	public User getUserByCardNoAndPassword(String cardNo, String password) {
		User user = null;
		for (User u : users) {
			if (u.getCardNo().equals(cardNo) && u.getPassword().equals(password)) {
				user = u;
			}
		}

		return user;
	}
}
