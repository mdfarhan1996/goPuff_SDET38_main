package com.ecom.goPuff.pomrepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Restaurant {
	
		public Restaurant(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[contains(text(),'Restaurants')]")
		private WebElement restauranLink ;
		
		@FindBy(xpath="//a[text()='Eataly']/ancestor::div/following-sibling::div/descendant::a[text()='View Menu']")
		private WebElement viewmenuList ;

		public WebElement getRestauranLink() {
			return restauranLink;
		}

		public WebElement getViewmenuList() {
			return viewmenuList;
		}
		public void resturantClickNow() {
			restauranLink.click();
			
			 viewmenuList.click();
		}
}	