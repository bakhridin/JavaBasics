package com.syntax.class34;

public class TaskClass {

	public static void main(String[] args) {
		
		ageEligible(16);
		

	}
	
	public static void ageEligible(int age) {
		
		if(age<18) {
			throw new RuntimeException("You are not allow to get DL");
		}
		else {
			System.out.println("You can get DL");
		}
	}

}
