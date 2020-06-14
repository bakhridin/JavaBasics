 package com.syntax.class07;

import java.util.Scanner;

public class LoopAndScanner {

	public static void main(String[] args) {
	 
		Scanner input;
		String name;
		int num=1;
		
		input =new Scanner(System.in);
		
		while(num<=3) {
			System.out.println("Whatnis yoyr name");
			
			name=input.nextLine();
			System.out.println("Good afternoon");
			
			num++;
		}
		
		
		

	}

}
