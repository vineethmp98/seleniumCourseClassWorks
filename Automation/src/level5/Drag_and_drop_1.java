package level5;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop_1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
			driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
			
			WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
			WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
			
			Actions a=new Actions(driver);
			a.dragAndDrop(source, target).perform();
	}

}
