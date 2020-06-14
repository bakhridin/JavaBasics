package com.syntax.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	 
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your String");
        String str=input.nextLine();
        
        if(!str.isEmpty() && str.length()>=3) {
        	if(str.length()%2==0) {
        		System.out.println(str);
        	}
        }else {}
        System.out.println("You are wrong");
	}

}
