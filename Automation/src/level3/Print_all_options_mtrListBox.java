package level3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_options_mtrListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vishu/Desktop/hotel.html");
		 
		 WebElement mtrListBox = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtrListBox);
		 
		 List<WebElement> allOptions = s.getOptions();
		 
		 System.out.println(allOptions.size());
		 
		 for (WebElement options : allOptions) {
			String text = options.getText();
			System.out.println(text);
		  }
		 
		 driver.close();
	}
}
