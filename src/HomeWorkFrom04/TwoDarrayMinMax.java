package HomeWorkFrom04;

public class TwoDarrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
	        // Iterating a 2D Array
	   /*     int rows = num.length;
	        for (int row = 0; row < rows; row++) {
	            for (int col = 0; col < num[row].length; col++) {
	                int element = num[row][col];
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	        // Sum a all elements in a 2D Array
	        int sum = 0;
	        // iterating rows
	        for (int row = 0; row < num.length; row++) {
	            // iterating elements of a row
	            for (int col = 0; col < num[row].length; col++) {
	                sum += num[row][col];
	            }
	        }
	        System.out.println("The sum of all number is " + sum);
	        
	        int max=num [0][0];
			int min=num [0][0];
			
			for (int row=0; row<num.length; row++) {
				int length1=num[row].length;
				for (int col=0; col<length1; col++) {
					if (num[row][col]>max) {
						max=num[row][col];
					}
					if (num[row][col]<min) {
						min=num[row][col];}
				}
			}System.out.println("Maximum number is " +max);
			System.out.println("Minimum number is " +min);
	      */
		 for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			} 
			System.out.println();
		 }
		 int sum=0;
		for (int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				 sum+=num[i][j];
			}
			
		}
		System.out.println("The sum of the numbers is "+sum);
		
		int max=num[0][0];
		int min=num[0][0];
		int element=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0; j<num[i].length;j++) {
				 element=num[i][j];
				if(element>max) {
					max=element;
				}
				else if(element<min) {
					min=element;
				}
			}
		}
		System.out.println("The maximum number is "+max);
		System.out.println("The minimum number is "+min);
	}

}
