package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		
		// create a map that will hold month and days  amonth
		Map<String,Integer>month=new LinkedHashMap<>();
           month.put("January", 31);
           month.put("February", 28);
           month.put("March", 31);
           month.put("April", 30);
           System.out.println(month);
           int m=month.size();
           System.out.println(m);
           
       //get all elements from the map
           Set<Entry<String,Integer>>entries=month.entrySet();
           System.out.println(entries);
           
           //loop trough all entry objects
           for(Entry e:entries) {
        	  // System.out.println(e);
        	   System.out.println(e.getKey()+":"+e.getValue());
           }
           System.out.println("---Using Iterator to go over all Entry objects--------");
           //iterate trough all Entry objects
           Iterator<Entry<String,Integer>>it=entries.iterator();
           while(it.hasNext()) {
        	   Entry entry=it.next();
        	   System.out.println(entry);
        	   
        	   System.out.println("Key "+entry.getKey()+" ==value "+entry.getValue());
        	   
           }
	}

}
