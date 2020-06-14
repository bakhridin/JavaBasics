package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all integer elements in an array
		
      System.out.println("-----using regular for loop----");
	int[] numbers= {10,20,30,40,};	
	
	int num=0;
	
	for(int i=0;i<numbers.length; i++) {
		num+=numbers[i];
		
	}
	System.out.println("The total is "+num);
	
	     System.out.println("-------using advanced loop---------");
    int num1=0;
	
	for(int i:numbers) {
		num1+=i;
	}
	System.out.println("The total is "+num1);
		
	}

}
