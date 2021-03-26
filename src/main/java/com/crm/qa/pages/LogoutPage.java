package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LogoutPage extends TestBase
{
	
	@FindBy(xpath="Click here to login again")
	WebElement login11;
	
	
	public LogoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void login1()
	{
		login11.click();
	}

}
