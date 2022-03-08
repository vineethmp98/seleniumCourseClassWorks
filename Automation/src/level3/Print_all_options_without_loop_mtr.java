package level3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_options_without_loop_mtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vishu/Desktop/hotel.html");
		 
		 WebElement mtrListBox = driver.findElement(By.id("mtr"));
		 Select s=new Select(mtrListBox);
		 
		 String text = s.getWrappedElement().getText();
		 
		 System.out.println(text);
		 
driver.close();		 
	}

}
