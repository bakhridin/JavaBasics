package ReviewClasses;

public class TwoDArrayEnhanced {

	public static void main(String[] args) {
		  int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		  
		  int sum=0;
		  
		  for(int[]row:num) {
			  for(int element:row) {
				  sum+=element;
				  System.out.print(element+" ");
			  }System.out.println();
		  }
             System.out.println("The sum of elements is "+sum);
	}

}
