package com.projectname.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMethodCls2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}

	@Test
	public void testLogin()  
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		LoginPage3 l=new LoginPage3();
		
		PageFactory.initElements(driver, l);
		
		l.setLogin("admin", "manager");
	}
}
