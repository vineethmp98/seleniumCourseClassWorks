package level3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_of_birth_facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.linkText("Create New Account")).click();
		 
		 WebElement monthlistbox = driver.findElement(By.id("month"));		 
		 Select s=new Select(monthlistbox);
		 s.selectByIndex(0);
		 
		 WebElement datelistbox = driver.findElement(By.id("day"));
		 Select s1=new Select(datelistbox);
		 s1.selectByValue("9");
		 
		 WebElement yearlistbox = driver.findElement(By.id("year"));
		 Select s2=new Select(yearlistbox);
		 s2.selectByVisibleText("1998");	
	}

}
