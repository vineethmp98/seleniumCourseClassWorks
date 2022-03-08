package level3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_wiprojobs_print_all_url {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		 WebDriver driver=new ChromeDriver();

		 driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("wipro job"+Keys.ENTER);
		 
		 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		 
		 int count = allLinks.size();
		 System.out.println(count);
		 
		 for (WebElement url : allLinks) {
			String text=url.getAttribute("href");
			System.out.println(text);
		   }
//		 for (int i = 0; i < allLinks.size(); i++) {
//			String text=allLinks.get(i).getAttribute("href");
//			System.out.println(text);
//		}
		 
driver.close();		 
	}

}
