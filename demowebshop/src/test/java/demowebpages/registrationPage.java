package demowebpages;

import org.junit.Test;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import tcpackage.tcregister;

public class registrationPage {
	static WebDriver driver;
	WebElement Register,firstname, lastname, Gender, email, password,confirmpassword, submit;
	  Reporter re=new Reporter();
	   @Test
	 public void click_register() 
	{
		Register =driver.findElement(By.linkText("Register"));
		Register.click();
		  re.log("click register test case");
		     System.out.println("sucessfully regisration page is opened.....");
	
	}
	 public registrationPage(WebDriver driver)
	{
		registrationPage.driver = driver;
	}
	  @Test
	 public void entergender()
		{
			Gender = driver.findElement(By.name("Gender"));
			Gender.click();
			re.log("enter gender testcase");
			
		}
	  @Test
	public void enterFirstname(String s)
	{
		firstname = driver.findElement(By.name("FirstName"));
		firstname.sendKeys(s);
		re.log("enter first name test case");
		
	}
	  @Test
	public void enterlastname(String s)
	{
		lastname = driver.findElement(By.name("LastName"));
		lastname.sendKeys(s);
		re.log("enetr last name test case");
	}
	  @Test
	public void enteremail(String s)
	{
				email = driver.findElement(By.name("Email"));
						email.sendKeys(s);

		re.log("enter email test case");
	}
	  @Test
	public void enterpassword(String s)
	{
		password = driver.findElement(By.name("Password"));
		password.sendKeys(s);
		  re.log("enter pass test case");
	}
	   @Test
	public void enterconfirmpassword(String s)
	{
		confirmpassword= driver.findElement(By.name("ConfirmPassword"));
		confirmpassword.sendKeys(s);
		  re.log("enter conform pass");
	}
	   @Test
	public void entersubmit()
	{
		submit = driver.findElement(By.name("register-button"));
		submit.submit();
		   System.out.println("sucessfully registration is completed");
		 re.log("enter submit button");
	}
	   public static void Logger(String msg) {
			Logger lo=Logger.getLogger(tcregister.class.getName());
			lo.setLevel(Level.ALL);
			lo.info(msg);
		}

}
	
	
	
	
	
	