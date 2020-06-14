package com.syntax.class27;

import java.util.ArrayList;

public class FoodTest {

	public static void main(String[] args) {
		
		Food[] foods= {new Kebab(),new Plow(),new Burger()};
		
		ArrayList<Food>fd=new ArrayList<>();
		fd.add(new Kebab());
		fd.add(new Plow());
		fd.add(new Burger());
		
		for(Food f:fd) {
			f.cook();
		
			f.test();
			
			f.cost();
			
			
		}
		

	}

}
