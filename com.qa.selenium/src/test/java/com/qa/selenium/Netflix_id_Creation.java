package com.qa.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Netflix_id_Creation extends Netflix_Testbase {
	WebDriver driver;
	@Test(priority=2)
	public void Netflx_Login() throws InterruptedException
	{
		
//		Netflix_Page Net =new Netflix_Page(driver);
//		driver.get("https://www.netflix.com/in/");
		Netflx.getemail().sendKeys("mahesathish1998@gmail.com");
		Netflx.GetStared().click();
		Thread.sleep(5000);
		Netflx.getPasswordField().sendKeys("Sat@1234");
		Netflx.getsubmit().click();
		Thread.sleep(5000);
		Netflx.SignOut().click();
		
	}
		
	@Test(priority=1)
	public void Netflix_Invalid_Login() throws InterruptedException
	{
		
		Netflx.getemail().sendKeys("abc@gmail.com");
		Netflx.GetStared().click();
		Thread.sleep(5000);
		Netflx.getPasswordField().sendKeys("1234");
		Thread.sleep(5000);
		Netflx.getSignIn().click();
		
	}
	
	
	@Test(priority=3)
	public void scrollDown() throws InterruptedException
	{
		js.executeScript("window.scrollBy(0,2000)",scrollDown.getJobs());
		Thread.sleep(5000);
    	scrollDown.getJobs().click();
    	Thread.sleep(5000);
		/*if(driver.getCurrentUrl().contains("jobs"))
		{
			Reporter.log("We are on the jobs page ", true);
		}
		else
		{
			Reporter.log("We are not on the jobs page ", true);
		}  */
	
	}
}

