package org.stepdefinition;

import org.baseclass.Helper1;
import org.openqa.selenium.WebElement;
import org.pojo.Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbBulkData extends Helper1 {
	
	Pojo p;
	
	@Given("To configure the application")
	public void to_configure_the_application() {
		driver();
	}

	@When("To exeute app")
	public void to_exeute_app() {
		browserLaunch("https://www.facebook.com/");
	}

	@When("Pass the valid {string} on username textbox")
	public void pass_the_valid_on_username_textbox(String Emaildatas) {
		 p = new Pojo();
		 WebElement email = p.getEmail();
		 fillTxt(email, Emaildatas);
	}

	@When("Pass the valid {string} on password textbox")
	public void pass_the_valid_on_password_textbox(String Passworddatas) {
		p = new Pojo();
		WebElement passw = p.getPassw();
		fillTxt(passw,Passworddatas);
	}

	@When("Enter login btn")
	public void enter_login_btn() {
		p = new Pojo();
		WebElement logbtn = p.getLogbtn();
		click(logbtn);

	}

	@Then("Quit the browser")
	public void quit_the_browser() {
		close();
	}

}
