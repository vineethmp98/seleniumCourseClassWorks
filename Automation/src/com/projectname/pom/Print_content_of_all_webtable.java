package com.projectname.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_content_of_all_webtable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}

	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		List<WebElement> allWebtable = driver.findElements(By.xpath("//td"));
		
		System.out.println(allWebtable.size());
		
		for( WebElement allweb:allWebtable)
		{
			String text = allweb.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
