package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search_option_mtrListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@SuppressWarnings("resource")
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
 driver.close(); 
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter option to search : ");
		   String option = sc.nextLine();
		   
		   	 int c=0;  
		   for (String s2 : a1) {
			if (s2.contains(option)) {
				c=1;
				System.out.println(s2+ " is available");
				break;
			    }
		     }
		   if (c==0) {
			System.out.println(option+ " is not available");
		    }   
	}
}
