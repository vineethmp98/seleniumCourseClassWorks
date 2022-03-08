package com.projectname.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage4 {
	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> allckbx;
	
	public LoginPage4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setCheckBoxClick() {
		
		for(int i=0; i< allckbx.size();i++) {
			allckbx.get(i).click();
		}
	}
}
