package level4;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_handling_3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();

		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) {
			driver.switchTo().window(wh);
		}		
		List<WebElement> allHead = driver.findElements(By.xpath("//li[contains(@class,'header')]"));
		
		for (WebElement head : allHead) {
			String text=head.getText();
			System.out.println(text);
		}
		
		driver.quit();	}

}
