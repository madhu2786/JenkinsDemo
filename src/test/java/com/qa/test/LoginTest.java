package com.qa.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.AlertPage;
import com.qa.pages.LoginPage;
import com.qa.pages.RegisterPage;

public class LoginTest
{
	@Test
	public void verifyAlertPopUp()
	{
		BaseClass baseclass=new BaseClass();
		WebDriver driver=baseclass.startBrowser();
		Properties prop=baseclass.loadProperties();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setEmail(prop.getProperty("user"));
		loginpage.clickSubmit();
		
		RegisterPage registerpage=new RegisterPage(driver);
		registerpage.verifyAlert();
					
		AlertPage alertpage=new AlertPage(driver);
		alertpage.verifyAlertPopUp();
	}



}
