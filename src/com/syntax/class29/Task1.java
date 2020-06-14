package com.syntax.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		//Create a Set collection in which you need to add names of the countries.
		//In this set we want all objects to be sorted in alphabetical order.
		//Using 2 different ways retrieve all elements from set
		
	Set<String> st=new TreeSet<>();
	
	  st.add("Tajikistan");
	  st.add("Uzbekistan");
	  st.add("Turkmenistan");
	  st.add("Kirgizistan");
	  st.add("Kazakstan");
	  
	  System.out.println(st);
	  System.out.println("------for each loop---------");
	  
	  for(String as:st) {
		  System.out.println(as);
		  
	  }
	  System.out.println("----------Iterator-----------");
	  
	  Iterator<String> it=st.iterator();
	   while(it.hasNext()) {
		   String ob=it.next();
		   System.out.println(ob);
		   
	   }

	}

}
