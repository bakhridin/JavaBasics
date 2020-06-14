package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

	

	public static void main(String[] args) {
		
		ArrayList<String> choco=new ArrayList<>();
		
		choco.add("kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");
		
		
		//create arraylist of sweets
		
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		System.out.println("--------------------");
		
		
		//we want to iterate through collection
		//iterates in 1 direction
		Iterator<String> it=sweets.iterator();
		
		while(it.hasNext()) {
			String element=it.next();
			if(element.equals("ice cream")) {
				it.remove();
				}
			}
		System.out.println("----ArrayList after removing element---");
		System.out.println(sweets);
		
		System.out.println("--------------");
		//i want to get elements backwards
		for(int i=sweets.size()-1;i>=0;i--) {
			String s=sweets.get(i);
			System.out.print(s+";");
		}
	
		//advanced for loop/Iterator only loop in one direction
		for(String str:sweets) {
			System.out.println(str);
			
		}

	}

}
