package Flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight_Page {

	WebDriver driver;

	public Flight_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

		
	}
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
	WebElement flight;

	public WebElement searchflight() {
		return flight;
	}
}
