package com.syntax.class20;

public class Employee {
	public static String company;
	protected int empNumber;
	        double salary;
	private long ssn;
	
	static void work() {
		System.out.println("Employee.... "+company);
	}
	void getPaid() {
		System.out.println("Employee.. "+salary);
	}

}
