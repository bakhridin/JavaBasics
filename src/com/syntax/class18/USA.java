package com.syntax.class18;

public class USA {
	String state, stateCapital;
	
	
	
	public void display() {
		System.out.println(state+" the capital is "+stateCapital);
	}
		
   // Create a constructor that will initialize instance variables
	public USA(String state, String stateCapital){
		
		  	this.state=state;
		  	this.stateCapital=stateCapital;
			
		}
	public static void main(String[] args) {
		
		USA usa=new USA("Virginia","Richmond");
		usa.display();
	}
		
	

}
