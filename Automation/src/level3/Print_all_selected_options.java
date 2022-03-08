package level3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_selected_options {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vishu/Desktop/hotel.html");
		 
		 WebElement slvListBox = driver.findElement(By.id("slv"));
		 Select s=new Select(slvListBox);
		 
		 List<WebElement> allOptions = s.getAllSelectedOptions();
		 int count=allOptions.size();
		 System.out.println(count);
		 
		 for (WebElement options : allOptions) {
			String text=options.getText();
			System.out.println(text);
		   }
	driver.close();
	}

}
