package demowebpages;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import tcpackage.tclogin;

public class login {
	WebDriver driver;
	WebElement username,loginlog,password,sub;
	   
	   Reporter re=new Reporter();
       @SuppressWarnings("static-access")
	@Test
	 public void click_login()
		{
			loginlog =driver.findElement(By.linkText("Log in"));
			loginlog.click();
			   System.out.println("sucessfully login page is open.......");
			  re.log("login click");
			   
		}
          
	 public login(WebDriver driver)
		{
			this.driver = driver;
		}
          @SuppressWarnings("static-access")
		@Test
		public void enteruser_Name(String s)
		{
			username = driver.findElement(By.name("Email"));
			username.sendKeys(s);
			  re.log("enetr email");
		}
           @SuppressWarnings("static-access")
		@Test
		public void enterpass(String s)
		{
		password = 	driver.findElement(By.name("Password"));
		password.sendKeys(s);
		  re.log("enetr pass");
		}
          @SuppressWarnings("static-access")
		@Test
		public void entersub()
		{

			sub = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
			sub.submit();
			  System.out.println("navigates to demowebshop home page.......");
			re.log("enetr submit");
		}
          public static void Logger(String msg) {
				Logger lo=Logger.getLogger(tclogin.class.getName());
				lo.setLevel(Level.ALL);
				lo.info(msg);
			}




}