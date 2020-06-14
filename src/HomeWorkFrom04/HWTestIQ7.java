package HomeWorkFrom04;

public class HWTestIQ7 {

	public static void main(String[] args) {
		// Write a program to find larges/second largest/smallest numbers from INTARRAY;
		
		int[] nums= {21,22,23,24,25,};
		
		int largest=nums[0];
		int largest2=nums[0];
		int smallest=nums[0];
		
	/*	for(int i=1;i<nums.length;i++) {
			int element=nums[i];
			if(element>largest) {
				largest2=largest;
				largest=element;
				
			}
			else if(element>largest2) {
				largest2=element;
			}
			else if(element<smallest) {
				smallest=element;
			}
		}
      */
		for(int i=1;i<nums.length;i++) {
			int element=nums[i];
			if(element>largest) {
				largest2=largest;
	
		largest=element;
			}
			else if(element>largest2) {
				largest2=element;
			}
			else if(element<smallest) {
				smallest=element;
			}
		}
		
		
		
		
		System.out.println("The largest is "+largest);
		System.out.println("The largest2 is "+largest2);
		System.out.println("The smallest is "+smallest);
	}

}
