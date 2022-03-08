package level4;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_naukri_cv {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
         }
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
				
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("vijeshkolchar7@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("vjuk1998");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		
		driver.findElement(By.xpath("//div[text()='Add Resume']")).click();
		
		File f=new File("./data/resumee.docx");
		String absolutePath = f.getAbsolutePath();
		
		driver.findElement(By.xpath("//input[@class='fileUpload waves-effect waves-light btn-large']")).sendKeys(absolutePath);
		
	}
}
