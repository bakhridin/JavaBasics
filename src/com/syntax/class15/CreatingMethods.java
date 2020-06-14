package com.syntax.class15;

public class CreatingMethods {
	//we want to create method that will accept marks(90,80)
	//based on the marks it will return grade(A,B,C)
	// if grade>90---->A, if 90>grade<80-->B, if 80>grade<70-->C
	
	char grade(int a) {
		char grade;
		
		if(a>90) {
			grade='A';
		}else if(a<=90 && a>80) {
			grade='B';
		}else if(a<=80 && a>70) {
			grade='C';
		}else {
			grade='F';
		}
		return grade;
	}
	public static void main(String[] args) {
		
		CreatingMethods flag=new CreatingMethods();
		
		char fog=flag.grade(58);
		System.out.println(fog);
		System.out.println(flag.grade(57));
		
		if(fog=='A' || fog=='B') {
			System.out.println("Good job");
		}else {
			System.out.println("Study more");
		}
	}

}
