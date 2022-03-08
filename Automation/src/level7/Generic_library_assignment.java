package level7;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.projectname.generic.FileLib;

public class Generic_library_assignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) throws IOException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	FileLib f=new FileLib();
	driver.get(f.getPropertyData("url"));	
	driver.findElement(By.id("username")).sendKeys(f.getPropertyData("username"));
	driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password"));
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
}
