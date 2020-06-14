package com.syntax.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		List<Exception>list=getAllExceptions();
		
		Iterator<Exception>lit=list.iterator();
		
		while(lit.hasNext()) {
			lit.next().printStackTrace();
		}
		 
	}
	
	public static List<Exception> getAllExceptions(){
		List<Exception>exceptionList=new ArrayList<>();
		
		//1 object of exception type
		int [] array= {1,2,3};
		
		try {
			System.out.println(array[4]);
		}catch(ArrayIndexOutOfBoundsException aob ) {
			exceptionList.add(aob);
			
		}
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException ae) {
			exceptionList.add(ae);
		}
		
		return exceptionList;
	}
	
}
