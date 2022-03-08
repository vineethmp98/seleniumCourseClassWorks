package level7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vikra_sasi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) throws InterruptedException    {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://web.whatsapp.com/");
	
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//span[text()='Abijith Shetty'])[1]")).click();
	
	for (int i=0;i<100;i++) {
	driver.switchTo().activeElement().sendKeys("shetttyyy" + Keys.ENTER);
	}
	
	}
}
