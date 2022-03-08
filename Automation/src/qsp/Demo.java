package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		ChromeDriver c=new ChromeDriver();
				
		c.get("https://www.youtube.com/");
		
		String title = c.getTitle();
		
		System.out.println(title);
		
		c.close();
	}
}
