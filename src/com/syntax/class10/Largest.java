package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		// find larges element from an array
 int[]nums= {200,30,-1,900,56,787};
 
   int max=nums[0];
   
   for(int i=0;i<nums.length;i++) {
		if (max<nums[i]) {
			max=nums[i];
		}
	}
	System.out.println("The largest number of the array is "+max);
	System.out.println("------using advanced loop----");
	
	int larg=nums[0];
	
	 for(int big:nums) {
		 if(larg<big) {
			 larg=big;
		 }
	 }
	 System.out.println("The largest is "+larg);
 
 
	}

}
