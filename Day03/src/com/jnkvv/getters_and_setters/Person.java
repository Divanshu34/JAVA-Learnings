package com.jnkvv.getters_and_setters;


//Pascal Casing Naming convention => HomoSapiens => Class, Interface, Enums
//Camel casing convention => isValid => variables, functions/methods
public class Person {
	private int age;
	private String firstName;
	private String lastName;
	private String aadharNo;
	private String mobileNo;
	private String gender;
	
	
	
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
	
	public String getAadharNo() {
		return aadharNo;
	}
	
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	//getter of gender
	public String getGender() {
		return this.gender;
	}
	
	//setter of gender
	public void setGender(String gender) {//gender = "Male"
		this.gender = gender;
		//this.gender -> person1.gender
		//this.gender -> person2.gender
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toLowerCase(String s) {
        int n = s.length();
        char[] charArr = s.toCharArray();
        //|H|e|l|l|o|
        //s = "Hello"
        for(int i = 0; i < n; i++){
            char ch = charArr[i];
            if(ch >= 'A' || ch <= 'Z'){
                ch = (char) (ch + 32);
            }
            //|h|e|l|l|o|
        }
        
        s = new String(charArr);
        return s;
    }
	
	
}
