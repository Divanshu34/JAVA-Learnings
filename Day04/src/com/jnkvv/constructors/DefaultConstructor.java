package com.jnkvv.constructors;

public class DefaultConstructor {
	public DefaultConstructor() {
		System.out.println("Constructor is called");
	}
	
	void someFunction() {
		System.out.println("some fn is called");
	}
	
	void anotherFn() {
		System.out.println("another fn is called");
	}

	public static void main(String[] args) {
		DefaultConstructor df = new DefaultConstructor();
		df.someFunction();
		df.anotherFn();

	}

}
