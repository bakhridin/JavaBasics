package com.syntax.class03;

public class AdditionalvsConcatination {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="Bye";
		
		System.out.println(a+b+x+y);//30HelloBye
		
		System.out.println(a+x+b+y);//10Hello20Bye
		
		System.out.println(x+y+a+b);//HelloBye1020 or HelloBye30
		
		System.out.println(x+y+(a+b));//HelloBye30
		
		System.out.println(a+""+b+x+y);//1020HelloBye


	}

}
