package com.syntax.class18;

public class ConsIntro {
	ConsIntro(){
		System.out.println("I am default constructor");
	}
	
	protected ConsIntro( int a) {
		System.out.println("I am protected constructor with int parameter "+a);
		
	}
	private ConsIntro( int b, String name) {
		System.out.println("I am protected constructor with int parameter "+b);
		
	}
	public ConsIntro( String word,int c) {
		System.out.println("Public");
		
	}
	
	public static void main(String[] args) {
		ConsIntro obj=new ConsIntro();
		ConsIntro obj1=new ConsIntro(12);
		ConsIntro obj2=new ConsIntro(12,"Mark");
		ConsIntro obj3=new ConsIntro("word",10);
	}
	}


