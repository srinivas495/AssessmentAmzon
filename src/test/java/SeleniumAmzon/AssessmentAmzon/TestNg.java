package SeleniumAmzon.AssessmentAmzon;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.AddressAndPayment;
import pageObjects.HomePage;
import pageObjects.PlaceorderAndLogin;
import resources.base;


public class TestNg extends base{

	@Test
	
	public void basePageNavigation()  
	{
		System.out.println("Test");
	}
	
	@BeforeTest
	
	public void base()  
	{
		System.out.println("BeforeTest");
	}
	
	
	@AfterTest
	public void tearDownTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
	@DataProvider
	private Object[][] getData() {
		Object[][] data = new Object[1][1];   
	
		//0 th row
		data[0][0] = "Mobile";
	/*	data[0][1] = "9871536225";
		data[0][2] = "9871536225sS@";
		
		/1 st row 
		data[1][0] = "Mobile";
		data[1][1] = "9871536225";
		data[1][2] = "9871536225sS@"; 
		*/
		return data;
		
	}
}
