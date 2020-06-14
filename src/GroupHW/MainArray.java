package GroupHW;

import java.util.Iterator;
import java.util.LinkedList;

//import java.util.ArrayList;
//import java.util.Scanner;

public class MainArray {
	public static void main(String[] args) {
		
//  ArrayList<Integer>alist=new ArrayList<>();
//          Scanner scan=new Scanner(System.in);
//          
//       for(int i=0;i<5;i++) {
//    	   alist.add(scan.nextInt());
//    	   
//       }
//       for(int a:alist) {
//    	   System.out.print(a+" ");
//    	   
//       }

	    LinkedList<Integer>nu=new LinkedList<>();
	    for(int i=50;i<100;i++){
	       nu.add(i);
	    }
	         Iterator<Integer>n=nu.iterator();
	         while(n.hasNext()) {
	        	if(n.next()%3!=0) {
	        		n.remove();
	        		
	        	}
	        	 
	         }
	    System.out.print(nu);
	   
	
	}

		  }

	


