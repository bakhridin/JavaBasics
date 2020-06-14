package com.syntax.class19;

public class Recap {
	
	Recap(){
		System.out.println("constructor with non argument");
		
	}
	Recap(int num){
		System.out.println("Constructor with 1 parameter");
		
	}
	
	public static void main(String[] args) {
		
		Recap obj=new Recap();
		
		Recap obj1=new Recap(2);
	}

}
