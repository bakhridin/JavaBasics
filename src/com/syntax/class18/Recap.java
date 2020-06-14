package com.syntax.class18;

public class Recap {
	protected int sumFromArray(int[] array) {
		int total=0;
		for(int i=0;i<array.length;i++) {
			total+=array[i];
			
		}
		return total;
	}
	
	public static String getRevers(String str) {
		String revers="";
	 for(int i=str.length()-1;i>=0;i--) {
		 revers+=str.charAt(i);
	 }
	 return revers;
	}
	private static String getVowels(String str) {
		String vowels;
		vowels=str.replaceAll("[^aeiouAEIOU]", "");
		return vowels;
	}
	
	
	
	
	public static void main(String[] args) {
		Recap obj=new Recap();
		int[] array= {2,3,4,233};
		System.out.println(obj.sumFromArray(array));
		
		
	
	    String str=Recap.getRevers("Hello");
	    System.out.println(str);
	    
	    String vowels=getVowels("Hello");
	    System.out.println(vowels);
	  
	}
		}


