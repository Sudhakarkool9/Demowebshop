package tcpackage;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebpages.registrationPage;

public class tcregister {
	registrationPage register;
	public static WebDriver driver;
	   static int i=1;
	   
	    Reporter re=new Reporter();
	  @Test
	@Given("^open application and click on register link$")
	public void open_application_and_click_on_register_link() throws Throwable {
		  register.entergender();
			register.enterFirstname("harish");
			registrationPage.Logger("entered Firstname");
			 
			register.enterlastname("yadav");
			registrationPage.Logger("entered lastname");
			register.enteremail("tata6123@gmail.com");
			registrationPage.Logger("entered email");
			register.enterpassword("SRI@123");
			registrationPage.Logger("entered password");
			register.enterconfirmpassword("SRI@123");
			
		
	    
	}
	  @SuppressWarnings("static-access")
	@BeforeTest
	@When("^the user enter the details and click register$")
	public void the_user_enter_the_details_and_click_register() throws Throwable {
		  
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com");
		     re.log("sucessfully browser is open......");
		  registrationPage.Logger("opening browser");
		     takesnap();
		     
	     register  = new registrationPage(driver);
			register.click_register();
			     re.log("sucessfully registration page is open........");
			registrationPage.Logger("registrationpage opened");
			
			 takesnap();
	}
   @SuppressWarnings("static-access")
@AfterTest
	@Then("^the system stores the details and automatically log in page$")
	public void the_system_stores_the_details_and_automatically_log_in_page() throws Throwable {
		register.entersubmit();
		      re.log("sucessfully details entered.....&registration is completed");
		
	    
	}
     public  static void  takesnap() throws IOException {
   File scrFile;
	scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(scrFile,new File("C:\\Users\\SUDHAKAR\\eclipse-workspace\\demowebshop\\src\\test\\resources\\com\\screenshots\\file"+i+".pngs"));
	i++;
     }


	
	
}
