package level6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_scroll_bar_2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.bbc.com/");
		
		int y = driver.findElement(By.xpath("//h2[text()='Latest Business News']")).getLocation().getY();

		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,"+y+")");
	}

}
