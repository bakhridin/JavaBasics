package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDataFromXL {

	public static void main(String[] args) throws IOException {
		
		
		String file=System.getProperty("user.dir")+"/configs/Book3.xlsx";
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int cols=sheet.getRow(0).getLastCellNum();
		
		List<Map<String,String>>lmap=new ArrayList();
		
		for(int r=1;r<rows;r++) {
			Map<String,String>map=new LinkedHashMap();
			for(int c=0;c<cols;c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			
			
			lmap.add(map);
			
		}
		System.out.println(lmap);
		
		for(Map<String,String>lp:lmap) {
			System.out.println(lp);
			
		}
		
		

	}

}