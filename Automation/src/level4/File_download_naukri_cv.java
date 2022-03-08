package level4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_download_naukri_cv {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
         }

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
				
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("vijeshkolchar7@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("vjuk1998");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		driver.findElement(By.xpath("//i[@title='Click here to download your resume']")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
