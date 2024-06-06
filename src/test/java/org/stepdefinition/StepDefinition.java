package org.stepdefinition;

import java.io.IOException;

import org.baseclass.Helper1;
import org.openqa.selenium.WebElement;
import org.pojo.Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Helper1 {
	
	Pojo p;
	
	@Given("To configure the browser")
	public void to_configure_the_browser() {
			driver();
	}

	@When("To launch application")
	public void to_launch_application() {
			browserLaunch("https://www.facebook.com/");

	}

	@When("To enter valid username on email textbox")
	public  void to_enter_valid_username_on_email_textbox() throws IOException {
		 p = new Pojo();
		 WebElement email = p.getEmail();
		 String excelRead = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\fb.xlsx", "Sheet1", 0, 0);
		 fillTxt(email, excelRead);
	}

	@When("to enter valid password on password textbox")
	public void to_enter_valid_password_on_password_textbox() throws IOException {
		p = new Pojo();
		WebElement passw = p.getPassw();
		String excelRead1 = p.ExcelRead("C:\\Users\\91958\\eclipse-workspace\\NewCucumber\\Excel\\fb.xlsx", "Sheet1", 1, 0);
		 fillTxt(passw, excelRead1);
		


	}

	@When("To click login button")
	public void to_click_login_button() {
		p = new Pojo();
		WebElement logbtn = p.getLogbtn();
		click(logbtn);


	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		close();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
