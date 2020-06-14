package com.syntax.class18;

public class Car {
	String make,model,color;
	int year,door,wheels;
	
	public void printDetails() {
		System.out.println("I have "+year+" "+make+" "+model+" "+" in "+color+" color");
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		car.make="BMW";
		car.model="m5";
		car.color="Black";
		car.year=2020;
		car.door=4;
		car.wheels=4;
		
		car.printDetails();
	}

}
