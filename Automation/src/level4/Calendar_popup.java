package level4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar_popup {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		
		driver.findElement(By.id("policynumber")).sendKeys("123");
		
		driver.findElement(By.id("dob")).click();
		 WebElement allMonths = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(allMonths);
		s.selectByIndex(0);
		
		WebElement allYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(allYear);
		s1.selectByValue("1998");
		
		driver.findElement(By.xpath("//a[text()='9']")).click();
		
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		
		driver.findElement(By.id("renew_policy_submit")).click();
		
		boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
						
		if (text) {
			System.out.println("displayed");
		}
		else
			System.out.println("Not displayed");
		
driver.close();		
	}

}
