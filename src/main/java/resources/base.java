package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException 
	{
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :"+ projectPath);
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(projectPath + "\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//Execute chrome driver
			System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//Execute firefox driver
			System.setProperty("webdriver.gecko.driver", projectPath +"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			//Execute IE driver
			System.setProperty("webdriver.gecko.driver", projectPath +"\\drivers\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
}
