package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ht_width_actitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://demo.actitime.com/login.do");
        
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.name("pwd"));
        
        int h1 = username.getSize().getHeight();
        int w1 = username.getSize().getWidth();
        int h2 = password.getSize().getHeight();
        int w2 = password.getSize().getWidth();
        
        if (h1==h2 && w1==w2) {
			System.out.println(h1+"="+h2+" & "+w1+"="+w2+" PASS");
		}
        else
        	System.out.println(h1+"!="+h2+" & "+w1+"!="+w2+" FAIL");
        
       driver.close();
	}
}
