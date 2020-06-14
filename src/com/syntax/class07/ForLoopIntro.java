package com.syntax.class07;

import java.util.Scanner;

public class ForLoopIntro {

	public static void main(String[] args) {
	
			    Scanner scan = new Scanner(System.in);
			    System.out.println("Please enter your gender: M or F");
			    String gender=scan.nextLine();
			    
			    System.out.println("Please enter your age");
			     int age=scan.nextInt();
			     if(age>25){
			       if(gender.equals("F"))
			       System.out.println("Woman");
			     }else if(age<=25) {
			        if(gender.equals("F"))
			       System.out.println("Girl");
			     }
			     else if(age>25){
			        if(gender.equals("M"))
			        System.out.println("Man");
			     }else if(age<=25){
			        if(gender.equals("M"))
			        System.out.println("Boy");
			     }
			    }  

	}


