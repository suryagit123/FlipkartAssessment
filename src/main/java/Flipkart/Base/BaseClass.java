package Flipkart.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BaseClass  {
	protected static WebDriver  driver;
	
	@Test
	public WebDriver initializedriver() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\surya k\\OneDrive\\Pictures\\Saved Pictures//chromedriver.exe");

	  driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
		
	}
		
	}

