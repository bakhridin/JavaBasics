package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*
		 * 
		 */
		//To compare String we use equals
		String day1="saturday";
		
		if(day1.equals("Tuesday") || day1.contentEquals("Wednesday")) {
			System.out.println("Today is SDLC class");
		}else if(day1.contentEquals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is Java class");
		}else if(day1.contentEquals("Monday") || day1.contentEquals("Friday")) {
			System.out.println("To day is no class");
		}else if(day1.contentEquals("Thutrsday")) {
			System.out.println("To day is review");
		}else {System.out.println("Invalid day");}

	}

}
