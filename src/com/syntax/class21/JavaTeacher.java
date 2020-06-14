package com.syntax.class21;

public class JavaTeacher extends Teacher {
	String certification;
	
	JavaTeacher(String name,String lastName,String certification){
		super(name,lastName);
		this.certification=certification;
	}

}
