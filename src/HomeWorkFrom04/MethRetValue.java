package HomeWorkFrom04;

public class MethRetValue {

	public static void main(String[] args) {
		String str="Hello my friend";
		int length=str.length();
		
	if(length>10) {
		System.out.println("String is long");
	}else {
		System.out.println("String is short");
	}
	
    //
	MethRetValue newObject=new MethRetValue();

	int num=newObject.largest(8, 7);
	System.out.println(num);
	//////////////////////////////////////
	boolean flag=newObject.isOdd(9);
	System.out.println(flag);
	

	}
	
	int largest(int a,int b) {
		int largest;
		if(a>b) {
			largest=a;
			
		}else {
			largest=b;
		}
		return largest;
	}
	//////////////////////////////////////
	boolean isOdd(int nam) {
		boolean isOdd;
		if(nam%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
		return isOdd;
	}
	///////////////////////////////////////

}
