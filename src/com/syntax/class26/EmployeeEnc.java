package com.syntax.class26;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Create an Employee class that will be fully encapsulated and will have:

//variables as FullName, ssn and salary
//constructor to initialize instance variables
//getters to have an access to instance variables

//Create a set collection that will store # objects of 
//Employee type and using Iterator print the value of each variable

public class EmployeeEnc {

	private String FullName;
	private int ssn;
	private double salary;

	public String getFullName() {
		return FullName;
	}
//
//	public void setFullName(String fullName) {
//		FullName = fullName;
//	}

	public int getSsn() {
		return ssn;
	}

//	public void setSsn(int ssn) {
//		this.ssn = ssn;
//	}

	public double getSalary() {
		return salary;
	}

//	public void setSalary(double salary) {
//		this.salary = salary;
//	}

	EmployeeEnc(String FullName, int ssn, double salary) {
		this.FullName = FullName;
		this.ssn = ssn;
		this.salary = salary;

	}
      public static void main(String[] args) {
		
    	  Set<EmployeeEnc>scl=new LinkedHashSet<>();
    	  scl.add(new EmployeeEnc("John Doe",123,20.0));
    	  scl.add(new EmployeeEnc("Jane",321,30.0));
    	  scl.add(new EmployeeEnc("James",433,40.0));
    	
    	  
    	  Iterator<EmployeeEnc>its=scl.iterator();
    	  while(its.hasNext()) {
    		  EmployeeEnc c=its.next();
    		  System.out.println(c.getFullName());
    		  System.out.println(c.getSsn());
    		  System.out.println(c.getSalary());
    	  }
    	  
	}
}
