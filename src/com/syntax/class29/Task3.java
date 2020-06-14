package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
		// Create a Set collection that will hold Objects of Student Type.
		//In this set we do not care about the insertion order. 
		//Each student object should have name and studentID. Display name of each student.
	     Set<Students> students = new LinkedHashSet<>();
	     
	        students.add(new Students("Nikitina", 123));
	        students.add(new Students("Kulik", 1234));
	        students.add(new Students("Ivan",1122));
	        students.add(new Students("Wowa",2334));
	        
	        
	        Iterator<Students> it = students.iterator();
	        while(it.hasNext()) {
	            Students obj = it.next();
	            obj.showInfo();
	        }

	}

}

class Students{
    String name;
    int ID;
    Students(String name, int ID){
        this.name= name;
        this.ID = ID;
        
    }
    
    void showInfo() {
        System.out.println("Students name " + name + " ID " + ID ) ;
    }
}
