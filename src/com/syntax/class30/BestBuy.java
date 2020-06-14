package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BestBuy {
	 public static void main(String[]args){
		    Map<String,Integer>map=new HashMap<>();
		    map.put("mango", 10);
		    map.put("apple", 30);
		    map.put("orange", 20);
		    map.put("mango", 40);
		    map.put("mango", 40);
		     Set<Entry<String, Integer>> entries=map.entrySet() ;
		        //System.out.println(entries  );
		        Iterator<Entry <String, Integer>>it=entries .iterator();
		        while(it.hasNext()) {
		            Entry <String, Integer>entry=it.next();
		            //System.out.println(entry );
		            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue() );
		        }
		  
		}

}
