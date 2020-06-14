package HomeWorkFrom04;

public class ReturnStatements {

	public static void main(String[] args) {
		printAMasage();
     int sum=add(8,8);
     System.out.println(sum);
    /////////////////////////////////////
     String shouting=caps("hello syntax");
     System.out.println(shouting);
    /////////////////////////////////////
     int[] goodArray=getArrayInt(3,4,5);
     System.out.println(goodArray[0]);
     System.out.println(goodArray[1]);
     System.out.println(goodArray[2]);
	}
	public static void printAMasage() {
		System.out.println("This is our first method");
	}
	
   public static int add(int a,int b) {
    	
    	return a+b;
    }
  public static String caps(String s) {
	   return s.toUpperCase();
   }
  public static int[] getArrayInt(int a,int b,int c) {
	  int[] array=new int[3];
	  array[0]=a;
	  array[1]=b;
	  array[2]=c;
	  
	  return array;
  }
  
      
	

}
