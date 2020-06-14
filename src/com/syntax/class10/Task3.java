package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values from an array print capital for each country. 
		//(use 2 different loops).
		
		String[]countries= {"Italy","France","Spane"};
		
		for(String country:countries) {
			if(country.equals("France")) {
				System.out.println("The capital of "+country+" is Paris");
			}else {
				System.out.println(country);
			}
		}
		
		String[] countries1 = { "USA", "Poland", "Ukraine", "Turkey", "Spain" };
		for (int y = 0; y < countries1.length; y++) {
		            switch(countries1[y]) {
		            
		            case "USA":
		                System.out.println("The capital is Washington DC");
		                break;
		            case "Poland":
		                System.out.println("The capital is Warsaw");
		                break;
		            case "Ukraine":
		                System.out.println("The capital is Kiev");
		                break;
		            case "Turkey":
		                System.out.println("The capital is Ankara");
		                break;
		            case "Spain":
		                System.out.println("The capital is Madrid");
		                break;
		            }
		}
		System.out.println("------using anvanced loop-------");
		for(String name:countries1) {
			switch(name) {
			case "USA":
				System.out.println("The capital is Washington DC");
				break;
			}
		}
	}

}
