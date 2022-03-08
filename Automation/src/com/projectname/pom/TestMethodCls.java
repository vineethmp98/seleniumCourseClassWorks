package com.projectname.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}

	@Test
	public void testLogin() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
		LoginPage2 l=new LoginPage2(driver);
		
		l.setLogin("admin1", "manager1");
		Thread.sleep(5000);
		l.setLogin("admin", "manager");
	}
}
