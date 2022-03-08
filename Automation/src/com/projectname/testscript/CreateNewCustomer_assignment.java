package com.projectname.testscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.projectname.generic.BaseClass;
import com.projectname.generic.FileLib;

public class CreateNewCustomer_assignment extends BaseClass{
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("container_tasks")).click();
		
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		
		FileLib f=new FileLib();
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(f.getExcelData("CreateCustomer", 1,2));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(f.getExcelData("CreateCustomer",1,3));
		
		driver.findElement(By.className("emptySelection")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='itemRow cpItemRow '])[3]")).click();
	
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	
		Thread.sleep(3000);
	}

}
