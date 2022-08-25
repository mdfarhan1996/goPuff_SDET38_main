package com.goPuff.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup {

	public static void main(String[] args) {
WebDriverManager .chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.goibibo.com/");

Actions a=new Actions(driver);
a.moveByOffset(10,10).click().perform();
driver.findElement(By.xpath("//span[text()='Departure']")).click();
driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
driver.findElement(By.xpath("//div[@aria-label='Wed Oct 12 2022']")).click();
	}

}
