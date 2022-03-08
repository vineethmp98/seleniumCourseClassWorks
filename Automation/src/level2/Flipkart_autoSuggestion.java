package level2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_autoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
						
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		
		Thread.sleep(5000);
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		int count=allSugg.size();
		System.out.println(count);
		
//		for (int i = 0; i < count; i++) {
//			String text = allSugg.get(i).getText();
//			System.out.println(text);
//		}
		for (WebElement i : allSugg) {
			String text=i.getText();
			System.out.println(text);
		}
		allSugg.get(count-1).click();
	}

}
