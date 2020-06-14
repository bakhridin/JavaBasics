package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {
		
		
		String str="Hello";
		
		
		
		try {
			char character=str.charAt(11); //new StringIndexOutOfBoundsException() 
			System.out.println(character);
			
		}catch(StringIndexOutOfBoundsException so) {
			// 3 ways to get info about exception
			so.printStackTrace();//1. way--->name,massage about Exception,where it occurs
			System.out.println(so); //2.way--> name,message about Exception
		//	System.out.println(so.getMessage());//3.way--->String index out of range: 10 
		}

	}

}
