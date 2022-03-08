package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Y_Axis_textbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://demo.actitime.com/login.do");
        
        WebElement username = driver.findElement(By.id("username"));
          
        int x = username.getLocation().getX();
        int y=username.getLocation().getY();
        
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
        
        driver.close();
	}
}
