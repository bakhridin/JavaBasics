package HomeWorkFrom04;

public class HWTestq7TwoDarray {

	public static void main(String[] args) {
		// write a program find largest/second largest/smallest  NUMBERS from INT2DARRAY-->Using for loop
		
		int[][] nums= {
				{21,22,23},
				{24,25,26},
				{27,28,29}
				};
		int largest=nums[0][0];
		int largest2=nums[0][0];
		int smallest=nums[0][0];
	
		
	/*	for(int i=1;i<nums.length;i++) {
			for(int j=1;j<nums[i].length;j++) {
				int element=nums[i][j];
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
		}*/
		
	/*	for(int i=1;i<nums.length;i++) {
			for(int j=1;j<nums[i].length;j++) {
				int element=nums[i][j];
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
				
		}
		*/
		// write a program find largest/second largest/smallest  NUMBERS from INT2DARRAY-->Using enhanced loop
		for(int[]row:nums) {
			for(int element:row) {
				if(element>largest) {
					largest2=largest;
					largest=element;
				}
				else if(element>largest2) {
					largest2=element;
				}
				else if(element>smallest) {
					smallest=element;
				}
			}
		}
		
		
		
		
       System.out.println("The largest number is "+largest);
       System.out.println("The second largest number is "+largest2);
       System.out.println("The smallest number is "+smallest);
       
	}

}
