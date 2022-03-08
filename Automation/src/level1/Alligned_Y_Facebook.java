package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alligned_Y_Facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.facebook.com/");
        
         driver.findElement(By.linkText("Create New Account")).click();
        
       Thread.sleep(2000);
        
          int y1 = driver.findElement(By.xpath("(//input[@name=\"sex\"])[1]")).getLocation().getY();
          int y2 = driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).getLocation().getY();
          int y3 = driver.findElement(By.xpath("(//input[@name=\"sex\"])[3]")).getLocation().getY();
        
          System.out.println("y1:"+y1+", y2:"+y2+", y3:"+y3);
          
          if (y1==y2 && y1==y3) {
			System.out.println("Properly alligned");
		}
          else
        	  System.out.println("Not properly alligned");
        
          driver.close();
	}
}
