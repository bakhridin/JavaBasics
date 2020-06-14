package com.syntax.class17;

public class Task {
	int sumOfnum(int[] array) {
		int total=0;
		for(int i=0;i<array.length;i++) {
			total+=array[i];
			
		}
		return  total;	
	}
	public static void main(String[] args) {
		Task obj=new Task();
		int[]array= {12,10,20};
		System.out.println(obj.sumOfnum(array));
		
	}
	
}
