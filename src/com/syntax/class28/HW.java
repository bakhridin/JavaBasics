package com.syntax.class28;

import java.util.ArrayList;

public class HW {

	public static void main(String[] args) {
		ArrayList<String> drinks=new ArrayList<>();
		drinks.add("milk");
		drinks.add("coffee");
		drinks.add("coca");
		drinks.add("tea");
		
		System.out.println(drinks);
		
	      for(int i=0;i<drinks.size();i++) {
	    	  if(drinks.get(i).contains("e") ||drinks.get(i).contains("a")) {
	    		  drinks.set(i, "water");
	    		  
	    	  }
	    	  
	      }
	      System.out.println(drinks); 

	}

}
