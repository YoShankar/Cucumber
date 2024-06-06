package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {//read single data from excel
	
	public static void main(String[] args) throws IOException {
		
		//location of file
		File f = new File("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\Book1.xlsx");
		
		//read file
		FileInputStream fis  = new FileInputStream(f);
		
		//file format
		Workbook w = new XSSFWorkbook(fis);
		
		//get the Sheet
		Sheet s = w.getSheet("Sheet1");
//		
//		//get the row
//		Row row = s.getRow(0);
//		
//		//get the cell
//		
//		Cell cell = row.getCell(0);
//		System.out.println(cell);
//		
		
		//To read all values
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				//System.out.println(c);
				
				int cellType = c.getCellType();
				
		//to get all string datas
				if (cellType == 1) 
				{
					String Value = c.getStringCellValue();
					//System.out.println(Value);
					
				}
				else if (DateUtil.isCellDateFormatted(c)) //to get date cell value
				{
					Date d = c.getDateCellValue();
					SimpleDateFormat si = new SimpleDateFormat("MM-DD-YYYY");
					String form = si.format(d);
					//System.out.println(form);
				}
				
				else
				{
					double num = c.getNumericCellValue();
					long l = (long)num;
					String v = String.valueOf(l);
					System.out.println(v);
					
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
