package com.jnkvv.constructors;

public class ParameterizedConstructor {
	
	int field1;
	int field2;
	String field3;

	//default constructor
	public ParameterizedConstructor() {
		System.out.println("def ctor is called");
		this.field1 = 10;
		this.field2 = 20;
		this.field3 = "Suraj";
	}
	
	public ParameterizedConstructor(int field1, int field2, String field3) {
		System.out.println("para ctor is called");
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor pc1 = new ParameterizedConstructor();
		System.out.println(pc1.field1+" "+pc1.field2+" "+pc1.field3);
		ParameterizedConstructor pc2 = new ParameterizedConstructor(2,3,"Ashish");
		System.out.println(pc2.field1+" "+pc2.field2+" "+pc2.field3);
	}

}
