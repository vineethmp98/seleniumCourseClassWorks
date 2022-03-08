package level3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_all_options_reverseOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vishu/Desktop/hotel.html");
		 
		 WebElement mtrListBox = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtrListBox);
		 
		 List<WebElement> allOptions = s.getOptions();
		 
		 int count = allOptions.size();
		 
		 for (int i = count-1; i >=0 ; i--) {
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
driver.close();		 
	}

}
