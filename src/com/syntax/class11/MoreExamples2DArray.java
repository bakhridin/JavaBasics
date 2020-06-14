package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {

        //lets create 2D array in which we store professions
//        
//        String[][] professions= {
//                {"QA Tester", "Developers", "Product Owner", "Scrum Master"},
//                {"Math Teacher", "Science Teacher", "ESL Teacher"},
//                {"Dentist", "Surgeon"}
//        };
//        
//        //get elements using advanced for loop
//        
//        for(String[] occupation:professions) {
//            for(String title:occupation) {
//                System.out.print(title+" ");
//            }
//            System.out.println();
//        }
		
		String[][]auto= {
				{"Ford","GMC","Cadilac"},
				{"BMW","MERC","AUDI"},
				{"KIA","HUNDAY"},
				{"FERRARY","ALFAROEO"}
				
			};
		for(String[]car:auto) {
			for(String mob:car) {
			System.out.print(mob+" ");
			}
			System.out.println();
			
		}
		System.out.println("--TASK2-----");
		String[][]countries= {
				{"Canada","USA","CUBA"},
				{"PERU","BRAZIL","CHILY"},
				{"GB","GERMANY","ITALY"},
				{"CHINA","MALAYSIA"}
		};
		
		for(int count=0;count<countries.length;count++) {
			for(int i=0;i<countries[count].length;i++) {
			System.out.print(countries[count][i]+" ");
			}
			System.out.println();
		}
		
		

	}

}
