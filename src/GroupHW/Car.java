package GroupHW;

public class Car {
	double carPrice;
	String color;
	
	public Car(double carPrice,String color) {
		this.carPrice=carPrice;
		this.color=color;
	}
		
		public double calculateSalePrice() {
			
			return carPrice;
			
		}
		
}
class Sedan extends Car{
	double length;
	public Sedan (double carPrice,String color,double length){
		super(carPrice,color);
		this.length=length;
		
}
	public double calculateSalePrice() {
		if(length>=20) {
			return carPrice-=carPrice*0.05;
		}else {
			return carPrice*0.90;
			}
		
		
		
	}
}
class Truck extends Car{
	double weight;

	public Truck(double carPrice, String color,double weight) {
		super(carPrice, color);
		this.weight=weight;
		
	}
	public double calculateSalePrice() {
		if(weight>=2000){
			return  carPrice-=carPrice*0.010;
			
		}else {
			return carPrice-=carPrice*0.080;
		}
	}
	
}
