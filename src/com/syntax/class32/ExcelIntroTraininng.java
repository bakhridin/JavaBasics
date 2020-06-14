package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntroTraininng {

	public static void main(String[] args) throws IOException {
		
		
		String filePath=System.getProperty("user.dir")+"/configs/Book5.xlsx";

		 FileInputStream fis=new FileInputStream(filePath);
		 
		 Workbook wbook=new XSSFWorkbook(fis);
		 
		 Sheet sheet=wbook.getSheet("Sheet2");
		 
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
