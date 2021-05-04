package com.qa.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class  Netflix_Testbase {
	WebDriver driver;
	Netflix_Page Netflx;
	Netflix_Page scrollDown;
	JavascriptExecutor js;
	@Parameters({"Browser","Url"})
	@BeforeMethod
	public void setup(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\selenium driver\\chromedriver.exe");
			driver=new ChromeDriver();
			js=(JavascriptExecutor) driver;
			driver.manage().window().maximize();
		}
		if(Browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\selenium driver\\msedgedriver.exe");
			 driver=new EdgeDriver();
			}
		  Netflx= new Netflix_Page(driver);
		scrollDown= new Netflix_Page(driver);
		driver.get(Url);
		}
		@AfterMethod
		public void tearDown()
		{
			driver.close();
			driver.quit();
		}
	}

		

	
	
