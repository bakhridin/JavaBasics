package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	//Create an arraylist of cars and retrieve all the values using 3 different ways.

   //Create an arrayList of words. Remove every word that ends with “e”. Use iterator

	public static void main(String[] args) {
		
		ArrayList<String> car=new ArrayList<>();
		
		car.add("BMW");
		car.add("Ford");
		car.add("Chev");
		car.add("Audi");
		
		//1 way regular for loop
		for(int i=0;i<car.size();i++) {
			String c=car.get(i);
			System.out.println(c);
			
		}
		System.out.println("----advanced loop-----");
		//2 way advanced loop
		for(String s:car) {
			System.out.println(s);
			
		}
		System.out.println("------Iterator-----------");
		//3 way
		Iterator<String>str=car.iterator();
		while(str.hasNext()) {
			String st=str.next();
			System.out.println(st);
			
		}
		

	}

}
