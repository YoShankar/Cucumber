package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helper1 {
	public static WebDriver d;
	public static Actions a;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Alert a2;
	public static Select s;
	public static void driver() {
	 d = new ChromeDriver();
	}
	
	public static void browserLaunch(String url) {
		d.get(url);
	}
	
	public static void maxWindow() {
		d.manage().window().maximize();

	}
	public static void fillTxt(WebElement text , String value) {
		text.sendKeys(value);

	}

	public static void click(WebElement element) {
		element.click();

	}
	public static void title() {
		String title = d.getTitle();
		System.out.println(title);

	}
	public static void action(WebElement target) {
		 a = new Actions(d);
		 a.moveToElement(target).perform();

	}
	public static void javaScript(String script , WebElement args) {
		 js = (JavascriptExecutor)d;
		 js.executeScript(script, args);

	}
	
	public static void Screenshot(String location ) throws IOException {
		 ts = (TakesScreenshot)d;
		 File target = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File(location);
		 FileUtils.copyFile(target, destination);

	}
	public static void time(long sleep) throws InterruptedException {
		Thread.sleep(sleep);

	}
	
	public static void implict(long duration) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));

	}
	
	public static void frame(WebElement element) {
		d.switchTo().frame(element);

	}
	
	public static void frameId(String id) {
		d.switchTo().frame(id);

	}
	
	public static void frameIndex(int indexPos) {
		d.switchTo().frame(indexPos);

	}
	
	public static void alert() {
		 a2 = d.switchTo().alert();

	}
	public static void alertMethods() {
		a2.accept();

	}
	
	public static void close() {
		d.close();
		

	}
	
	public static void SellectByValue(WebElement WebElement,String value) {
		s = new Select(WebElement);
		s.selectByValue(value);	
	}
	public static void SellectByIndex(WebElement Webelement,int index) {
		
		
		s = new Select(Webelement);
		s.selectByIndex(index);
	}
	
	public static void SellectByVisibleText(WebElement Webelement, String text) {
		s = new Select(Webelement);
		s.selectByVisibleText(text);
	}
	public static void dateTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String  ExcelRead(String location, String SheetName, int r ,int c) throws IOException {
		
		//location of file
		File f = new File(location);
		
		//read file
		FileInputStream fis  = new FileInputStream(f);
		
		//file format
		Workbook w = new XSSFWorkbook(fis);
		
		//get the Sheet
		Sheet s = w.getSheet(SheetName);
		
		//get the row
		Row ro = s.getRow(r);
		
		Cell co = ro.getCell(c);
		
		int cellType = co.getCellType();
		
		String value="";
				
		
				if (cellType == 1) //to get all string datas
				{
					 value = co.getStringCellValue();
					//System.out.println(Value);
					
				}
				else if (DateUtil.isCellDateFormatted(co)) //to get date cell value
				{
					Date d = co.getDateCellValue();
					SimpleDateFormat si = new SimpleDateFormat("MM-DD-YYYY");
					String form = si.format(d);
					//System.out.println(form);
				}
				
				else // To get numerical value
				{
					double num = co.getNumericCellValue();
					long l = (long)num;
					value = String.valueOf(l);
					System.out.println(value);
					
				}
				return value;

	}
	
	public static void totalRowCell(String location,String SheetName) throws IOException {
		//location of file
		File f = new File(location);
		
		//read file
		FileInputStream fis  = new FileInputStream(f);
		
		//file format
		Workbook w = new XSSFWorkbook(fis);
		
		//get the Sheet
		Sheet s = w.getSheet(SheetName);
		
		Row row = s.getRow(0);
		int rowno = s.getPhysicalNumberOfRows();
		
		int cellno = row.getPhysicalNumberOfCells();
		System.out.println(rowno);
		System.out.println(cellno);	
		
	}
	public static void allRowCell(String location, String SheetName) throws IOException {
		//location of file
		File f = new File(location);
		
		//read file
		FileInputStream fis  = new FileInputStream(f);
		
		//file format
		Workbook w = new XSSFWorkbook(fis);
		
		//get the Sheet
		Sheet s = w.getSheet(SheetName);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			
			System.out.println(cell);
			
		}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
