package com.syntax.class23;

public class Car {
	
	String make;
	
	public Car(String make) {
		this.make=make;
		
	}
	public void display() {
		System.out.println("I have "+make);
	}
	public void start() {
		System.out.println(make+" starts by turning key");
	}
	
}
class BMW extends Car{
	public BMW(String make) {
		super(make);
	}
	
	public void statr() {
		System.out.println(make+" starts by using pushing button");
	}
}
class Mercedes extends Car{
	Mercedes(String make){
		super(make);
}
	
	public void start() {
		System.out.println(make+" starts remotly");
	}
}
class Tesla extends Car{
	Tesla(String make){
		super(make);
 }
	public void start() {
		System.out.println(make+" starts by voice commands");
	}
}
class Honda extends Car{
	Honda(String make){
		super(make);
	}
}

