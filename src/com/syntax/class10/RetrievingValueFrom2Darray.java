package com.syntax.class10;

public class RetrievingValueFrom2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]month= {
				{"Decaember","January","February"},
				{"March","April","May","M","V"},
				{"June","July","August"},
				{"September","October","November"}
				
			};
		
		/*   int rows=month.length;//how many arrays
	        int firstArray=month[1].length;
	        System.out.println(firstArray);
	        
	        for(int i=0; i<month.length; i++) {//iterates over rows
	            
	            for(int j=0; j<month[i].length; j++) {//iterates over columns
	                
	                System.out.print(month[i][j]+" ");
	            }
	            
	            System.out.println();
	        } */
		
		  int rows=month.length;//how many arrays
	        int firstArray=month[1].length;
	        System.out.println(firstArray);
	        
	        for(int i=0;i<month.length;i++) {
	        	for(int j=0;j<month[i].length;j++){
	        		System.out.println(month[i][j]);
	        		
	        	}
	        	System.out.println("I got shoping");
	        }
		
		
		
		
		
	}

}
