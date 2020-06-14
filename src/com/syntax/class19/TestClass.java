package com.syntax.class19;

public class TestClass {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		//access variable from own class
		dog.breed="Husky";
		//access variable from parent class
		dog.color="Gray";
		
		dog.fur="Too much";
		dog.size="Big";
		System.out.println(dog.color+" "+dog.fur+" "+dog.size);
		
		//access method from own class
		dog.bark();
		//access methods from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Dog.age=2;//access static variable from parent class
		Dog.display();//access static method from parent class
		
		System.out.println("---------------------------------------------------");
		
		Animals animal=new Animals();
		
		animal.color="Any";
		animal.fur="Any";
		animal.size="Any";
		
	//animal.breed-->not access from child class, can access only features define  from it's class
		
		animal.sleep();
		animal.beWild();
		animal.eat();
		//animal.bark-->not access from child class, can access only features define  from it's class
	

	}

}
