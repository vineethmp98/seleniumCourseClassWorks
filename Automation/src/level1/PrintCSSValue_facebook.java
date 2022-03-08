package level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCSSValue_facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		
		String color = link.getCssValue("color");
		String fontsize = link.getCssValue("font-size");
		String fonttype = link.getCssValue("font-family");
		
		System.out.println("colour = "+color);
		System.out.println("font size = "+fontsize);
		System.out.println("font type = "+fonttype);
		
		driver.close();
	}

}
