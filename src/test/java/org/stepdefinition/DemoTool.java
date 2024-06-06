package org.stepdefinition;

import org.baseclass.Helper1;
import org.openqa.selenium.WebElement;
import org.pojo.PojoSel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoTool extends Helper1{
	PojoSel p;

	@Given("config browser")
	public void config_browser() {
		driver();
	   
	}

	@When("launch browser")
	public void launch_browser() {
	   browserLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
	}

	@When("fill the value in the{string} fname textbox")
	public void fill_the_value_in_the_fname_textbox(String FirstName) {
		p = new PojoSel();
		WebElement getfName = p.getfName();
		fillTxt(getfName, FirstName);
	  
	}

	@When("fill the value in the{string} lname textbox")
	public void fill_the_value_in_the_lname_textbox(String LastName) {
		p = new PojoSel();
		WebElement getlName = p.getlName();
		fillTxt(getlName, LastName);
	   
	}

	@Then("browser qiut")
	public void browser_qiut() {
	  
	}


}
