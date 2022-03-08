package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlGmailGoogle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver c=new ChromeDriver();

	c.get("https://www.gmail.com/");
	
	String s = c.getCurrentUrl();
	
	if(s.contains("accounts.google.com"))
	{
		System.out.println("PASS");
	}
	else
		System.out.println("FAIL");
	c.close();
	}
}
