package com.ecom.goPuff.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	

	@FindBy(xpath="//a[text()='Home ']")
	private WebElement homelink;
	
	@FindBy(xpath="//a[text()='Order Now']")
	private WebElement ordernowbtn;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutlink;
	
	public WebElement getHomelink() {
		return homelink;
	}

	public WebElement getOrdernowbtn() {
		return ordernowbtn;
	}
	public WebElement getlogoutlink() {
		return logoutlink;
	}
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonordernow() {
		homelink.click();
		ordernowbtn.click();
		logoutlink.click();
	}
	
	
	
}
