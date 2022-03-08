package com.projectname.generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.projectname.generic.ListenerImplementation.class)
public class CustomerModule4 extends BaseClass {
	
	@Test
	public void createCustomer() throws InterruptedException {
		Thread.sleep(4000);
		Reporter.log("Create customer" , true);
		Assert.fail();
	}
}
