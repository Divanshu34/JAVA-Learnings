package com.jnkvv.cars;

public class Test {

	public static void main(String[] args) {
		int x = 10;
		//int -> primitive datatype
		//classes -> user-defined datatype
		
		//bolero khareed li
		Car bolero = new Car();
		//bolero -> reference
		bolero.brakes = "Han bhai brake lagte hain";
		boolean b = bolero.braking(bolero.brakes);
		System.out.println(b);
		System.out.println(bolero.brakes);
	}
}
