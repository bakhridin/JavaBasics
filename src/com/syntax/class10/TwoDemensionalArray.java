package com.syntax.class10;

public class TwoDemensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]numbers=new int[3][4];
		
		//1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//2 row
		numbers[1][0]=15;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		//3 row
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
		//Print value 3
		
		System.out.println(numbers[2][3]);
		
		//short
		int[][]nums= {
				{10,20,30,40},
				{5,10,15,20},
				{1,2,3,4}
				};
		System.out.println(nums[0][1]);
		
		
		String[][]month= {
				{"Decaember","January","February"},
				{"March","April","May"},
				{"June","July","August"},
				{"September","October","November"}
				
			};
		System.out.println(month[0][2]);

	}

}
