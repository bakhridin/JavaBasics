package com.syntax.class28;

public abstract class FoodF {
	String foodType;
	String ingredient;
	int calories;
	
	public FoodF(String foodType,String igredient,int calories) {
		this.foodType=foodType;
		this.ingredient=ingredient;
		this.calories=calories;
		
	}
	public abstract void foodType();
	public abstract void ingredient();
	public abstract void calories();

}

class Soup extends FoodF{

	public Soup(String foodType, String igredient, int calories) {
		super(foodType, igredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void foodType() {
		System.out.println(foodType+" is appitizer");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodType+" has many igredient "+ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println("1 serving of "+foodType+" has "+calories);
		
	}
	
}
class Salad extends FoodF{

	public Salad(String foodType, String igredient, int calories) {
		super(foodType, igredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void foodType() {
		System.out.println(foodType+" is common in turkey");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodType+" has igredient of "+ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println("1 serving of "+foodType+" has "+calories);
		
	}
	
}
class MainDish extends FoodF{

	public MainDish(String foodType, String igredient, int calories) {
		super(foodType, igredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void foodType() {
		System.out.println(foodType+" is common in Turkey");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodType+" has ingredient "+ingredient);
		
	}

	@Override
	public void calories() {
	System.out.println("1 serving of "+foodType+" has "+calories);
		
	}
	
}
class Dessetr extends FoodF{

	public Dessetr(String foodType, String igredient, int calories) {
		super(foodType, igredient, calories);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void foodType() {
		System.out.println(foodType+" is common dessert");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodType+" has ingredient of "+ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println("1 serving "+foodType+" has "+calories);
		
	}
	
}
