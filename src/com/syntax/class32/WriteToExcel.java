package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/configs/Book5.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(5).setCellValue("Country");
		sheet.getRow(1).getCell(5).setCellValue("Jamshed");
		
		//Sheet testsheet = wbook.createSheet("TestSheet");
		
	  
		Sheet testsheet=wbook.getSheet("TestSheet");
			
		testsheet.createRow(0).createCell(0).setCellValue("Jamshed");
		testsheet.getRow(0).getCell(0).setCellValue("Umarov");
		
			
			
		
	FileOutputStream fos =new FileOutputStream(filePath);
		  wbook.write(fos);
       
	}

}
