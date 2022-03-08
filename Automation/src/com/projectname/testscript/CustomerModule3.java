package com.projectname.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule3 {

	@BeforeClass
	public void openBrowser ( ) {
		Reporter.log("Open browser",true);
	}
	
	@AfterClass
	public void closeBrowser ( ) {
		Reporter.log("Close browser",true);
	}
	
	@BeforeMethod
	public void login ( ) {
		Reporter.log("Login",true);
	}
	
	@AfterMethod
	public void logout ( ) {
		Reporter.log("Logout",true);
	}
	
	@Test(priority = 1,invocationCount = 2)
	public void editCustomer ( ) {
		Reporter.log("Edit customer",true);
	}
	
	@Test
	public void registerCustomer ( ) {
		Reporter.log("Register customer",true);
	}
	
	@Test
	public void deleteCustomer ( ) {
		Reporter.log("Delete customer",true);
	}
}
