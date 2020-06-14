package com.syntax.class18;

//Write a program that will have a constructor: one with parameters and second without any parameters. 
//Create a separate Test class where you will execute both of the constructors.

public class Task {
	
	Task(){
		System.out.println("I am wtihout parameter constructor");
	}
	Task(String name,int num){
		System.out.println("I vave parameters "+name+"&"+num);
		
	}
	Task(String str,String name){
		System.out.println("I don't know who Iam but i have 2 String parameters "+str+" "+name);
	}
	
	public static void main(String[] args) {
		
	    	new Task();
	    	new Task("Mark",33);
	    	
	    	new Task("Good","Bye");
	    	
	}

}
