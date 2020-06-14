package GroupHW;

public abstract class Marks {
	double a,b,c;
	
	public abstract double getPercentage();

}
class A extends Marks{
	A(double a,double b,double c){
		super.a=a;
		super. b=b;
		super.c=c;
		
	}

	@Override
	public double getPercentage() {
		
		return (a+b+c)/3;
	}
	
}
class B extends Marks{
	double d;
	B(double a,double b,double c,double d){
		super.a=a;
		super.b=b;
		super.c=c;
		this.d=d;
		
		
	}

	@Override
	public double getPercentage() {
	
		return (a+b+c+d)/4;
	}
}
