package com.syntax.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		// HashSet does not allow guarantee insertion order
		Set<String> veggies=new HashSet<>();
		 
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("cucumber");
		veggies.add("potato");
		System.out.println(veggies);
		
		//LinkedHashSet guarantee insertion order
		Set<String>fruits=new LinkedHashSet<>();
		 fruits.add("apple");
		 fruits.add("mango");
		 fruits.add("kiwi");
		 fruits.add("tomato");
		 fruits.add("banana");
		 System.out.println(fruits);
		 
		 Set<String>food=new TreeSet<>(veggies);
		 //adding duplicate from veggies collection------->duplicate does not except;
		 food.addAll(veggies);
		 food.addAll(fruits);
		 food.add("grapes");
System.out.println(food);
	}

}
