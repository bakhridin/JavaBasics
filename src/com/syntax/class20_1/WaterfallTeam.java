package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterfallTeam extends Employee {
	public static void main(String[] args) {
		
		WaterfallTeam wteam=new WaterfallTeam();
		WaterfallTeam.company="Syntax";
		wteam.empNumber=124;//protected access modifiers member visible to the child class in different Package
		//wtem.salary-->is not visible because it is default access modifier;
		
	}
	

}
