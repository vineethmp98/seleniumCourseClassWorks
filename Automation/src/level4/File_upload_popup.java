package level4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
         }
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\vishu\\Desktop\\naukri.html");
		
		File f=new File("./data/resume.docx");
		String absolutePath=f.getAbsolutePath();
		
		driver.findElement(By.id("cv")).sendKeys(absolutePath);
	}

}
