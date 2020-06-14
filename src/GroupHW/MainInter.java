package GroupHW;

public class MainInter implements Interf {

	@Override
	public void method1() {
		System.out.println("implementation of method1");
		
	}

	@Override
	public void method2() {
		System.out.println("implementation of method2");
		
	}
	public static void main(String[] args) {
		MainInter obj=new MainInter();
		obj.method1();
		obj.method2();
		
	}

}
