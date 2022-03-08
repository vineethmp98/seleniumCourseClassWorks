package level4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup_assignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		driver.switchTo().alert().dismiss();
		
		boolean text = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).isDisplayed();
		System.out.println(text);
		
		if (text) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		driver.close();
	}

}
