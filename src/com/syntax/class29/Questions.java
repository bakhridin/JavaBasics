package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Questions {

	public static void main(String[] args) {
		
		
		//how to remove duplicates from ArrayList?
		List<String>alist=new ArrayList<>();
		 alist.add("John");
		 alist.add("Jane");
		 alist.add("James");
		 alist.add("Jasmine");
		 alist.add("Jane");
		 alist.add("James");
		 System.out.println(alist);
		 
		 Set<String>set=new LinkedHashSet<>(alist);
		 System.out.println(set);
		 set.add("Alijon");
		 set.add("Usman");
		 System.out.println(set);
		 
		 //how to get only1 value from set?
		 if(set.contains("Jasmine")) {
			 System.out.println("We have Jasmine");
		 }
		 
		 // 1.convert to the List
		 
		 List<String>list=new ArrayList<>(set);
		 String name=list.get(4);
		 System.out.println(name);
		 
		 list.add("Jane");
		 list.add("Jane");
		 list.add("Jane");
		 System.out.println(list);
		 
		 // 2.convert to Array
		 Object[]array=set.toArray();
		 System.out.println(array[5]);
		 
		 // Array is a utility class that have methods to work with arrays
		 
		 Arrays.sort(array);
		 for(Object x:array) {
			 System.out.println(x);
			 
		 }
		 System.out.println();
		
		System.out.println("-----Collections utility class use to sort elements from any collections------"); 
		 //to sort elements from any collection
		 //Collections is an utility class that have methods to work with collections
		 
		 Collections.sort(list);
		 System.out.println(list);
		 

	}

}
