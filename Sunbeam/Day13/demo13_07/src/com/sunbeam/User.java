package com.sunbeam;

import java.util.Objects;

public class User implements Comparable<User> {
	private int id;
	private String name;
	private String email;
	private String passwd;
	
	public User() {
	}

	public User(int id, String name, String email, String passwd) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.passwd = passwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", passwd=" + passwd + "]";
	}


	/*
	@Override
	public int hashCode() {
		return this.id * 31;
	}
	
	@Override
	public boolean equals(Object obj) {
		User other = (User) obj;
		if(this.id == other.id)
			return true;
		else
			return false;
	}
	*/
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(User other) {
		return this.id - other.id;
	}	
}








