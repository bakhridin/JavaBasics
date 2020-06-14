package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	//	System.out.println("_____________PRINTING PATTERNS ----Changing variable");
		
	//	for(int i=1;i<=4;i++) {
	//		for(int j=1;j<=5;j++) {
	//			System.out.print(i);
	//		}
	//		System.out.println();
	//	}
		System.out.println("_____________PRINTING PATTERNS --FIVE ROWS OF 1-9");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("_____________PRINTING PATTERNS --FIVE ROWS OF 5-1");
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
			System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("_____________PRINTING PATTERNS --FIVE ROWS OF 5-1 Changing variable from outer to inner ");
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
			System.out.print(i);
			}
			System.out.println();
		}
		}

	}


