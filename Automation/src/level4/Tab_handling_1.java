package level4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_handling_1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> allwh = driver.getWindowHandles();
		
		int count=allwh.size();
		
		System.out.println(count);
		
		driver.quit();		
	}

}
