package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		//Create a Set of cities in which you want to make sure that insertion order is maintained.
		//Using Iterator remove any city that starts with “A”;
		Set<String>hash=new LinkedHashSet<>();
		
		hash.add("Dushanbe");
		hash.add("Tashkent");
		hash.add("Bishkek");
		hash.add("Noorsultan");
		hash.add("ATurkman");

		  Iterator<String> hs=hash.iterator();
		  
		  while(hs.hasNext()) {
			  if(hs.next().startsWith("A")) {
				  hs.remove();
			  }
			  
		  }
		  System.out.println(hash);
	}

}
