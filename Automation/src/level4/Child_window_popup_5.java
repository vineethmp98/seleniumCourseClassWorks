package level4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window_popup_5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/browser-windows");
		WebElement btn = driver.findElement(By.xpath("//button[text()='New Window']"));
		btn.click();
		btn.click();
		btn.click();
		
		String pwh = driver.getWindowHandle();
		
		Set<String> allwh = driver.getWindowHandles();
		
		for (String wh : allwh) {
			Thread.sleep(3000);
			driver.switchTo().window(wh);
			
			if (!(wh.equals(pwh))) {
				driver.close();
			}
		}
		
	}

}
