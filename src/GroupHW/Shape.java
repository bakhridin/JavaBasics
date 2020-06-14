package GroupHW;

public interface Shape {
	public  void calculateArea(int a);
	
	public void calculatePerimiter(int b);
	
}

 class Circle implements Shape{
	 double p=3.14;

	@Override
	public void calculateArea(int a) {
		
		
		System.out.println(" Area of circle is "+p*(a*a));
		
	}

	@Override
	public void calculatePerimiter(int b) {
		System.out.println("Perimeter of circle is "+2*p*b);
		
		
	}
	
	
}
 class Square implements Shape{

	@Override
	public void calculateArea(int a) {
		System.out.println("Area of square is "+a*a);
		
	}

	@Override
	public void calculatePerimiter(int b) {
		System.out.println("Perimeter of square is "+4*b);
		
	}
	 
 }

