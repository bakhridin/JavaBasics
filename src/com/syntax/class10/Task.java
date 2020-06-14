package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
	// Create an array of animals and store 6 elements into it. 
	// Using 2 different loops print all elements from the array.

		String[] animals= {"Lion","Camel","Tiger","Puma","Shark","Dog"};
		
		for(String animal:animals) {
			
			if(animal.contentEquals("Lion")) {
				System.out.println(animal+" Is king of animals");
			}else {
				System.out.println(animal);
			}
		}
		System.out.println("-------------2nd way");
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]);
			
		}

	}

}
