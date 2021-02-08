package SeleniumAmzon.AssessmentAmzon;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.AddressAndPayment;
import pageObjects.HomePage;
import pageObjects.PlaceorderAndLogin;
import resources.base;


public class AssessmentAmzon extends base{

	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String SearchContent) throws IOException, InterruptedException 
	{
	
		driver = initializeDriver();
		driver.get("https://www.amazon.in/");
				
		HomePage homePage = new HomePage(driver);
		
		homePage.SearchBox().sendKeys(SearchContent);
		homePage.SearchButton().click();
		homePage.SelectProduct().click();
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    
	    homePage.addToCart().click();
	    homePage.closeButton().click();
	    homePage.cart().click();
	    homePage.proceedCart().click();
	    Assert.assertEquals(homePage.ShoppingCartTitle().getText(), "Shopping Cart");
	    Assert.assertTrue(homePage.ShoppingCartTitle().isDisplayed());
	  //  homePage.proceedCheckOut().click();
	    
	    PlaceorderAndLogin Login = new PlaceorderAndLogin(driver);
	    
	    Login.MobileNumber().sendKeys("9871536225");
	    Login.Continue().click();
	    Login.Password().sendKeys("9871536225sS@");
	    Login.signInSubmit().click();
	    Thread.sleep(20000);
		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		AddressAndPayment Address = new AddressAndPayment(driver);
		Address.FullName().sendKeys("Srinivas");
		Address.PhoneNumber().sendKeys("9871536225");
		Address.PostalCode().sendKeys("500018");
		Address.FlatNo().sendKeys("102");
		Address.Area().sendKeys("Rkpeta");
		Address.Landmark().sendKeys("Postoffice");
		
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
