package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class AddingConfig {

	public static void main(String[] args) throws IOException {
		
		String strPath="/Users/macbook/eclipse-workspace/JavaBasics02/configs/Examples.properties";
		
		FileInputStream fstream=new FileInputStream(strPath); 
		
		Properties prp=new Properties();
		
		prp.load(fstream);
		
		prp.setProperty("browser", "url");
		
		FileOutputStream foss=new FileOutputStream(strPath); 
		
		 prp.store(foss, "New adding");

	}

}
