package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Paste {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://demo.opensourcebilling.org/");
		 
		 driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		 driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		 
	}

}
