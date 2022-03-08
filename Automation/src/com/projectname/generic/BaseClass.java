package com.projectname.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
static { 
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser ( ) {
		Reporter.log("Open browser", true);
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser ( ) {
		Reporter.log("Close browser", true);
		driver.close();
	}
	
	@BeforeMethod
	public void login ( ) throws IOException {
		Reporter.log("Login ", true);
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		   driver.get(p.getProperty("url"));	
			driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
			driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
			driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@AfterMethod
	public void logout ( ) {
		Reporter.log("Logout ", true);
		driver.findElement(By.id("logoutLink")).click();
 	}
	
}
