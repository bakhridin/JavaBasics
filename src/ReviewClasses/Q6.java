package ReviewClasses;

public class Q6 {

	public static void main(String[] args) {
		// Write a Java program to find whether a String is palidrom or not?
		String str="radar kayak radar";
		
		//1st way
		char [] charArray=str.toCharArray();
		
		String revers="";
		
		for(int i=charArray.length-1;i>=0;i--) {
			revers+=charArray[i];
		}
		System.out.println("The word is "+str);
		System.out.println("The revers is "+revers);
		
		if(str.equals(revers)) {
			System.out.println("This is a palidrome");
		}
		else {
			System.out.println("It is not palidrome");
		}
		

	}

}
