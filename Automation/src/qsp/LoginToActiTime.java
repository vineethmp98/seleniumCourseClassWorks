package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	}
}
