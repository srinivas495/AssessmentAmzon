package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressAndPayment 
{
	
public WebDriver driver ;
	
	By FullName 	= By.id("address-ui-widgets-enterAddressFullName");
	By PhoneNumber 	= By.id("address-ui-widgets-enterAddressPhoneNumber");
	By PostalCode	= By.id("address-ui-widgets-enterAddressPostalCode");
	By FlatNo		= By.id("address-ui-widgets-enterAddressLine1");
	By Area		= By.id("address-ui-widgets-enterAddressLine2");
	By Landmark	= By.id("address-ui-widgets-landmark");
	
	
	public AddressAndPayment(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement FullName () 
	{
		return driver.findElement(FullName);
	}
	
	public WebElement PhoneNumber () 
	{
		return driver.findElement(PhoneNumber);
	}
	
	public WebElement PostalCode () 
	{
		return driver.findElement(PostalCode);
	}
	
	public WebElement FlatNo () 
	{
		return driver.findElement(FlatNo);
	}
	
	public WebElement Area () 
	{
		return driver.findElement(Area);
	}
	
	public WebElement Landmark () 
	{
		return driver.findElement(Landmark);
	}
	
}
