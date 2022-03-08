package com.projectname.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule2 {

	@Test
	public void createCustomer ( ) {
		Reporter.log("Create customer",true);
	}
	
	@Test
	public void deleteCustomer ( ) {
		Reporter.log("Delete customer",true);
	}
	
	@BeforeMethod
	public void login ( ) {
		Reporter.log("Login",true);
	}
	
	@AfterMethod
	public void logout ( ) {
		Reporter.log("Logout",true);
	}
}
