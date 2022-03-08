package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsLoginEnabled_ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://demo.actitime.com/login.do");
	
       boolean result = driver.findElement(By.xpath("//div[text()='Login ']")).isEnabled();
	
       System.out.println(result);
      
       driver.close();
      
	}
}
