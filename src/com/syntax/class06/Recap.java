package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		// 
		
	int hour=80;
	String timeOfday;
	
	if(hour>=1 && hour<=11) {
		timeOfday="Morning";
	} else if(hour>=12 && hour<=15) {
		timeOfday="Afternoon";
	} else if(hour>=16 && hour<=20) {
		timeOfday="Evening";
	} else if(hour>=21 && hour<=24) {
		timeOfday="Night";
	}    else {
		timeOfday="Unknown";
	}
	if(!timeOfday.equals("Unknown"));{
		
		
	} System.out.println(timeOfday);

	}

}
