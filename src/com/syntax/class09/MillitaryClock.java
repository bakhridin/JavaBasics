package com.syntax.class09;

public class MillitaryClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<=23;i++) {
			for(int y=0;y<=59;y++) {
				if(y<10) {
					System.out.println(i+":"+"0"+y);	
			}
				else {
				System.out.println(i+":"+y);
				}
				
			}
		}
		System.out.println("----------------------------");
		
	/*	for(int i=0;i<=9;i++) {
			for(int y=0;y<=9;y++) {
				for(int x=0;x<=9;x++) {
					for(int z=0;z<=9;z++) {
						System.out.println(i+""+y+""+x+""+z);
					}	
				}
			}
			
		}
		*/
		
	
	}
	}
