package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AlertPage 
{
	WebDriver driver;
	@FindBy(how=How.XPATH, using="//button[@onclick='alertbox()']")
	WebElement linkAlertText;
	
	public AlertPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	public void verifyAlertPopUp(){
		linkAlertText.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

}
