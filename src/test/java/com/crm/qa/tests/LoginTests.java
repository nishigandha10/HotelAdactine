package com.crm.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ForgotPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.LogoutPage;

public class LoginTests extends TestBase
{
	
	LoginPage loginpage;
	HomePage homepage;
	LogoutPage logout;
	ForgotPage forgot;
	
	
	public LoginTests(){
		super();
	}
	@BeforeClass
	public void setup() {
		
		initialization();
		loginpage=new LoginPage();
	}
		
	@Test//(priority=1)
	public void loginPageTitleTest() {
		
	String title=loginpage.loginPageTitle();
	Assert.assertEquals(title, "Adactin.com - Hotel Reservation System");
		
	}
	
	@Test//(priority=2)
	public void validateLOgo1() {
		Boolean flag=loginpage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test//(priority=3)
	public void validateImage() {
		Boolean flag=loginpage.image();
		Assert.assertTrue(flag);
	}
	
	@Test//(priority=4)
	public void validateHeaderImg() {
		Boolean flag=loginpage.HeaderImg();
		Assert.assertTrue(flag);
	}
	
	@Test//(priority=5)
	public void welcome_Title()
	{
		String welTitle=loginpage.welcomeTitle();
		Assert.assertEquals(welTitle, "Welcome to Adactin Group of Hotels");
	}
	
	@Test//(priority=6)
	public void HotelImage1() {
		Boolean flag=loginpage.hotelImage1();
		Assert.assertTrue(flag);
	}
	
	@Test//(priority=7)
	public void HotelImage2() {
		Boolean flag=loginpage.hotelImage2();
		Assert.assertTrue(flag);
	}
	
	@Test//(priority=8)
	public void HotelImage3() {
		Boolean flag=loginpage.hotelImage3();
		Assert.assertTrue(flag);
	}
	
	@Test//(priority=9)
	public void HotelImage4() {
		Boolean flag=loginpage.hotelImage4();
		Assert.assertTrue(flag);
	
	}
	
	@Test//(priority=10)
	public void loginTitle()
	{
		String welTitle=loginpage.loginTitle();
		Assert.assertEquals(welTitle, "Existing User Login - Build 2");
	}
	
	@Test//(priority=11)
	public void Username_Title()
	{
		String welTitle=loginpage.username_Title();
		Assert.assertEquals(welTitle,"Username ");
	}
	
	@Test//(priority=13)
	public void Password_Title()
	{
		String welTitle=loginpage.password_Title();
		Assert.assertEquals(welTitle,"Password ");
	}
	
	
	@Test//(priority=12)
	public void ValideloginTest() 
	{
		String title=loginpage.login(pro.getProperty("username"), pro.getProperty("password"));
		System.out.println(title);
	Assert.assertEquals(title,"Adactin.com - Search Hotel");
	driver.navigate().back();
	driver.navigate().refresh();
	
	}
	
	
	@Test//(priority=14)
	public void InvalideloginTest1() {
		loginpage.login("jhg","ghjfg");
		String title=loginpage.errorMessage();
	Assert.assertEquals(title,"Invalid Login details or Your Password might have expired. Click here to reset your password");
	}
	
	
	
	@Test//(priority=16)
	public void resetPassword()
	{
		loginpage.login("jhg","ghjfg");
		String title=loginpage.resetPassword();
		Assert.assertEquals(title, "Adactin.com - Forgot Password");
		driver.navigate().back();
		driver.navigate().refresh();
	}
	
	@Test//(priority=17)
	public void forgotten_Title() {
		
		String title=loginpage.forgottenTitle();
	Assert.assertEquals(title,"Forgot Password?");
	}
	
	@Test//(priority=18)
	public void forgotPass() {
		
		String title=loginpage.forgotPass();
	Assert.assertEquals(title,"Adactin.com - Forgot Password");
	driver.navigate().back();
	driver.navigate().refresh();
	
	}
	
	
	
	@Test//(priority=19)
	public void Signup_Title() {
		
		String title=loginpage.signUpTitle();
	Assert.assertEquals(title,"New User Register Here");
	
	}
	
	
	@Test//(priority=20)
	public void Signup() {
		
		String title=loginpage.signUp();
	Assert.assertEquals(title,"Adactin.com - New User Registration");
	driver.navigate().back();
	driver.navigate().refresh();
	
	}
	
	@Test//(priority=21)
	public void build_title() {
		
		String title=loginpage.buildTitle();
	Assert.assertEquals(title,"Important Note:");
	}
	
	/*@Test//(priority=22)
	public void BuildNote_Title() {
		
		String title=loginpage.buildNoteTitle();
	Assert.assertEquals(title,"Hotel Application has 2 builds:\r\n" + 
			"Build 1 ? Has been developed with known defects. Thus, functional test cases and automation scripts will fail on this build. Go to Build 1\r\n" + 
			"\r\n" + 
			"Build 2 ? Known defects have been fixed. Thus, functional test cases and automation test scripts should pass when executed on this build.");
	}*/
	
	@Test//(priority=23)
	public void Build1_Title() {
		
		String title=loginpage.build1Title();
	Assert.assertEquals(title,"Build 1");
	}
	
	@Test//(priority=24)
	public void Build1URL_Title() {
		
		String title=loginpage.build1URLTitle();
	Assert.assertEquals(title,"Go to Build 1");
	}
	
	@Test//(priority=25)
	public void Build2_Title() {
		
		String title=loginpage.build2Title();
	Assert.assertEquals(title,"Build 1");
	}
	
	@Test//(priority=26)
	public void Email_Title() {
		
		String title=loginpage.emailTitle();
	Assert.assertEquals(title,"For any queries/issues please email: info@adactin.com");
	}
	
	@Test//(priority=27)
	public void Email_URL() {
		
		String title=loginpage.emailURL();
	Assert.assertEquals(title,"info@adactin.com");
	}
	
	@Test//(priority=28)
	public void footer_Title() {
		
		String title=loginpage.footerTitle();
	Assert.assertEquals(title,"© 2020 - Adactin.com. All Rights Reserved. Adactin Group Pty. Ltd.");
	}
	
	@Test//(priority=29)
	public void hotel_URL() {
		
		String title=loginpage.hotel_URL();
	Assert.assertEquals(title,"Adactin.com");
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
