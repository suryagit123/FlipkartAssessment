package Flipkart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_Home {
	
	
	WebDriver driver;

	public Verify_Home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/a[1]/span[1]")
	WebElement cart;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
	WebElement search;
	
	
	
	public WebElement cartbutton() {
		return cart;
	}
	
	public WebElement search() {
		return search;
	}
	
	
	
}
