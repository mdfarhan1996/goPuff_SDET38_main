package com.goPuff.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ecom.goPuff.genericutility.BaseClass;
import com.ecom.goPuff.genericutility.ExcelUtility;
import com.ecom.goPuff.genericutility.FileUtility;
import com.ecom.goPuff.genericutility.JavaUtility;
import com.ecom.goPuff.genericutility.WebDriverUtlity;
import com.ecom.goPuff.pomrepositoryLib.Dishes;
import com.ecom.goPuff.pomrepositoryLib.Login;
import com.ecom.goPuff.pomrepositoryLib.Restaurant;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.ecom.goPuff.genericutility.LisImpClass.class)
public class DeleteButtonInCartTest extends BaseClass{
	
@Test
	public void verifydeleteButtonInCart() {
	 

//click on restaurant and view menu
	Restaurant r=new Restaurant(driver);
	r.resturantClickNow();
	
	//click  on dishes and select
	Dishes dishes=new Dishes(driver) ;
	
	dishes.selectDishes();
	//Assert.fail();




}
}
