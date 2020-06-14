package GroupHW;

public abstract class Abstr {
	
	public abstract void m1();
	
	public abstract void m1(String str);

}

class Main extends Abstr{

	@Override
	public void m1() {
		System.out.println("m1 without parameters");
		
	}

	@Override
	public void m1(String str) {
		System.out.println(str+" method with parameter");
		
	}
	
	
}
