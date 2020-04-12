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
import demowebpages.login;




public class tclogin {
	public static WebDriver driver;
	login lo;
	
	static int i=1;
     Reporter rd=new Reporter();
	  addcard s;
	@SuppressWarnings("static-access")
	@BeforeTest
	@Given("^open application and click on Login link$")
	public void open_application_and_click_on_Login_link() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com");
		    takesnap();
			lo = new login(driver);
			lo.click_login();
			    rd.log("sucessfully login page is opend........");
			 login.Logger("launching browser");
		
		     
	    
	}
@SuppressWarnings("static-access")
@Test
	@When("^the user enters the valid username and valid password and click submit$")
	public void the_user_enters_the_valid_username_and_valid_password_and_click_submit() throws Throwable {

		lo.enteruser_Name("tata6123@gmail.com");
		lo.enterpass("SRI@123");
		lo.entersub();
		   rd.log("sucessfully navigates to HomePage");
		login.Logger("submit is sucessfully compeyted");
		 login.Logger("entered login details");
		
		  takesnap();
	    
	}
      @AfterTest
	@Then("^the system naviagates to HOME page$")
	public void the_system_naviagates_to_HOME_page() throws Throwable {
		System.out.println("user sucessfully navigates to home page.........."); 
		takesnap();
		    addcard s=new addcard(driver);
		    s.launch();
	        
	        s.click_desktops();
	        s.click_img();
	        s.addcard();
	        Thread.sleep(5000);

	        s.shoppinglink();
	        Thread.sleep(3000);
	        s.checkbox();
	        s.checkout();
	        Thread.sleep(3000);
	      s.buildingaddd();
	      Thread.sleep(3000);
	      s.ship();
	     Thread.sleep(5000);
	     s.sm();
	     Thread.sleep(5000);
	     s.cod();
	     Thread.sleep(5000);
	     s.payinfo();
	     Thread.sleep(5000);
	     s.conforder();
	     Thread.sleep(5000);
	     s.thank();
	     Thread.sleep(5000);
	      s.logout(); 



		     
		    
		          
		          
		            
		          
		          
		         
	    
	}
      public  static void  takesnap() throws IOException {
    	   File scrFile;
    		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		Files.copy(scrFile,new File("C:\\Users\\SUDHAKAR\\eclipse-workspace\\demowebshop\\src\\test\\resources\\com\\screenshots\\file"+ i +".pngs"));
    		i++;
    	     }


}
