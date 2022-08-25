package com.goPuff.register;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_and_test_featured_restaurant {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=null;

		//step1:use file input stream to load the property file
        FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data\\commondata.properties");	//RC ON COMMOMDATA AND NAVIGATE TO PROPERTIES AND COPY PATH
		//TAKE PATH AFTER PROJECT NAME         


		//step 2:CREATE OBJECT OF PROPERTIES AND LOAD THE FILE
		Properties prop=new Properties();
		prop.load(fis);


		//step 3:provide the key to read the value
		String URL = prop.getProperty("url");
        String UN = prop.getProperty("username"); 
        String PWD = prop.getProperty("password");
        String BROW = prop.getProperty("BROWSER");
        
        //step 2:read the test data from excelsheet

//		FileInputStream fileExcel=new FileInputStream(".\\src\\test\\resources\\data\\commondata.properties");
//		Workbook wb = WorkbookFactory.create(fileExcel);
//		String data = wb.getSheet("sheet1").getRow(1).getCell(4).getStringCellValue();
//       System.out.println(data);
//		
//         String data1 = wb.getSheet("sheet1").getRow(2).getCell(4).getStringCellValue();
//         System.out.println(data1);
//         
		//step 3:launch the browser 

	if(BROW.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		else if(BROW.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
		System.out.println("INCORRET BROWSER");
			//OR U CAN WRTE THE CODE FOR CHROMERIVER AS DEFAULT BROWSER
		}
		driver.manage().window().maximize(); // MAXIMIZE THE WINDOW
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //SYNCHRONIZATION
	    driver.get(URL);	

		//step:4 login to the application		
		driver.findElement(By.linkText("Login")).click();         //CLICK ON LOGIN
		driver.findElement(By.name("username")).sendKeys(UN);      //ENTER USERNAME
		driver.findElement(By.name("password")).sendKeys(PWD);	   //ENTER PASSWORD
		driver.findElement(By.id("buttn")).click();                //CLICK ON LOGIN
//	

	}

}
