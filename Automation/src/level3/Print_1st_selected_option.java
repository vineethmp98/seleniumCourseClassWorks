package level3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_1st_selected_option {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/vishu/Desktop/hotel.html");
		 
		 WebElement slvListBox = driver.findElement(By.id("slv"));
		 Select s=new Select(slvListBox);
		 
		 WebElement firstOption = s.getFirstSelectedOption();
		 String text = firstOption.getText();
		 
		 System.out.println(text);
		 
		 driver.close();
	}

}
