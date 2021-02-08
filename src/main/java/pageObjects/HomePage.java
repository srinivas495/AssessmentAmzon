package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver ;
	
	By SearchBox 	= By.id("twotabsearchtextbox");
	By SearchButton = By.xpath("//*[@id=\"nav-search-submit-text\"]/input");
	By SelectProduct = By.xpath("//*[@class='a-link-normal a-text-normal']");
	By addToCart  	 = By.cssSelector("input[id='add-to-cart-button']");
	By closeButton   = By.id("attach-close_sideSheet-link");
	By cart   = By.id("nav-cart");
	By proceedCart		= By.xpath("//*[@class='a-button-inner']");
	By ShoppingCartTitle	= By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div[1]/h1");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement SearchBox () 
	{
		return driver.findElement(SearchBox);
	}
			
	public WebElement SearchButton () 
	{
		return driver.findElement(SearchButton);
	}
	
	public WebElement SelectProduct () 
	{
		return driver.findElement(SelectProduct);
	}
	
	public WebElement addToCart () 
	{
		return driver.findElement(addToCart);
	}
	
	public WebElement closeButton () 
	{
		return driver.findElement(closeButton);
	}
	
	public WebElement cart () 
	{
		return driver.findElement(cart);
	}
			
	public WebElement proceedCart () 
	{
		return driver.findElement(proceedCart);
	}
	
	public WebElement ShoppingCartTitle () 
	{
		return driver.findElement(ShoppingCartTitle);
	}
			
		
}
