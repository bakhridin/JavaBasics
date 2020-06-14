package com.syntax.class24;

//Create a class File that will have the following behaviors: open, edit, close.
//Edit and close are implemented method while open is an abstract. 
//Create 3 subclasses: JavaFile, WordFile, PDFFile 
//that will provide specific implementation of open behaviour: 
//Example: to open .java file we need notepad++ or sublime text, 
//to open .doc file we need Microsoft word to be installed etc


public abstract class FilE {
	
	public abstract void open();
	
	public void edit() {
		System.out.println("Edit information");
	}
	public void close() {
		System.out.println("Close information");
	}
	
	

}
 class JavaFile extends FilE{
	
	@Override
	public void open(){
		System.out.println(" JavaFile opens fast");
	}
	
}
 class WordFile extends FilE{
	 public void open() {
		 System.out.println("WordFile");
	 }
 }
 class PDFFile extends FilE{
	 public void open() {
		 System.out.println();
	 }
 }
