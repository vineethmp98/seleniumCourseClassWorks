package com.projectname.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	@Test
	public void testMethod()  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vishu/Desktop/selenium%20static%20web%20pages/checkbox.html");
		
		LoginPage4 l=new LoginPage4(driver);
		l.setCheckBoxClick();
		
	}
}
