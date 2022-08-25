package com.ecom.goPuff.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dishes {
	public Dishes (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Pink Spaghetti Gamberoni']/ancestor::div[@class='food-item']/descendant::input[@type='submit']")
	private WebElement PinkGamberoniList;
	
	@FindBy(xpath="//a[text()='Cheesy Mashed Potato']/ancestor::div[@class='food-item']/descendant::input[@type='submit']")
	private WebElement chessyList ;
	@FindBy(xpath="//i[@class='fa fa-trash pull-right']")
	private WebElement deletelink;

	public WebElement getDeletelink() {
		return deletelink;
	}

	public WebElement getPinkGamberoniList() {
		return PinkGamberoniList;
	}

	public WebElement getChessyList() {
		return chessyList;
	}

	public void selectDishes() {
		 chessyList.click();
		 PinkGamberoniList.click();
		 deletelink.click();
		 
	}
}
