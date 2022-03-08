package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_options_ascending_mtrListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vishu/Desktop/hotel.html");
		 
		 WebElement mtrListBox = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtrListBox);
		 
		 List<WebElement> allOptions = s.getOptions();
		 
		 ArrayList<String> a1=new ArrayList<>();
		 
		 for (WebElement s1 : allOptions) {
			String text = s1.getText();
			a1.add(text);
		    }
		 Collections.sort(a1);
		 
		 for (String s2 : a1) {
			System.out.println(s2);
		  }
 driver.close();		 
	}

}
