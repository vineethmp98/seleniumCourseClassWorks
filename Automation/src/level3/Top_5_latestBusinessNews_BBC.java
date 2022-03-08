package level3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Top_5_latestBusinessNews_BBC {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		 WebDriver driver=new ChromeDriver();

		 driver.get("https://www.bbc.com/");
		 
		  List<WebElement> all5news = driver.findElements(By.xpath("//h2[text()='Latest Business News']/../ul/li/a/h3"));
		 		  
		  System.out.println(all5news.size());
		  
		  for (WebElement news : all5news) {
			String text=news.getText();
			System.out.println(text);
		  }
driver.close();		 
	}

}
