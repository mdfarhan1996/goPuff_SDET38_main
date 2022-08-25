package com.goPuff.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ecom.goPuff.genericutility.ExcelUtility;
import com.ecom.goPuff.genericutility.FileUtility;
import com.ecom.goPuff.genericutility.JavaUtility;
import com.ecom.goPuff.genericutility.WebDriverUtlity;
import com.ecom.goPuff.pomrepositoryLib.Register;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verify_the_usename_textfield_with_validdata {


	public static void main(String[] args) throws Throwable {
		//create an object to utility 
		WebDriverUtlity wlib=new WebDriverUtlity();
		FileUtility flib=new FileUtility();
		JavaUtility jlib=new JavaUtility();
		ExcelUtility elib=new ExcelUtility();
		//read data the from properties file
		String URL = flib.getPropertyKeyValue("REGURL");
		String browser = flib.getPropertyKeyValue("BROWSER");
		//get randomDomNum
		int intRanNum=jlib.getRanDomNumber();
		//read data from Excel
		String USERNAME = elib.getExcelData("sheet1",1,1)+intRanNum;
		String LASTNAME = elib.getExcelData("sheet1",1,2);
		String FIRSTNAME = elib.getExcelData("sheet1",1,3);
		String  EMAIL = intRanNum+elib.getExcelData("sheet1",1,4);
		String PASSWORD = elib.getExcelData("sheet1",1,6);
		String  CPASSWORD = elib.getExcelData("sheet1",1,7);
		String  PHONE = elib.getExcelData("sheet1",1,5);
		String  ADDRESS = elib.getExcelData("sheet1",1,8);
		 
		
		
WebDriver driver=null;
//Random ran=new Random();
//int random= ran.nextInt(100); 
//step 1: read the data from common data
//FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data\\commondata.properties");
//Properties prop=new Properties();
//prop.load(fis);

//String URL = prop.getProperty("url");
//String browser = prop.getProperty("BROWSER");
//step 2:read the data from excel
//FileInputStream fs=new FileInputStream(".\\src\\test\\resources\\data\\Exceluse1.xlsx");
// Workbook wb = WorkbookFactory.create(fs);
 //String USERNAME=wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
 //String LASTNAME=wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
 //String FIRSTNAME =wb.getSheet("sheet1").getRow(1).getCell(3).getStringCellValue();

// String EMAIL =wb.getSheet("sheet1").getRow(1).getCell(4).getStringCellValue();
 //String PASSWORD=wb.getSheet("sheet1").getRow(1).getCell(5).getStringCellValue();
 //String CPASSWORD=wb.getSheet("sheet1").getRow(1).getCell(6).getStringCellValue();
 //String PHONE=wb.getSheet("sheet1").getRow(1).getCell(7).getStringCellValue();
 //String ADDRESS=wb.getSheet("sheet1").getRow(1).getCell(8).getStringCellValue();
 
 
//step 3 launch the browser
if(browser.equalsIgnoreCase("chrome"))
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
}
driver.manage().window().maximize();
wlib.waitForElementInDOM(driver);

//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get(URL);

// step login to app
Register r=new Register(driver);
Thread.sleep(3000);
r.registerToApp(USERNAME, FIRSTNAME, LASTNAME, EMAIL, PHONE, PASSWORD, CPASSWORD, ADDRESS);

//driver.findElement(By.linkText("Register")).click();

//driver.findElement(By.name("username")).sendKeys(USERNAME);
//driver.findElement(By.name("firstname")).sendKeys(LASTNAME);
//driver.findElement(By.name("lastname")).sendKeys(FIRSTNAME );
//driver.findElement(By.name("email")).sendKeys(EMAIL);

//driver.findElement(By.name("phone")).sendKeys(PHONE);
//driver.findElement(By.name("password")).sendKeys(CPASSWORD);
//driver.findElement(By.name("cpassword")).sendKeys(CPASSWORD);
//driver.findElement(By.name("address")).sendKeys(ADDRESS);
//driver.findElement(By.name("submit")).click();



	
}
}
