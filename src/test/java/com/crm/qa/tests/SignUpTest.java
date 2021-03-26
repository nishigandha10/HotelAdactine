package com.crm.qa.tests;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;
import com.crm.qa.util.TestUtil;


public class SignUpTest extends TestBase {

	LoginPage login;
	SignUpPage sign=null;

	
	
	public SignUpTest(){
		super();
	}
	
	
	
	@BeforeClass
	public void setup() {
		initialization();
		login=new LoginPage();
		sign=new SignUpPage();
		
		login.signUp();
	}
	
	
	@Test
	public void m()
	{
		String title=sign.vaalidateTitle();
		Assert.assertEquals(title, "ytdruyhgrf");
	}
		
		
	
	@Test(dataProvider="getData1")//
	
	public void register(String un,String ps,String rps,String fullN,String email1)
	{
		//sign.signUp("1", "2", "3", "4", "5");
		sign.signUp(un,ps,rps,fullN,email1);
	}
	
	
	
	@DataProvider(name="getData1")
	public Object[][] getData() throws Exception 
	{
		Object data[][]=TestUtil.fileRead("a");
		return data;
		
	}
	
	
	
	
	
	
	@org.testng.annotations.AfterClass
	public void teardown() {
		//driver.quit();
	}
	
}
