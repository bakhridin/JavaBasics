package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorToRemove {

	public static void main(String[] args) {
		ArrayList<String>drinks=new ArrayList<>();
		 drinks.add("water");
		 drinks.add("milk");
		 drinks.add("milk");
		 drinks.add("juice");
		 drinks.add("tea");
		 drinks.add("tea");
		 drinks.add("coffee");
		 
		// System.out.println(drinks);
		 
//		 //we need to remove all milk and tea from String objects
//		 for(int i=0;i<drinks.size();i++) {
//		 if(drinks.get(i).equals("milk")||drinks.get(i).equals("tea")) {
//			 drinks.remove(i);
//			 
//		 }
//		 }
		// System.out.println(drinks);
		 
		 Iterator<String> d=drinks.iterator();
		 while(d.hasNext()) {
			 if(d.next().equals("milk")||d.next().equals("tea")) {
				 d.remove();
				 
			 }
			 
		 }
		
		 System.out.println(drinks);
	}

}
