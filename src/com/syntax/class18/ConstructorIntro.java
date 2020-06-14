package com.syntax.class18;

public class ConstructorIntro {
	
	ConstructorIntro(){
		System.out.println("I am a constructor");
	}
	void hello() {
		System.out.println("Method Hello");
	}

	public static void main(String[] args) {
		ConstructorIntro obj=new ConstructorIntro();
		
		obj.hello();
		

	}

}
