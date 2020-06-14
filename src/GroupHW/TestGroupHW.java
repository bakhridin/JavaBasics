package GroupHW;

public class TestGroupHW {

	public static void main(String[] args) {
		
		Shape sp=new Circle();
		sp.calculateArea(5);
		sp.calculatePerimiter(6);
		
		System.out.println("---------------------");
		
		Shape sp1=new Square();
		sp1.calculateArea(4);
		sp1.calculatePerimiter(8);

	}

}
