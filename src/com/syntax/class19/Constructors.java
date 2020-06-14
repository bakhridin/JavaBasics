package com.syntax.class19;

public class Constructors {
	
	Constructors(){
		this(1); // < this() >---> always must be in the 1st line inside the constructor
		//this(1,2); CE this is located in the 2nd line
		System.out.println("Hi");
		
	}
	Constructors(int x){
		this(1,2);
		System.out.println("Hello");
	}
	Constructors(int x,int y){
		System.out.println("How are you");
	}
	
   public static void main(String[] args) {
	
	    Constructors obj=new Constructors();
	    System.out.println("------------------------------");
	    
	    Constructors obj1=new Constructors(1);
	    
	    System.out.println("-----------------------------");
	    
	    Constructors obj2=new Constructors(1,2);
}
}
