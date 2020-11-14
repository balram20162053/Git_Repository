package com.ofss;

public class MyClass extends MyCalculator{
	public  void m1()
	{
		System.out.println("Welcome to Java");
	}

	public int m2()
	{
		System.out.println("Welcome to Java");
		return 25;
	}
	public int  add(int no1,int no2,int no3) {
		return no1+no2+no3;
	}
	public static void main(String[] args) {
	
		System.out.println("Starting the main method");
		
		MyClass obj1=new MyClass();
		obj1.m1();
		obj1.m2();
		System.out.println("Sum of two number is "+obj1.add(4,5,6));
		
		System.out.println("Ending the main method");
	}

}
