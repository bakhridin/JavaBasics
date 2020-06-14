package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
	/*write a program to ask user if there is a sale
	 * if not sale-->not going shopping
	 * if sale we will ask the price of the item
	 * based on the price we will apply discount and calculate final price
	 * 
	 * if price less than 20-->apply 10%
	 * if price between 20 and 100-->apply 20%
	 * if price between 100 and 500-->apply 30%
	 * if price between 500 --> apply 50%
	 * 
	 * After discount___ the price of the item reduced from____to____
	 */
		
		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Is there any sale today?");
		sale=scan.nextLine();
		
		if(sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price");
			price=scan.nextDouble();
		}
		
		
		

	}

}
