package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
	public static void main(String[] args) {
		//HashMap is not maintain order
		Map<String,String>hmap=new HashMap<>();
		 hmap.put("Name", "John");
		 hmap.put("Last Name", "Smith");
		 hmap.put("Adress", "123 Test");
		 hmap.put("City", "Chantilly");
		 
		 //how to check if Map has any values
		 boolean isEmpty=hmap.isEmpty();
		 System.out.println("Is Map empty "+isEmpty);
		 
	//How many elements are Map have?
		 int size=hmap.size();
		 System.out.println(size);
		 
	//can we add more elements?
		 hmap.put("Zip", "12345");
		 System.out.println(hmap);
		 
	//can we store duplicate keys? NO, previous value will be replaced.
		 hmap.put("Name", "Jane");
		 System.out.println(hmap);
		 
	//how access the value?-->use method get() and specify the key.
		 System.out.println(hmap.get("Name"));
		 
	//how to remove value?
		 hmap.remove("Adress");
		 System.out.println(hmap);
		 
	//how replace value in Map?
		 hmap.replace("Zip", "98765");
		 System.out.println(hmap);
		 
		 
		
	}

}
