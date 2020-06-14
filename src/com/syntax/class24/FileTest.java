package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
//		FilE obj=new JavaFile();
//		obj.open();
//		obj.edit();
//		obj.close();
//		
//		FilE obj1=new  WordFile();
//		obj1.open();
//		obj1.edit();
//		obj1.close();
//		
//		FilE obj2=new PDFFile();
//		obj2.open();
//		obj2.edit();
//		obj2.close();
//		
		
 FilE[] java= {new JavaFile(),new WordFile(),new PDFFile()};
 for(FilE jj:java) {
	 jj.open();
	 jj.edit();
	 jj.close();
	 
 }
	}

}
