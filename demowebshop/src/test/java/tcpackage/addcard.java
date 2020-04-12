package tcpackage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.google.common.io.Files;

public class addcard {
	

	  int i=1;
	 public WebDriver driver;
	  WebElement link,link1,img,add,sh,ch,checkout,ig,gu,deta,con;
	    Reporter ro=new Reporter();
	           
@SuppressWarnings("static-access")
public void launch()
{
	    	   
	  link =driver.findElement(By.partialLinkText("Computers"));
		link.click();
		  System.out.println("sucessfully clicked computer categorty......");
		  ro.log("click on the computers link");
		 }
 
public addcard(WebDriver driver)
{
	this.driver=driver;
}
		
@SuppressWarnings("static-access")
public void click_desktops() throws IOException {
	         link1=driver.findElement(By.partialLinkText("Desktops"));
	             link1.click();
	             System.out.println("sucessfully clicked desktop product......");
	              ro.log("click on the desktops");
	             takesnap();
}
@SuppressWarnings("static-access")
public void click_img() throws IOException {
	        img=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img"));
	          img.click();
	           ro.log("click on the img");
	          takesnap();
	            System.out.println("hii");
	         
}
@SuppressWarnings("static-access")
public void addcard() throws IOException {
	     add = driver.findElement(By.id("add-to-cart-button-72"));
	       add.click();
	       ro.log("select the add card");
	       System.out.println("sucessfully product is added to card......");
	       takesnap();
	        System.out.println("hello");
}
@SuppressWarnings("static-access")
public void shoppinglink() throws IOException {
	        sh=driver.findElement(By.partialLinkText("Shopping cart"));
	          sh.click();
	           ro.log("click on the shopping link");
	           System.out.println("sucessfully product is shipped to billing......");
	          takesnap();
	            System.out.println("hkkk");
	           
}
@SuppressWarnings("static-access")
public void checkbox() throws IOException  {
    ch=driver.findElement(By.id("termsofservice"));
      ch.click();
      System.out.println("sucessfully user click on the checkout button......");
        ro.log("click on the check box");
      takesnap();
        System.out.println("checkbox");
      
}
  

@SuppressWarnings("static-access")
public void checkout() throws IOException {
    checkout=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
      checkout.click();
      System.out.println("sucessfully checkout......");
      ro.log("click on the checkout");
      takesnap();
      System.out.println("hii");
}
@SuppressWarnings("static-access")
public void gustregister() throws IOException {
	     gu =driver.findElement(By.className("button-1 checkout-as-guest-button"));
	       gu.click();
	       ro.log("click on the guest register");
	       takesnap();
	         System.out.println("bbbbb");
}
	    public void buildingaddd() {
	  	  Select s=new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")));
	       s.selectByVisibleText("India");

	 	  deta=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]"));
		    deta.sendKeys("nellore");
		    deta=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]"));
		    deta.sendKeys("nagendhra,nager");
		    deta=driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]"));
		    deta.sendKeys("nagendhra,nager");
		    
		       deta=driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
		           deta.sendKeys("516360");
		              deta=driver.findElement(By.name("BillingNewAddress.PhoneNumber"));
		                 deta.sendKeys("8171234569");
		                    
		                 driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		                 System.out.println("sucessfully billing address details registered......");
	         
}	         
    
	    @SuppressWarnings("static-access")
		public void ship()
         {
         deta = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
         deta.click();
         ro.log("shipping address......");
         }
         
         @SuppressWarnings("static-access")
		public void sm()
         {
         deta = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
         deta.click();
         ro.log("sucessfully completed shipping method...");
         }
         
         //continue cod
         @SuppressWarnings("static-access")
		public void cod() {
        	 deta = driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
        	 deta.click();
        	 ro.log("sucessfully completed payment method...");
        	   System.out.println("sucessfully completed payment");
         }
         @SuppressWarnings("static-access")
		public void payinfo()
         {
       
         deta = driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
         deta.click();
         
         ro.log("payment information....");
           System.out.println("user is see the payment information........");
         }
       //confirm order
         @SuppressWarnings("static-access")
		public void conforder() throws IOException
         {
         
         deta = driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
         deta.click();
           takesnap();
         ro.log("sucessfully completed conformorder...");
           System.out.println("user click on the conform order");
         }
         //Thank you
         @SuppressWarnings("static-access")
		public void thank() throws IOException
         {
      
         deta = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input"));
         deta.click();
         ro.log("Thank You....");
           System.out.println("thank you");
         takesnap();
         
         }        
         
         
         
         

	        
	        
	    
	    
	    
	    
	    
        @SuppressWarnings("static-access")
		public void logout()
        {
        deta = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
           
        deta.click();
        ro.log("user is sucessfully logout....");
          System.out.println("user is sucessfully logout");
       
}

  

	         
	                   
	        

  public   void  takesnap() throws IOException {
	   File scrFile;
		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile,new File("C:\\Users\\SUDHAKAR\\eclipse-workspace\\demowebshop\\src\\test\\resources\\com\\screenshots\\file"+i+".pngs"));
		i++;
	     }
}