package org.pojo;

import org.baseclass.Helper1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Helper1 {
	
	//Non parameterized constructor
	//private web element
	//getters
	
	public Pojo() {
		PageFactory.initElements(d, this);
	}
//	
//	@FindBy(xpath="//span[text()='Account']")
//	private WebElement Acc;
//	
//	@FindBy(xpath="//li[@data-text='Login/ Sign Up']")
//	private WebElement Mov;
//	
//	@FindBy(id = "mobileNoInp")
//	private WebElement Mob;
//	
//	@FindBy(xpath="")
//	private WebElement Clk;
//
//	
//
//	public WebElement getAcc() {
//		return Acc;
//	}

	




	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//fb login
	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(name="pass")
	private WebElement Passw;
	
	@FindBy(name="login")
	private WebElement Logbtn;

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassw() {
		return Passw;
	}

	public WebElement getLogbtn() {
		return Logbtn;
	}	
	
	
	
	//acthotel book
//	@FindBy(name="username")
//	private WebElement User;
//	
//	@FindBy(name="password")
//	private WebElement pass;
//	
//	@FindBy(name="login")
//	private WebElement Login;
//	
//	@FindBy(name="location")
//	private WebElement Loc;
//	
//	@FindBy(name="hotels")
//	private WebElement Hotel;
//	
//	@FindBy(name="room_type")
//	private WebElement RoomType;
//	
//	@FindBy(name="room_nos")
//	private WebElement NoRoom;
//	
//	@FindBy(name="datepick_in")
//	private WebElement ChkIn;
//	
//	@FindBy(name="datepick_out")
//	private WebElement ChkOut;
//	
//	@FindBy(name="adult_room")
//	private WebElement AdRoom;
//	
//	@FindBy(name="child_room")
//	private WebElement ChRoom;
//
//	public WebElement getUser() {
//		return User;
//	}
//
//	public WebElement getPass() {
//		return pass;
//	}
//
//	public WebElement getLogin() {
//		return Login;
//	}
//
//	public WebElement getLoc() {
//		return Loc;
//	}
//
//	public WebElement getHotel() {
//		return Hotel;
//	}
//
//	public WebElement getRoomType() {
//		return RoomType;
//	}
//
//	public WebElement getNoRoom() {
//		return NoRoom;
//	}
//
//	public WebElement getChkIn() {
//		return ChkIn;
//	}
//
//	public WebElement getChkOut() {
//		return ChkOut;
//	}
//
//	public WebElement getAdRoom() {
//		return AdRoom;
//	}
//
//	public WebElement getChRoom() {
//		return ChRoom;
//	}
//
//

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
