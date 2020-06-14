package com.syntax.class11;

import java.util.Scanner;

public class TaskStringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan;
//		String username;
//		String password;
//		String confirmedPassword;
//		scan = new Scanner(System.in);
//		System.out.println("Please enter your username");
//		username = scan.nextLine();
//		System.out.println("Please enter your password");
//		password = scan.nextLine();
//		if (!(username.isEmpty() || password.isEmpty())) {
//			if (password.length() >= 8) {
//				if (!password.contains(username)) {
//					System.out.println("Please confirm password");
//					confirmedPassword = scan.nextLine();
//
//					if (password.equals(confirmedPassword)) {
//						System.out.println("Your account is created");
//					} 
//					else {
//						System.out.println("Passwords are not matched");
//					}
//				} 
//				else {
//					System.out.println("Password cannot contain username");
//				}
//			} 
//			else {
//				System.out.println("Password is too short");
//			}
//		}
//		else {
//			System.out.println("Username and password cannot be empty");
//		}
		
		Scanner input=new Scanner(System.in);
		
		String username;
		String password;
		String conformPassword;
		
		System.out.println("Please enter your username");
		 username=input.nextLine();
		 
		System.out.println("Please enter your password");
		 password=input.nextLine();
		 
		 if(!(username.isEmpty() || password.isEmpty())){
			if(password.length()>=8) {
				if(!(password.contains(username))) {
					System.out.println("Please conform your password");
					conformPassword=input.nextLine();
					if(conformPassword.equals(password)) {
						System.out.println("Your password conformed");
						
					}else {
						System.out.println("Your conformation is incorrect");
					}
					
				}else {
					System.out.println("yor password must not contains username");
				}
				
			}else {
				System.out.println("Password is short");
			} 
		 }
		 else {
			 System.out.println("Username and password can not e empty");
		 }
		 
		 
	}

}
