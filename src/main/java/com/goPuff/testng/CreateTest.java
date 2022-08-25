package com.goPuff.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateTest {
	
	
@BeforeClass

	public void createCustomer() {
		System.out.println("execute hdfc createCustomerTest");
	}
	

	
	

	@Test
	public void modifycreateCustomer() {
		System.out.println(" execute hdfc modifycreateCustomer");
	}
	
	@BeforeSuite
	public  void deletecreateCustomer() {
		System.out.println(" execute hdfc deleteCustomerTest");
	}
	
}
