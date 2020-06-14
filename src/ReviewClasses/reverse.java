package ReviewClasses;

public class reverse {

	public static void main(String[] args) {
	
		reverse obj=new reverse();
		System.out.println(obj.revers("hello"));
	}
	  final StringBuffer revers(String a){
		    StringBuffer str=new StringBuffer(a);
		 
		    return  str.reverse();

		   }

}
