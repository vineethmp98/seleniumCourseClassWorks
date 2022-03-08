package level5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames_2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vishu/Desktop/selenium%20static%20web%20pages/page1.html");
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("a");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("t1")).sendKeys("b");
		
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("t2")).sendKeys("c");
	}

}
