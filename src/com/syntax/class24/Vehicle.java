package com.syntax.class24;

public abstract class Vehicle {
	public void drive() {
		System.out.println("Vehicle");
		
	}
	public void stop() {
		System.out.println("Vehicle1");
		
	}
	abstract void start();
	
	abstract void brake();
	
}

 class Bus extends Vehicle{

	@Override
	void start() {
		System.out.println("Bus");
		
	}

	@Override
	void brake() {
		System.out.println("Bus1");
		
	}
	
}
 class SchoolBus extends Bus{
	 
	 public static void main(String[] args) {
//		 Bus bb=new Bus();
//		 bb.brake();
//		 bb.start();
//		 
//		 SchoolBus sb=new SchoolBus();
//		 
		 
		
	}
	 
 }
 
