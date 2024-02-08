package com.jnkvv.arrays;

public class Test {

	public static int sum(int a, int b) {
		//int a = n = 10;
		//int b = m = 5;
		//copy by value;
		a = 50;
		return a+b;
	}
	
	public static int sum(Employee a, Employee b) {
		//Emp a = x;
		//Emp b = y;
		//Copy by reference
		a.empId = 50;
		return a.empId + b.empId;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int m = 5;
		int s = sum(n,m);
		System.out.println(n+" "+m);
		Employee x = new Employee();
		Employee y = new Employee();
		x.empId =10;
		y.empId = 15;
		
		sum(x, y);
		System.out.println(x.empId);
		
		
		
		Employee e1 = new Employee();
		
		int x1 = 10;
		
		int [] arr = new int[5];
		
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee();
		empArr[1] = new Employee();
		empArr[2] = new Employee();
		
		
		Employee a1 = null;
		Employee a2 = null;;
		Employee a3 = null;
		Employee [] empArr1 = {a1, a2, a3};
		
		empArr1[0] = new Employee();
		
		
		
		

	}

}
