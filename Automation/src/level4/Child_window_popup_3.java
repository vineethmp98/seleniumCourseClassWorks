package level4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window_popup_3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> allwh = driver.getWindowHandles();
		
		for (String wh : allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.quit();
	}

}
