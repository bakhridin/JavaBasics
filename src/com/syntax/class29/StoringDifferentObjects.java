package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StoringDifferentObjects {

	public static void main(String[] args) {
		Set<Insurance>hset=new HashSet<>();
		  
		hset.add(new Car("Geico","BMW"));
		hset.add(new Pet("Progressive","Dog"));
		hset.add(new Health("BCBS"));
		
		System.out.println(hset.size());
		
		System.out.println("-----------Using Iterator to retrieve all elements-------");
		
		Iterator<Insurance>hs=hset.iterator();
		 while(hs.hasNext()) {
			 //we need to assing it into the variable, if not and we use ih.next()---->moves to the next element
			 Insurance ih=hs.next();
			 
			 ih.getQuote();
			 ih.cancelInsurance();
			 ih.method();
			 System.out.println("------------------------------");
			 
		 }

	}

}
