package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelntro {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/configs/Test.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		Row row1=sheet.getRow(0);
		
		Cell cell=row1.getCell(0);
		
		String row1cell1=cell.toString();
		System.out.println(row1cell1);
		
		Row row2=sheet.getRow(0);
		String cell2=row2.getCell(4).toString();
		
		System.out.println(cell2);
		
		double row2cell4=sheet.getRow(1).getCell(3).getNumericCellValue();
		
		System.out.println((int)row2cell4);
		

	}

}
