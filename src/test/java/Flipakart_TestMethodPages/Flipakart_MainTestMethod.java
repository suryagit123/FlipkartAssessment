package Flipakart_TestMethodPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Flipkart.Base.BaseClass;
import Flipkart.ExcelData.ReadExcelFile;
import Flipkart.Pages.Flight_Page;
import Flipkart.Pages.LoginPage_Valid;
import Flipkart.Pages.LoginPage_invalid;
import Flipkart.Pages.Verify_Home;
import Flipkart.Pages.Verify_SearchBox;

public class Flipakart_MainTestMethod extends BaseClass {
	WebDriver driver;
  	ReadExcelFile userdata= new ReadExcelFile();
	//get properties of data
    Properties dataproperties = new Properties();

  
    @BeforeTest
    public void beforelaunch() {
    	System.out.println("Before launch browser");
    }
    
	
	@Test(priority=0)
	public void verify_validurl() throws IOException {
		
		driver = initializedriver();
		

		//get properties of data
	     dataproperties = new Properties();
		 
		File file = new File("C:\\Users\\surya k\\eclipse-workspace\\Flipkart_Assesment\\src\\main\\java\\Com\\properties\\config.properties");	
		FileInputStream input= new FileInputStream(file);
		dataproperties.load(input);
		 
		 //Launch url
		driver.get(dataproperties.getProperty("url"));

		//valid url
	
		System.out.println("user able to launch with valid url");
	
	}
	
	@Test(priority=1)
	public void verifylogo() {
		
		LoginPage_Valid login = new LoginPage_Valid(driver);

		boolean logo=login.logo().isDisplayed();
		System.out.println(logo);
		
		
	}
	
	
	@Test(priority=3)
	public void Login_validcred() throws InterruptedException, IOException {
		
		ArrayList<String> testdata=userdata.getdata("Flipkart");


	//valid cred
		LoginPage_Valid login = new LoginPage_Valid(driver);

		
		login.email().sendKeys(testdata.get(1));
	
		login.pass().sendKeys(testdata.get(2));
		login.pass().submit();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=2)
	public void loginpage_invalidcred() throws IOException {
		


		//invalid cred
              	LoginPage_invalid invalid=new LoginPage_invalid(driver);
              	
              	invalid.email().sendKeys(dataproperties.getProperty("username"));
        		
              	invalid.pass().sendKeys(dataproperties.getProperty("password"));
              	invalid.pass().submit();
             driver.navigate().refresh();
             

}
	
	@Test(priority=4)
public void verifyhome() {
	   
		//verify elements in home
	  Verify_Home home=new  Verify_Home(driver);
	  
	 boolean search= home.search().isEnabled();
	  System.out.println(search);
	  
	boolean cart=home.cartbutton().isDisplayed();
	 System.out.println(cart);
}

 
 @Test(priority=7)
 public void verify_electronics() {
	    WebElement electronics=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
Actions act=new Actions(driver);    
act.moveToElement(electronics);

 
 }
 
 @Test(priority=5)

 public void verify_search() throws InterruptedException {
	 Verify_SearchBox searchproduct =new Verify_SearchBox(driver);
	 
	 searchproduct.search().sendKeys(dataproperties.getProperty("mobilebrand"));
	 searchproduct.search().submit();
	 Thread.sleep(5000);
 }
 
 
 @Test(priority=6)
 public void flight_page() throws InterruptedException {
	 
	 Flight_Page page=new Flight_Page(driver);
	 page.searchflight().click();
	 
	 driver.navigate().to(dataproperties.getProperty("homeURL"));
	// driver.navigate().back(); 
	 Thread.sleep(5000);
	 
 }
 
 @Test(priority=8)
 public void invalidurl() {
	 
	 System.out.println("page has not launched");

	 driver.navigate().to("https://flipcart.com");
	 
 }
 
 
 
 
 

}
