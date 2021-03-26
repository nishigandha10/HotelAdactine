package com.crm.qa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomeTest extends TestBase
{
	HomePage homepage=null;
	LoginPage loginpage=null;
	
	public HomeTest(){
		super();
	}
	

	@BeforeClass
	public void setup() {
		
		initialization();
		homepage=new HomePage();
		loginpage=new LoginPage();
		loginpage.login(pro.getProperty("username"), pro.getProperty("password"));
		
	}
	
	@Test(dataProvider="getData1")
	public void locationDropDown1(String city)
	{
		String title=homepage.locationDropDownByVisibleText(city);
		
		assertEquals(city, title);
	}
	
	
	@DataProvider(name="getData1")
	public Object[][] getData() throws Exception 
	{
		Object data[][]=TestUtil.fileRead("location");
		return data;
		
	}
	
	
	
	@Test
	public void validateCheckInDate()
	{
		String title=homepage.checkInDate("15/12/2020");
		Assert.assertEquals(title, "15/12/2020");
	}
	
	
	@Test
	public void validateCheckOutDate()
	{
		String title=homepage.checkInOut("20/12/2020");
		Assert.assertEquals(title, "20/12/2020");
	}
	
	

}
