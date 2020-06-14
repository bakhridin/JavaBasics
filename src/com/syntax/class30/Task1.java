package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		Map<String,String> countries=new TreeMap<>();
		countries.put("Tajikistan", "Dushanbe");
		countries.put("Uzbekistan", "Tashkent");
		countries.put("Kirgizstan", "Bishkek");
		countries.put("Turkmenistan", "Ashqabad");
		countries.put("Kazakhstan", "Nursultan");
		countries.put("Afganistan", "Kabul");
		System.out.println(countries);
		System.out.println("-----for each loop----------");
		
		for(String k:countries.keySet()) {
			System.out.println(k);
		}
		
		System.out.println("----------Iterator---------");
		
		Iterator<String> c=countries.keySet().iterator();
		  while(c.hasNext()) {
			  String str=c.next();
			  System.out.println(str);
		  }
		  
		  System.out.println("-----for each loop to get value----------");  
		
		  for(String k:countries.values()) {
				System.out.println(k);
			}
		  System.out.println("----------Iterator to get values---------");
			Iterator<String> c1=countries.values().iterator();
			  while(c1.hasNext()) {
				  String str=c1.next();
				  System.out.println(str);
			  }

	}

}
