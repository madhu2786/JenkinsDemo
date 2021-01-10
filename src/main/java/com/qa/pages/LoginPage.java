package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement textboxEmail;
	
	@FindBy(xpath="//img[@id='enterimg']")
	WebElement buttonSubmit;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String Email){
		textboxEmail.sendKeys(Email);
	}
	public void clickSubmit(){
		buttonSubmit.click();
	}
	

}
