package com.jnkvv.getters_and_setters;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
//		person.gender; => cannot access as it is private
		
		
//		person.gender = "Male";
		person1.setGender("Male");
		person2.setGender("Female");
		
		Employee employee = new Employee();
		employee.setMobileNo("9479308616");
		
		System.out.println(employee.getMobileNo());

		System.out.println(person1.getGender());
		System.out.println(person2.getGender());
		
		System.out.println(person1 instanceof Person);
		System.out.println(person1 instanceof Employee);
	}

}
