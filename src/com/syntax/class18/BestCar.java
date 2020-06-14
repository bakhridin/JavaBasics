package com.syntax.class18;

public class BestCar {
	String make,model,color;
	int year,door,wheels;
	
	public void printDetails() {
		System.out.println("I have "+year+" "+make+" "+model+" "+color+" color");
		System.out.println(make+ " has "+door+" doors and "+wheels+" wheels");
	}
	BestCar(String Carmake,String Carmodel,String Carcolor,int Caryear,int Cardoor,int Carwheels){
		make=Carmake;
		model=Carmodel;
		color=Carcolor;
		year=Caryear;
		door=Cardoor;
		wheels=Carwheels;
	}
	
	
	public static void main(String[] args) {
		BestCar obj=new BestCar("BMW","X6","Black",2020,4,5);
		
		obj.printDetails();
	}

}
