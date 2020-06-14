package com.syntax.class08;

public class LoopsForReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for(int i=50; i>=1;i--) {
		//	System.out.println(i);
		//}
		//System.out.println("______________________");
	//int sum=0;
	//for(int i=1; i<=99; i+=2) {
		//if(i%2!=0);
		//System.out.println(i);
	//}
		int evensSum=0;
		int oddsSum=0;
		
	for(int i=1; i<=99;i++) {
		if(i%2==0) {
			evensSum=evensSum+i;
		}else {
			oddsSum=oddsSum+i;
		}	
		
	}	System.out.println("Sum of even= "+evensSum);
	    System.out.println("Sum of odd= "+oddsSum);
		

	}

}
