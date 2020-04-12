package demowebpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class addcard {

	  
	 public WebDriver driver;
	  WebElement link,link1,img,add,sh,ch,checkout,ig,gu,deta;
	           
public void launch()
{
	    	   
	  link =driver.findElement(By.partialLinkText("Computers"));
		link.click();
		 }
 
public addcard(WebDriver driver)
{
	this.driver=driver;
}
		
public void click_desktops() {
	         link1=driver.findElement(By.partialLinkText("Desktops"));
	             link1.click();
}
public void click_img() {
	        img=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img"));
	          img.click();
	            System.out.println("hii");
	         
}
public void addcard() {
	     add = driver.findElement(By.id("add-to-cart-button-72"));
	       add.click();
	        System.out.println("hello");
}
public void shoppinglink() {
	        sh=driver.findElement(By.partialLinkText("Shopping cart"));
	          sh.click();
	            System.out.println("hkkk");
	           
}
public void checkbox()  {
    ch=driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
      ch.click();
}
  

public void checkout() {
    checkout=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
      checkout.click();
}
public void gustregister() {
	     gu =driver.findElement(By.className("button-1 checkout-as-guest-button"));
	       gu.click();
}
public void buildingaddd() 
{
	deta=driver.findElement(By.className("text-box single-line"));
	  deta.sendKeys("sudha");
	     deta=driver.findElement(By.className("text-box single-line"));
	  deta.sendKeys("lu");
	     deta=driver.findElement(By.id("BillingNewAddress_Email"));
	  deta.sendKeys("sudhakarkool123@gmail.com");
	     Select s=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
	          s.selectByVisibleText("INDIA");
	        
	  deta=driver.findElement(By.className("text-box single-line"));
	    deta.sendKeys("proddatur");
	       deta=driver.findElement(By.name("BillingNewAddress.ZipPostalCode"));
	           deta.sendKeys("516360");
	              deta=driver.findElement(By.name("BillingNewAddress.PhoneNumber"));
	                 deta.sendKeys("8179045687");
	                   deta=driver.findElement(By.className("button-1 new-address-next-step-button"));

	                   deta.click();
}
}