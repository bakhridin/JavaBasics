package com.syntax.class18;

public class ConstructorDemo {
	static String str="Hello";
	
	ConstructorDemo(){
		System.out.println("I am default constructor");
		System.out.println("I am non argument constructor");
	}
	public ConstructorDemo(String str) {
		System.out.println("I am public constructor with 1 String parameter "+str);
	}
	protected ConstructorDemo(int num) {
		System.out.println("I am protected constructor with 1 integer value "+num);
	}
	private ConstructorDemo(String str, int num) {
		System.out.println("I am private constructor with String and integer values "+str+" and "+num);
	}
	void ConstructorDemo() {
		System.out.println("I am not constructor i am method because i have return type ");
	}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(str);
		
		ConstructorDemo obj =new ConstructorDemo();
		
		ConstructorDemo obj1= new ConstructorDemo("Hello");
		
		ConstructorDemo obj2=new ConstructorDemo(20);
		
		ConstructorDemo obj3=new ConstructorDemo("Good",100);
		
		///////////////////////////////////////////////////////
		obj.ConstructorDemo();
		
	}
}
