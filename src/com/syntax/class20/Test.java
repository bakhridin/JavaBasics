package com.syntax.class20;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.empNumber=123;
		emp.salary=100.00;
		emp.getPaid();
		Employee.company="Suny";
		emp.work();
		System.out.println("-------------------------");
		
		ScrumTeam scr=new ScrumTeam();
		//features accessable from parent class
		scr.ceremonies="Grooming";
		scr.empNumber=456;
		scr.salary=90.00;
		scr.attendMeeting();
		scr.getPaid();
		scr.company="Suny";
		scr.work();
		//PRIVATE MEMBERS OF CLASS NOT AVAILABLE -->DO NOT PARTICIPATE INHERITANCE
		System.out.println("----------------------------");
		
		
		Tester tes=new Tester();
		tes.ceremonies="Meeting";
		tes.empNumber=555;
		tes.test();
		

	}

}
