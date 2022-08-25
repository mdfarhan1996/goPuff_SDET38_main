package com.ecom.goPuff.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="password")
	private WebElement passWordEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn;

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPassWordEdt() {
		return passWordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void loginToapp(String userName,String password) {
		//* step to login
		userNameEdt.sendKeys(userName);
		userNameEdt.sendKeys(password);
		loginBtn.click();
	}
}
	