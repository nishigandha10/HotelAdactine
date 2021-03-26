package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ForgotPage;
import com.crm.qa.pages.LoginPage;


public class ForgotTest extends TestBase
{
	LoginPage loginpage;
	ForgotPage fg;
	
	public ForgotTest(){
		super();
	}
	
	@BeforeClass
	public void set() {
		initialization();
		loginpage=new LoginPage();
		fg=new ForgotPage();
		String title=loginpage.forgotPass();
		
	}
	
	
	
	/* @Test
	 public void validateForgotten() {
		 String title=fg.vaalidateTitle();
		 Assert.assertEquals(title, "Adactin.com - Forgot Password");
	 }
	 */

	 @Test
	 public void GoBack() {
		fg.GoBackLoginPage();
		// Assert.assertEquals(title, "Adactin.com - Forgot Password");
	 }
	 
	 
	 
	 
	 
	 
	 
	 @AfterClass
		public void teardown() {
			driver.quit();
		}

}
