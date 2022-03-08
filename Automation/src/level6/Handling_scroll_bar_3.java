package level6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_scroll_bar_3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.bbc.com/");
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		j.executeScript("window.scrollTo(0,0)");
	}

}
