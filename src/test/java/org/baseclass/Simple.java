package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.pojo.Pojo;

public class Simple  extends Helper1{
	public static void main(String[] args) throws IOException  {
		
			
//		driver();
//		browserLaunch("http://www.adactin.com/HotelApp/");
//		maxWindow();
//		Pojo p = new Pojo();
//		
//		implict(10);
//	// username
//		WebElement user = p.getUser();
//	    fillTxt(user, "Ragnarlothbrok");
//	//password
//	    WebElement pass = p.getPass();
//	    fillTxt(pass, "asdfghjkl123");  
//    //login
//	    WebElement login = p.getLogin();
//	    click(login);  
//	//select location
//	    WebElement loc = p.getLoc();
//	    String excelRead = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 0, 0);
//	    SellectByVisibleText(loc, excelRead);
//	     
//	//select hotels
//	    WebElement hotel = p.getHotel();
//	    String excelRead1 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 0, 1); 
//	    SellectByVisibleText(hotel, excelRead1);
//	    
//	    //select room type
//	    WebElement roomType = p.getRoomType();
//	    String excelRead2 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 1, 0);	
//	    SellectByVisibleText(roomType, excelRead2);
//	    
//	    //select number of rooms
//	    WebElement noRoom = p.getNoRoom();
//	    String excelRead3 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 1, 1);
//	    SellectByIndex(noRoom, 1);
//	    
//	    //check in date
//	    WebElement chkIn = p.getChkIn();
//	    String excelRead4 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 2, 0);
//	    fillTxt(chkIn, excelRead4);
//	    
//	    //check out date
//	    WebElement chkOut = p.getChkOut();
//	    String excelRead5 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 2, 1);
//	    fillTxt(chkOut, excelRead5);
//	    
//	    //adult per room
//	    WebElement adRoom = p.getAdRoom();
//	    String excelRead6 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 3, 0);
//	    SellectByIndex(adRoom, 1);
//	    
//	    //child per room
//	    WebElement chRoom = p.getChRoom();
//	    String excelRead7 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 3, 1);
//	    SellectByIndex(chRoom, 0);
//	    
//	    //search
//	    WebElement srch = d.findElement(By.name("Submit"));
//	    click(srch);
//	    

		
		
		
		
		
		
		
		
		
		
		
	}	
}
















// to get the data from excel


//
//	driver();
//	browserLaunch("https://my.naukri.com/account/register/basicdetails");
//	maxWindow();

//	
//	WebElement e1 = d.findElement(By.id("name"));
//	String r = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\naukri.xlsx","Sheet1", 0, 0);
//	fillTxt(e1, r);
//	WebElement e2 = d.findElement(By.id("email"));
//	String r1 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\naukri.xlsx","Sheet1", 0, 1);
//	fillTxt(e2, r1);
//	
//	WebElement e3 = d.findElement(By.id("password"));
//	String r2 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\naukri.xlsx", "Sheet1", 1, 0);
//	fillTxt(e3, r2);
//	WebElement e4 = d.findElement(By.id("mobile"));
//	String r3 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\naukri.xlsx", "Sheet1", 1, 1);
//	fillTxt(e4, r3);
//	
//	WebElement btn = d.findElement(By.xpath("//div[@data-val='exp']"));
//	click(btn);
//	
//	WebElement tick = d.findElement(By.xpath("//button[text()='Register now']"));
//	click(tick);
	
	//WebElement e5 = d.findElement(By.id("datepick_in"));
	//String r4 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 2, 0);
	//fillTxt(e5, r4);
	//WebElement e6 = d.findElement(By.id("datepick_out"));
	//String r5 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 2, 1);
	//fillTxt(e6, r5);
	//
	//WebElement e7 = d.findElement(By.id("adult_room"));
	//String r6 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 3, 0);
	//fillTxt(e7, r6);
	//
	//WebElement e9 = d.findElement(By.id("child_room"));
	//String r8 = ExcelRead("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Excel\\hotel.xlsx", "Sheet1", 3, 1);
	//fillTxt(e9, r8);
	//
	//WebElement e5 = d.findElement(By.name("country"));
	//Select s = new Select(e5);
	//s.selectByVisibleText("India");
	
































































//Screenshot("C:\\Users\\91958\\eclipse-workspace\\MavenProject\\Snap\\f.png");
