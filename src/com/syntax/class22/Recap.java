package com.syntax.class22;

public class Recap {
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public void hello(String name) {  //This method is overloaded
		System.out.println("Hello "+name);
	}
	
	public void hello(int num) {  //This method is overloaded
		System.out.println("hello "+num);
	}
	
	public void hello1(int num) { //This method is overloaded
		System.out.println("hello "+num);
	}
	
	
//	private void hello(String str) {             --> CE:overloading is not possible by changing access modifiers
//		System.out.println("hello "+str);
//	}
	
//	public String hello(String name) {          -->CE: overloading is not possible by changing return type.
//	 return name;
//	}

}
