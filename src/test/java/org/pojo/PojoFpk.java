package org.pojo;

import org.baseclass.Helper1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFpk extends Helper1{
	
	
	public PojoFpk() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Inp;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement Otp;

	public WebElement getInp() {
		return Inp;
	}

	public WebElement getOtp() {
		return Otp;
	}

}
