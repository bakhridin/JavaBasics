package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
		
		//lets arraylist that stores Double type of objects
		//generic collection /arraylist
		
       ArrayList<Double> alist=new ArrayList<>();
       
       alist.add(10.99);
       alist.add(12.90);
       alist.add(100.99);
       System.out.println(alist);
       
       //replace element
       alist.set(1, 13.90);
       System.out.println(alist);
       
       //remove element
       alist.remove(13.90);
       System.out.println(alist);
       
       //retrieve single element
       System.out.println(alist.get(1));
       System.out.println("------retrieving all elements from collection------------");
       
       //retrieve all elements from collection
  //1 for advanced for loop
       for(double a:alist) {
    	   System.out.println(a);
    	  }
       System.out.println("-------regular for loop----------");
  //2 regular for loop
       for(int i=0;i<alist.size();i++) {
    	   double d=alist.get(i);
    	   System.out.println(alist.get(i)); //its possible too
    	   System.out.println(d);
    	  }
       System.out.println("---------retrive all elements from collection through Iterator--------------------");
       
  //3.Iterator
       Iterator<Double> iterator =alist.iterator();
          while(iterator.hasNext()) {
        	  //double d=iterator.next();
        	  //System.out.println(d);
        	  System.out.println(iterator.next());
        	  
        	
        	  
          }
       
       
       //retrieve all elements from collection
       
       
       System.out.println("-----------Non Generic collection------------------");
       
       //2 non generic collection
       ArrayList obj=new ArrayList();
       obj.add("hello");
       obj.add(100);
       obj.add('c');
       obj.addAll(alist);
       System.out.println(obj);
       
       //retrieve elements from non generic collection
       
       for(Object o:obj) {
    	   System.out.println(o);
    	   
       }

	}

}
