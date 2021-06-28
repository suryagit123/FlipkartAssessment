package Flipkart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Valid {
	WebDriver driver;
	
	
	public LoginPage_Valid(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement Email;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement password;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/a[1]")
	WebElement login;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
WebElement logo;
	
	public WebElement email() {
		return Email;
	}
	
	public WebElement pass() {
		return password;
	}
	public WebElement login() {
		return login;

}
	public WebElement logo() {
		return logo;
	}
}
