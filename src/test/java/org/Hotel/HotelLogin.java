package org.Hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLogin extends Hotel{
	public HotelLogin() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id ="Login")
	private WebElement txtLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtLogin() {
		return txtLogin;
	}

}
