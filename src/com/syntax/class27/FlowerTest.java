package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		
		
		Flower [] flowerArray= {new Tulip("Tulip"),new Rose("Rose"),new Sunflower("Sunflower")};
		
		ArrayList<Flower>flowers=new ArrayList<>();
		
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Rose("Rose"));
		flowers.add(new Sunflower("Sunflower"));
		
		System.out.println("-------1st way using advanced loop--------------");
		for(Flower fl:flowers) {
			fl.bloom();
			
		}
		System.out.println("------2nd way using for loop-------------");
		for(int i=0;i<flowers.size();i++) {
			Flower f=flowers.get(i);
			f.bloom();
			
		}
		System.out.println("------------3d way using Iterator-----------");
		Iterator<Flower>iti=flowers.iterator();
		
		while(iti.hasNext()) {
			iti.next().bloom();
			
		}

	}

}
