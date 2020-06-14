package com.syntax.class06;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner input =new Scanner(System.in);
       
       System.out.println("Are you boy or girl");
        String boyGirl=input.nextLine();
        
       System.out.println("Are you rich ture/false");
       
       boolean rich=input.hasNextBoolean();
       
       System.out.println("You are a "+rich+"and you are rich: "+rich);
       
       
       
       
       
       
	}

}
