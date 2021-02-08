package SeleniumAmzon.AssessmentAmzon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ExcelData;

public class AmzonLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		ExcelData excel = new ExcelData(projectPath+ "/excel/data.xlsx", "Sheet1");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		excel.getRowCount();
		excel.getCellDataString(0,2);
		excel.getCellDataString(1,2);
		excel.getCellDataNumber(1,0);
		excel.getCellDataNumber(1,1);
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		//driver.findElement(By.id("ap_email")).sendKeys(excel.getCellDataString(1, 1));
	}


}
