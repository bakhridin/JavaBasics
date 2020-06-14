package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		
		//1.Bring Scanner class into a program
		//System.in-->identifies keyboard
		 Scanner scan=new Scanner(System.in);
		 //Instruct user of what program expects
		 System.out.println("Please enter your name");
		 //cupcher line of String from a user 
		 String name=scan.nextLine();

	}

}
