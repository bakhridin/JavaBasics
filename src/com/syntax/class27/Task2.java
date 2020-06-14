package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		//   //Create an arrayList of words. Remove every word that ends with “e”. Use iterator
		
		ArrayList<String> words=new ArrayList<>();
		
		words.add("Salom");
		words.add("Olle");
		words.add("Hello");
		words.add("Hole");
		
		Iterator<String>wd=words.iterator();
		
		while(wd.hasNext()) {
			//String st=wd.next();
			if(wd.next().endsWith("e")) {
				wd.remove();
				
			}
			
		}System.out.println(words);

	}

}
