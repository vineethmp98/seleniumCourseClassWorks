package level4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.yatra.com/");
		
	}

}
