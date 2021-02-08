package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceorderAndLogin 
{
	public WebDriver driver ;
	
	By MobileNumber = By.id("ap_email");
	By Continue 	= By.id("continue");
	By Password		= By.id("ap_password");
	By signInSubmit		= By.id("signInSubmit");
	
	
	public PlaceorderAndLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement MobileNumber () 
	{
		return driver.findElement(MobileNumber);
	}
	
	public WebElement Continue () 
	{
		return driver.findElement(Continue);
	}
	
	public WebElement Password () 
	{
		return driver.findElement(Password);
	}
	
	public WebElement signInSubmit () 
	{
		return driver.findElement(signInSubmit);
	}
	
	
}
