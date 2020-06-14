package com.syntax.class04;

public class MoreNestedif {

	public static void main(String[] args) {
		// declare date and a day
		//if day is Friday-->if date is 13-->watch a scary movie
		//                --> if date not 13-->watch comedy
		boolean isFriday=false;
		int date=13;
		
		if(isFriday) {
		System.out.println("Today is Friday I am going to watch a movie");
		if(date==13) {System.out.println("I'll watch a scary movie");}
		else {System.out.println("I' ll watch a comedy");}
		
		
		
		
		
		
		}else {System.out.println("Today is not Friday iam staying home");}

	}

}
