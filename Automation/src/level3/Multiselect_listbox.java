package level3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect_listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vishu/Desktop/hotel.html");
		 
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 
		 Select s=new Select(mtrlistbox);
		 
		 s.selectByVisibleText("idly");
		 s.selectByValue("d");
		 s.selectByIndex(1);
		 
		 s.deselectByIndex(0);
		 s.deselectByValue("v");
		 s.deselectByVisibleText("dosa");
		 
		 System.out.println(s.isMultiple());
	}

}
