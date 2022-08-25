package com.goPuff.register;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifytheusename_textfieldwithInValidData {
	public static void main(String[] args) throws IOException {
	WebDriver driver=null;
	//step 1: read the data from common data
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data\\commondata.properties");
	Properties prop=new Properties();
	prop.load(fis);

	String URL = prop.getProperty("url");
	String browser = prop.getProperty("BROWSER");
	//step 2:read the data from excel
	FileInputStream fs=new FileInputStream(".\\src\\test\\resources\\data\\Exceluse1.xlsx");
	 Workbook wb = WorkbookFactory.create(fs);
	 String USERNAME=wb.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
	 String LASTNAME=wb.getSheet("sheet1").getRow(2).getCell(2).getStringCellValue();
	 String FIRSTNAME =wb.getSheet("sheet1").getRow(2).getCell(3).getStringCellValue();

	 String EMAIL =wb.getSheet("sheet1").getRow(2).getCell(4).getStringCellValue();
	 String PASSWORD=wb.getSheet("sheet1").getRow(2).getCell(5).getStringCellValue();
	 String CPASSWORD=wb.getSheet("sheet1").getRow(2).getCell(6).getStringCellValue();
	 String PHONE=wb.getSheet("sheet1").getRow(2).getCell(7).getStringCellValue();
	 String ADDRESS=wb.getSheet("sheet1").getRow(2).getCell(8).getStringCellValue();
	 
	 
	//step 3 launch the browser
	if(browser.equalsIgnoreCase("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(URL);

	// step login to app
	driver.findElement(By.linkText("Register")).click();

	driver.findElement(By.name("username")).sendKeys(USERNAME);
	driver.findElement(By.name("firstname")).sendKeys(LASTNAME);
	driver.findElement(By.name("lastname")).sendKeys(FIRSTNAME );
	driver.findElement(By.name("email")).sendKeys(EMAIL);

	driver.findElement(By.name("phone")).sendKeys(PHONE);
	driver.findElement(By.name("password")).sendKeys(CPASSWORD);
	driver.findElement(By.name("cpassword")).sendKeys(CPASSWORD);
	driver.findElement(By.name("address")).sendKeys(ADDRESS);
	driver.findElement(By.name("submit")).click();



		
	}
	

	}


