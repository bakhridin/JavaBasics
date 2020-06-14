package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------10x10");
		
		for(int z=1;z<=10;z++) {
			for(int x=1;x<=10;x++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("------Long way-------");
		
		for (int a=1; a<=5; a++) {
			System.out.print("*");
		}System.out.println();
		for (int a=1; a<=5; a++) {
			System.out.print("*");
		}System.out.println();
		for (int a=1; a<=5; a++) {
			System.out.print("*");
		}System.out.println();
		for (int a=1; a<=5; a++) {
			System.out.print("*");
		}
		

	}

}
