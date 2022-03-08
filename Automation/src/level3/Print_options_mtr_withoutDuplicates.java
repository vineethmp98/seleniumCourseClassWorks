package level3;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_options_mtr_withoutDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vishu/Desktop/hotel.html");
		 
		 WebElement mtrListBox = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtrListBox);
		 
		 List<WebElement> allOptions = s.getOptions();
		 
		 HashSet<String> h1=new HashSet<>();
		 
		 for (int i = 0; i < allOptions.size(); i++) {
			String text = allOptions.get(i).getText();
			h1.add(text);
		   }
		 
		   for (String i : h1) {
			System.out.println(i);
		   }
	 driver.close();	 
	}

}
