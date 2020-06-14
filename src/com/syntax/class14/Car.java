package com.syntax.class14;

public class Car {
	
	
	String make;
	String model;
	String color;
	int year;
	
	void  drive(){
		System.out.println(make+" can drive");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.make="BMW";
		car1.model="m5";
		car1.color="White";
		car1.year=2020;
		car1.drive();
		
	System.out.println("My car is "+car1.make+" "+car1.model+" "+car1.color+" "+car1.year);

	}

}
