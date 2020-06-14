package com.syntax.class05;

import java.util.Scanner;

public class H0meWork1 {

	public static void main(String[] args) {
		/* write a program for user to enter his/her birth month.based on the month.
		 * Define the season . Example: if user is born in June,July of August-->"sumer".
		 * at the end of the program we should see output as "You were born : 
		 */
		 Scanner scan=new Scanner (System.in);
		 System.out.println("Enter your birth month");
		 String month=scan.nextLine();
		 String season=null;
		 
		 if((month.contentEquals("Desember")) || (month.contentEquals("January"))
		 ||(month.contentEquals("February"))) {
			 season="Winter";
		 }else if ((month.equals("March")) || (month.equals("April"))
		|| (month.equals("May"))) {
			season="Spring"; 
		 }else {System.out.println("Please enter valid month");}
		 
		 System.out.println("You were born in  "+season+".");
			 
				 

	}

}
