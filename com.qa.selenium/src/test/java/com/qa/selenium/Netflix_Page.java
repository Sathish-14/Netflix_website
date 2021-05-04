package com.qa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Netflix_Page  {
	
	WebDriver Driver;
	
    @FindAll(@FindBy(name = "email"))
	WebElement email;
	
	public WebElement getemail()
	{
		return email;
	}
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")
	WebElement GetStarted;
	
	public WebElement GetStared()
	{
		return GetStarted;
	}
	
	@FindBy(id = "id_password")
	WebElement PasswordField;
	public WebElement getPasswordField() {
		return PasswordField;
	}
	
	@FindBy(xpath ="//button[contains(text(),'Continue')]")
	WebElement submit;
	
	public WebElement getsubmit()
	{
		return submit;
	}
	
	
    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement SignIn;
	public WebElement getSignIn() {
		return SignIn;
	}
	

	
	@FindBy(linkText ="Sign Out")
	WebElement SignOut;
	
	public WebElement SignOut()
	{
		return SignOut;
	}
	
	@FindBy(linkText = "Jobs")
	WebElement Jobs;
	
	public WebElement getJobs()
	{
		return Jobs;
	} 
	
	public Netflix_Page (WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver, this);
}

	
}