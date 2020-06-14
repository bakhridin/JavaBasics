package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLOgicalOperators {

	public static void main(String[] args) {
		/*Take age input from a user and then based on the age print output if age
		 *  from:
		 *  0-3--> you are a baby,4-5-->you are a kid; 6-12-->you are a child;
		 *  13-19-->you are teenager;20-64-->you are an adult;
		 * 65--> you are a senior;
		 */
           //1.-let's declare variables
		int age;
		Scanner scan;//to import we use shortcut mac:cmd+shift+o
		
		//2. cupture values
		scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
		
		//3. perform verification
		
		if(age>=0 && age<=3) {System.out.println("You are a baby");
		}else if(age>=3 && age<=5) {System.out.println("You are a kid");
		}else if (age>6 && age<12) {System.out.println("You are a child");
		}else if(age>13 && age<19) {System.out.println("You are a teenager");
		}else if(age>20 && age<64) {System.out.println("You are a an adult");
		}else {System.out.println("You are a senior");}
	}

}
