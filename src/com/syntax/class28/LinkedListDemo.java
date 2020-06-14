package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>llist=new LinkedList<>();
		llist.add("Yunus");
		llist.add(0, "Reihan");
		llist.add("Pavel");
		llist.add("Farid");
		
		int size=llist.size();
		
		
		for(String ll:llist) {
			System.out.println(ll);
		
			
		}
		System.out.println("-------------------");
		
		for(int i=0;i<llist.size();i++) {
			String str=llist.get(i);
			System.out.println(str);
			
		}
		System.out.println("--------------------");
		
		
		Iterator<String>it=llist.iterator();
		
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
			
		}
		
		// can we use store of users defined classes?
		LinkedList<FoodF>food=new LinkedList<>();
		food.add(new Salad("salad", "tomato and cucumber", 100));
		food.add(new Dessetr("desert","chocolate",1000));
		food.add(new MainDish("pasta","mushrooms",800));
		food.add(new Soup("water","carrot",200));
		//food.removeFirst();
		
		for(FoodF f:food) {
			f.calories();
			f.foodType();
			f.ingredient();
			System.out.println("------------------------");
			
			
		}
		System.out.println("-------From List collection_______-");
		List<FoodF>food1=new LinkedList<>();
		food1.add(new Salad("salad", "tomato and cucumber", 100));
		food1.add(new Dessetr("desert","chocolate",1000));
		food1.add(new MainDish("pasta","mushrooms",800));
		food1.add(new Soup("water","carrot",200));
		
		for(FoodF f:food1) {
			f.calories();
			f.foodType();
			f.ingredient();
			System.out.println("------------------------");


	}
	}
}
