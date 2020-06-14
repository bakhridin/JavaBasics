package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntroTraining1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/configs/Book5.xlsx");
		
		Workbook wbook=new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		
		String str=sheet.getRow(0).getCell(0).toString();
		System.out.println(str);
		
	   double cell=sheet.getRow(1).getCell(2).getNumericCellValue();
	    System.out.println((int)cell);
		
		int rows=sheet.getPhysicalNumberOfRows();
		
		int cols=sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<rows;r++) {
			for(int c=0;c<cols;c++) {
				
				String cellValue=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellValue+" ");
			}
			
			System.out.println();
		}

	}

}
