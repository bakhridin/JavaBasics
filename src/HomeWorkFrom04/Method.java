package HomeWorkFrom04;

public class Method {
	
	String name;

	public static void main(String[] args) {
		welcome();
		multiply(5,10);
		divide(10,2);
		
	Method car= new Method();
	car.name="Toyota";
	System.out.println(car.name);
	
	}
	
	public static void welcome() {
		System.out.println("Welcome");
	}
	
	public static void multiply(int a,int b) {
		
		System.out.println(a*b);
	}
	public static void divide(int a,int b) {
		System.out.println(a/b);
	}
	
	

}
