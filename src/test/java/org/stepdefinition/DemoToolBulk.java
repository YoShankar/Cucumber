package org.stepdefinition;

import java.io.IOException;

import org.baseclass.Helper1;
import org.openqa.selenium.WebElement;
import org.pojo.PojoSel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoToolBulk extends Helper1 {
	
	PojoSel p;
	
	@Given("browser config")
	public void browser_config() {
	   driver();
	}

	@When("browser launch")
	public void browser_launch() {
	   browserLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
	}

	@When("pass the values in the firstname textbox")
	public void pass_the_values_in_the_firstname_textbox() throws IOException {
	    p = new PojoSel();
	    WebElement getfName = p.getfName();
	    String e = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\dtool.xlsx", "Sheet1", 0, 0);
	    fillTxt(getfName, e);
	}

	@When("pass the values in the lasttname textbox")
	public void pass_the_values_in_the_lasttname_textbox() throws IOException {
		p = new PojoSel();
		WebElement getlName = p.getlName();
		String e1 = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\dtool.xlsx", "Sheet1", 0, 1);
		fillTxt(getlName, e1);
	    
	}

	@When("pass the values in the email textbox")
	public void pass_the_values_in_the_email_textbox() throws IOException {
		p = new PojoSel();
		WebElement emailTxt = p.getEmailTxt();
		  String e2 = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\dtool.xlsx", "Sheet1", 1, 0);
		    fillTxt(emailTxt, e2);
	   
	}

	@When("pass the values in the mobilenumber textbox")
	public void pass_the_values_in_the_mobilenumber_textbox() throws IOException {
		p = new PojoSel();
		WebElement mobileTxt = p.getMobileTxt();
		  String e3 = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\dtool.xlsx", "Sheet1", 1, 1);
		    fillTxt(mobileTxt, e3);
	}

	@When("pass the values in the country textbox")
	public void pass_the_values_in_the_country_textbox() throws IOException {
		p = new PojoSel();
		WebElement ctry = p.getCtry();
		  String e4 = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\dtool.xlsx", "Sheet1", 2, 0);
		    fillTxt(ctry, e4);

	}

	@When("pass the values in the city textbox")
	public void pass_the_values_in_the_city_textbox() throws IOException {
		p = new PojoSel();
		WebElement city = p.getCity();
		  String e5 = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\dtool.xlsx", "Sheet1", 2, 1);
		    fillTxt(city, e5);

	}

	@When("pass the values in the messgae textbox")
	public void pass_the_values_in_the_messgae_textbox() throws IOException {
		p = new PojoSel();
		WebElement msg = p.getMsg();
		  String e6 = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\dtool.xlsx", "Sheet1", 3, 0);
		    fillTxt(msg, e6);

	}

	@Then("Quit browser")
	public void quit_browser() {


	}



}
