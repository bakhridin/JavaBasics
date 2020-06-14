package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHW {

	public static void main(String[] args) {
	    
		Map<Integer,String>building=new LinkedHashMap<>();
		  building.put(1, "Google");
		  building.put(2, "Syntax");
		  building.put(3, "Google");
		  building.put(4, "Amazon");
		  building.put(4, "Amazon");
		  building.put(5, "HP");
		  building.put(6, "Microsoft");
		  building.put(7, "Oracle");
		  System.out.println(building);
		  
		  String element=building.get(2);
		  System.out.println(element+"--------------");
		  int i=building.size();
		  System.out.println(i);
		  System.out.println(building);
		  
		//how to get all keys from map
		  Set<Integer>keys=building.keySet();
		  System.out.println(building.keySet());
		  
		  System.out.println("----getting keys using Iterator----");
		  Iterator<Integer>keysIt=keys.iterator();
		  while(keysIt.hasNext()) {
			  int key=keysIt.next();
			  System.out.println("Key is "+key+" its value is "+building.get(key));
		  }
		  System.out.println("---using for advanced loop to get keys--------");
		     for(int k:keys) {
		    	 System.out.println("Keys from building Map "+k+" its value "+building.get(k));
		     }
		    System.out.println(" //How to get get all values from building Map");
		    
		     Collection<String>values=building.values();
		     
		     System.out.println(values);
		     System.out.println("----using Iterator-----");
		    
		     Iterator<String>valuesIt=values.iterator();
		     while(valuesIt.hasNext()) {
		    	 String str=valuesIt.next();
		    	 System.out.println(str);
		     }
		     System.out.println("-----Using for each loop------");
		     for(String sr:values) {
		    	 System.out.println(sr);
		    	 
		     }
		  

	}

}
