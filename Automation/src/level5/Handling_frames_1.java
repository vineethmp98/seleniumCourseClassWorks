package level5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames_1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vishu/Desktop/selenium%20static%20web%20pages/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("jsp");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("qsp");
	}

}
