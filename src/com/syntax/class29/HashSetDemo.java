package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// create a collection that store uniqe objects and we dont care about the order
		
		HashSet<String>breakfast=new HashSet<>();
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("cream cheese");
		breakfast.add("eggs");
		breakfast.add("coffee");
		
		//how many elements in the set
		int size=breakfast.size();
		System.out.println(size);
		
		//order is not maintained
		System.out.println(breakfast);

		//we need to retrieve an element------->but get() method is not available
		
		//we can retrieve all elements!
		System.out.println("-------Using Iterator-------");
		
		Iterator<String>it=breakfast.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
			
		}
		System.out.println("-------Using for each loop--------");
		for(String item:breakfast) {
			System.out.println(item);
			
		}
		//we can not use regular for loop
		//for(int i=0;i<breakfast.size();i++) {
		//	breakfast.getClass();
			
		//}
	}

}
