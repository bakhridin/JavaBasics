package GroupHW;

public class TestCar {

	public static void main(String[] args) {
		Car car=new Sedan(30000,"Black",20);
		System.out.println(car.calculateSalePrice());
		
		
		Car car1=new Truck(70000,"Blue",1500);
		System.out.println(car1.calculateSalePrice());

	}

}
