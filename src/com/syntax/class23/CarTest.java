package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Car bmw=new BMW("BMW");
		Car tesla =new Tesla("Tesla");
		Car merc=new Mercedes("Mercees");
		Car honda=new Honda("Honda");
		
Car[] cars={new BMW("BMW"),new Tesla("Tesla"),new Mercedes("Mercees"),new Honda("Honda")};

        for(Car c:cars) {
        	c.start();
        	c.display();
        	System.out.println("-------------------------");
        }
        System.out.println("------using for loop------");
        
        for (int i=0;i<cars.length;i++) {
        	cars[i].start();
        	cars[i].display();
        	
        }

	}

}
