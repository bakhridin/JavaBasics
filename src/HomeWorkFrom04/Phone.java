package HomeWorkFrom04;

public class Phone {
	
	String brand;
	String model;
	String color;
	int size;
	
	void text(){
		System.out.println(brand+" "+color+" "+model+" "+size+" can text ");	
	}
	void pics() {
		
	}

	public static void main(String[] args) {
		
		Phone str=new Phone();
		str.brand="Iphone";
		str.color="Black";
		str.model="Max";
		str.size=10;
		
		str.text();
		str.pics();

		
		Method method = new Method ();
		method.name="Toyota";

	}
	
}
