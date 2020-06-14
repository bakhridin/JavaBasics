package com.syntax.class18;
//Write a java program of Class Students that takes students name and 3 subject grades.
//Inside your class also have a method to Calculate Average Grade. 
//Test Student class for 5 different students with different marks. 
//Your program should print an average mark of each students name.
//NOTE: please use different names for instance and local variables.

public class Student {
	
	String name;
	int grade1;
	int grade2;
	int grade3;
	
	Student(String nameN,int gr1,int gr2,int gr3){
		name=nameN;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
		
		System.out.println(nameN+" average grade is "+(gr1+gr2+gr3)/3);
				
				
				
	}
	public static void main(String[] args) {
		Student obj=new Student("Jim",80,90,100);
		Student obj1=new Student("Jary",80,80,80);
	}
	

}
