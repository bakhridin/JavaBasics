package GroupHW;

public class TestMarks {

	public static void main(String[] args) {
		Marks mk=new A(70,80,90);
		double cd=mk.getPercentage();
		System.out.println("Percentage of student A is "+mk.getPercentage());
		
		System.out.println("-----------------------------");
		
		Marks ms=new B(60,70,80,90);
		double ss=ms.getPercentage();
		System.out.println("Percentage of student B is  "+ss);
		
		

	}

}
