package level4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_assignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) {
		   WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 13 pro max"+Keys.ENTER);
			
			
			List<WebElement> iphoneNames = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')and @class]" ));
			
			List<WebElement> iphonePrices = driver.findElements(By.xpath("//div[@class='_25b18c']/div"));
			
			for (int i = 0; i < iphoneNames.size()-1; i++) {
				
				String name = iphoneNames.get(i).getText();
				String price = iphonePrices.get(i).getText();
				
				System.out.println(name+"  ---> "+price);
			}
			
driver.close();			
	}

}
