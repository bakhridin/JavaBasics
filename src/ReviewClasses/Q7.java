package ReviewClasses;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
	
		//write a java program to find the second largest number in the array?
		
		//maximum and minimum in the array?
		
		int[] numbers= {32,61,16,89,74,25};
		
		//--------1ST WAY-------
		Arrays.sort(numbers);
		System.out.println("The smallest number is "+numbers[0]);
	      System.out.println("The largest number is "+numbers[numbers.length-1]);
            System.out.println("The second largest number is "+numbers[numbers.length-2]);
            
        //-------2ND WAY----------
           
            int[] numbers2= {32,61,16,89,74,25};
            
            int smallest=numbers2[0];
            int largest=numbers2[0];
            int largest2=numbers[0];
            int element=0;
            
          for(int i=1;i<numbers2.length;i++) {
        	  element=numbers2[i];
        	  if(element>largest) {
        		  largest=element;
        		  
        	  }else if(element>largest2) {
        		  largest2=element;
        	  }else if(element<smallest) {
        		  smallest=element;
        	  }
          }
          System.out.println("The largest is "+largest);
          System.out.println("The largest2 is "+largest2);
          System.out.println("The smallest is "+smallest);
	}

}
