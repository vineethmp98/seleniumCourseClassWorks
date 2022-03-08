package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alligned_Username_Pwd {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://demo.actitime.com/login.do");
         
        int x1 =  driver.findElement(By.id("username")).getLocation().getX();
        int x2 =   driver.findElement(By.name("pwd")).getLocation().getX();
       
        if (x1==x2) {
        	System.out.println("Pass");
		}
        else
        	System.out.println("Fail");
        driver.close();
	}
}
