package com.ecom.goPuff.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.ecom.goPuff.pomrepositoryLib.Home;
import com.ecom.goPuff.pomrepositoryLib.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	 /*Object Creation for Lib*/
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtlity wLib = new WebDriverUtlity();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	@BeforeSuite
	public void configBS() {
	 
	System.out.println("========================connect to DB========================");
	 
	}
	
	//@Parameters("BROWSER")
	@BeforeClass
	public void configBC( /*String BROWSER*/) throws Throwable {
	System.out.println("=============Launch the Browser=======");
	String BROW = fLib.getPropertyKeyValue("BROWSER");
	if(BROW.equalsIgnoreCase("chrome"));
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	sdriver=driver;
	driver.manage().window().maximize();
	wLib.waitForElementInDOM(driver);
    }
	@BeforeMethod
	public void configBM() throws Throwable {
	/*common Data*/
	String USERNAME = fLib.getPropertyKeyValue("username");
	String PASSWORD = fLib.getPropertyKeyValue("password");
	String URL = fLib.getPropertyKeyValue("url");
	
	System.out.println(URL);
	/* Navigate to app*/
	 driver.get(URL);

	}
	@AfterMethod
	public void configAM() {
	 /*step 6 : logout*/
	Home homePage = new Home(driver);
	 homePage.getlogoutlink();
	}
	@AfterClass
	public void configAC() {
	System.out.println("=============Close the Browser=======");
	driver.quit();
	}
	@AfterSuite
	public void configAS() {
	System.out.println("========================close DB========================");
	} }


