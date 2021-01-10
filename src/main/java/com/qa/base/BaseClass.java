package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass
{
	public static WebDriver driver;
	public static Properties prop;
		
	public Properties loadProperties()
	{
		try 
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("D:\\Madhuri\\JAVAFROMSCRATCH\\POMDemo\\src\\main"
					+ "\\java\\com\\qa\\pom\\config\\config.properties");
			prop.load(fis);
		}
		catch (FileNotFoundException e)
		{e.printStackTrace();}
		
		catch (IOException e) 
		{e.printStackTrace();}
		
		return prop;
	}
	
	public WebDriver startBrowser()
	{
		
		    System.setProperty("webdriver.chrome.driver","D:\\SeleniumSoftware\\Drivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Index.html");
			
		return driver;
	}

}
