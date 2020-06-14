package com.syntax.class10;

public class RetrievElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grades= {'A','B','C','D','E','F'};
		  //getting all elements
		 for(int i=0;i<grades.length;i++) {
			 System.out.print(grades[i]);
		 }
		 System.out.println();
		 System.out.println("----Printing using advanced elements----");
		 
		 for(char grade:grades) {
			 System.out.println(grade+" ");
		 }
		
		
	String[] fruits= {"Banana","Kiwi","Orange","Apple","Mango",};
	//if fruit is apple-->that is your favorite fruit
	
	//advanced loop,enhanced for loop,for each loop
	  for(String fruit:fruits) {
		  if(fruit.equals("Apple")) {
			  System.out.println(fruit+" is yourmfavorite fruit");
		  }else {
			  System.out.println(fruit);
		  }
	  }
	  System.out.println("---------------------");
	  
	  //regular for loop
      //fruits.length=number of elements
	  for(int i=0;i<fruits.length;i++) {
		
		  System.out.println(fruits[i]);
	  } 
	  
	}

}
