package com.syntax.class14;

public class Phone {
	
	String make;
	String model;
	String color;
	int size;
	
	void ring(){
		System.out.println(make+" "+"ringing on time ");
	}
	void speak() {
		System.out.println( "The"+" "+make+" "+model+" "+"speaking is clear");
	}
	
	
	
	

	public static void main(String[] args) {
		// Create a Class “Phone”. Create 3 Objects of it: iPhone,
		//Android, Nokia with specific  attributes and behaviors.
       Phone ip=new Phone();
       ip.make="Iphone";
       ip.model="S";
       ip.color="Black";
       ip.size=11;
       
       ip.ring();
       ip.speak();
	}

}
