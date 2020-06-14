package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		
		//lets create a grocery Map (item, quantity) in which we do not care about order
		
		Map<String,Integer>grocery=new HashMap<>();
		  grocery.put("milk", 1);
		  grocery.put("cucumber", 3);
		  grocery.put("banana", 12);
		  grocery.put("cheese", 2);
		  grocery.put("grapes", 3);
		  System.out.println(grocery);
		  int g=grocery.size();
		  System.out.println("The size of gricery map is ------ "+g);
//		  
//		//create a map of item to buy(item,quantity) in which we want to save the order
//		  Map<String,Integer>household=new LinkedHashMap<>();
//		     household.put("lysol", 2);
//		     household.put("sanitizer", 2);
//		     household.put("paper towel", 3);
//		     household.put("face mask", 50);
//		     System.out.println(household);
//		     int h=household.size();
//		     System.out.println("The size of household map is ------ "+h);
//		     
//		 //create a map in which we store all previous items in ascending order
//		     Map<String,Integer>shopping=new TreeMap<>(grocery);
//		     shopping.putAll(household);
//		     System.out.println(shopping);
//		     int s=shopping.size();
//		     System.out.println("The size of shoppig map is ------ "+s);
//		     
//		 System.out.println(" //get all keys using loop ");
//		     for(String key:shopping.keySet()) {
//		    	 System.out.println("Key is "+key);
//		    	 
//		     }
//		     System.out.println(" //get all keys using Iterator ");
//		     Iterator<String> it=shopping.keySet().iterator();
//		     while(it.hasNext()) {
//		    	 String st=it.next();
//		    	 System.out.println("Key is "+st);
//		     }
		  //create a map of item to buy(quantity,item) in which we want to save the order
		  Map<Integer,String>household=new LinkedHashMap<>();
		     household.put(2,"lysol");
		     household.put(2,"sanitizer");
		     household.put(3,"paper towel");
		     household.put(50,"face mask");
		     System.out.println(household);
		     int h=household.size();
		     System.out.println("The size of household map is ------ "+h);
		 
		     
			 //create a map in which we store all previous items in ascending order
		     Map<Integer,String>shopping=new TreeMap<>();
		    // shopping.putAll(grocery);
		     shopping.putAll(household);
		     
		     System.out.println(shopping);
		     int s=shopping.size();
		     System.out.println("The size of shoppig map is ------ "+s);
	

	}

}
