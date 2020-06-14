package HomeWorkFrom04;

public class CalculTest {
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void mult(int a,int b) {
		System.out.println(a*b);
	}
	void div(int a, int b) {
		System.out.println(a/b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		CalculTest tot=new CalculTest();
		
		tot.add(12, 10);
		tot.div(20, 10);
		tot.mult(5, 10);
		tot.sub(23, 13);
		

	}

}
