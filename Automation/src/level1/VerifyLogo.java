package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://www.facebook.com/");
      
      boolean logo = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed();
      
      if(logo)
    	  System.out.println("Logo is displayed");
      else
    	  System.out.println("Logo is not displayed");
      
      driver.close();
	}
}
