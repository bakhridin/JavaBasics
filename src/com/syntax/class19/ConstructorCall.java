package com.syntax.class19;

public class ConstructorCall {
	
	public ConstructorCall() {
		System.out.println("I am non argument constructor");
	}
	
	public ConstructorCall(String str) {
		this();
		System.out.println("I am with 1 String argument constructor "+str);
		
	}
	public ConstructorCall(String str,String str1) {
		this("Hello");
		System.out.println("I am with 2 String argument constructor "+str+" "+str1);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//creating object by passing 1 string value
		ConstructorCall obj=new ConstructorCall("Java");
		
		System.out.println("---------------------------------------------------");
		
		//creating object by passing 2 String values
		ConstructorCall obj1=new ConstructorCall("Good","Love");
	}

}
