package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlCode {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver c=new ChromeDriver();
c.get("https://www.google.com/");
String html = c.getPageSource();

c.manage().window().maximize();

System.out.println(html);
c.close();
	}

}
