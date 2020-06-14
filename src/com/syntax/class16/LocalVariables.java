package com.syntax.class16;

public class LocalVariables {
	void nameInside() {
		
		String name="John"; //local variable that visible only inside method it was declared
		System.out.println(name);
	}
	
	void anotherName() {
		String name="Jane";
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		
		LocalVariables obj=new LocalVariables();
		
		obj.nameInside();
		obj.anotherName();
		
		
		boolean flag=true;
		if(flag) {
			String answer="Yes";
		System.out.println(flag);
		}
	for (int i=0;i<=5;i++) {
		System.out.println(i);
	}
	for(int i=0;i<=5;i++) {
		System.out.println(i);
	}
	
	String name="Gulbahar";
		
		
	}
	

}
