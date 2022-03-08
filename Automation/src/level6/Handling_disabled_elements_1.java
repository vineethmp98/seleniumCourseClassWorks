package level6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Handling_disabled_elements_1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vishu/Desktop/selenium%20static%20web%20pages/disabled.html");
		
		driver.findElement(By.id("un")).sendKeys("admin");
		
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("document.getElementById('pwd').value='manager'");
//		JavascriptExecutor j=(JavascriptExecutor) driver;
//		j.executeScript("document.getElementById('pwd').value='manager'");
	}

}
