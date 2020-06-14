package com.syntax.class15;

public class Task {
	//Create a method that will take 2 parameters as a numbers
	//and prints which number is larger.
	 void large(int a, int b)
	 {
		 if(a>b) {
			 System.out.println("The larger is "+a);
		 }else {
			 System.out.println("The larger is "+b);
		 }
	 }	
	 
	 //Create a method that will take a number and prints whether
	 //the number is even or odd
	 void num(int a) {
		 if(a%2==0) {
			 System.out.println(a+" Is even");
		 }else {
			 System.out.println(a+" Is odd");
		 }
	 }
	
	 
	 
	 
	 //Create a method that will print whether
	 //given String is palindrome or not.
	
	 
	 

	public static void main(String[] args) {
		
	   Task bigNum=new Task();
	   bigNum.large(10, 5);
	   bigNum.large(1, 5);
	   
	   bigNum.num(10);
	   bigNum.num(5);

	}

}
