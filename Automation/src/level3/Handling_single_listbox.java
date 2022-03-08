package level3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_single_listbox {
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
		 
		 s.selectByValue("12");
		 
		 s.selectByVisibleText("Jun");		 
	}

}
