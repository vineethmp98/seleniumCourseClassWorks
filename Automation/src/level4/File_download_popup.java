package level4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_download_popup {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.xpath("//p[text()='C#']/../p[2]/a")).click();
		
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
