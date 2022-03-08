package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
      WebDriver driver=new ChromeDriver();
      
      driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
      
      String text = driver.findElement(By.id("user_login_btn")).getText();
      
      System.out.println(text);
      driver.close();
	}
}
