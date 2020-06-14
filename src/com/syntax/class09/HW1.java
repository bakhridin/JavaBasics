package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {

		// Create an array of chars and store grades into it: A,B,C,D,E,F.
		// Then print a grade B (use 2 different ways of creating an array).

	/*	char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';
		System.out.println(grade[1]);
		
	System.out.println("------2 way-------------");
	
	char[] grade1= {'A','B','C','D','E','F'};
	
	System.out.println(grade1.length);
	System.out.println(grade1[1]);
	
	*/
	//	Create an array of names and store all names of your group. 
   //Then print your name from that array. (use 2 different ways of creating an array).
		
		char[] grade1= {'A','B','C','D','E','F'};
		
		
		System.out.println(grade1.length);
		
		for(int i=0; i<grade1.length; i++) {
			System.out.println(grade1[i]);
		}
		System.out.println("2nd way");
		
		for(char grade: grade1) {
			System.out.print(grade+" ");
		}
		
		
	}

}
