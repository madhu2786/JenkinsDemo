package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
	WebDriver driver;
	@FindBy(how=How.XPATH, using="//a[text()='SwitchTo']")
	WebElement linkSwitchTo;
	
	@FindBy(how=How.XPATH, using="//a[text()='SwitchTo']//following::a[1]")
	WebElement linkAlert;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void verifyAlert(){
		Actions action=new Actions(driver);
		action.moveToElement(linkSwitchTo).build().perform();
		linkAlert.click();
	}

}
