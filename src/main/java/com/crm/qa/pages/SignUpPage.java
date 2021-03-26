package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	/*@FindBy(css="img.logo")    //xpath="//img[@class='logo']"
	WebElement LogoImg;
	
	@FindBy(xpath="//img[@alt='Adactin Group: Hotel Reservation System']")
	WebElement headerImg;
	
	
	
	@FindBy(xpath="//a[contains(text(),'Go back to Login page')]")
	WebElement GoBackLoginPage;
	
	
	*/
	
	@FindBy(xpath="//td[contains(text(),'New User Registration Form ')]")
	WebElement form_title;
	
	@FindBy(xpath="//span[contains(text(),'(Fields marked with Red asterix (*) are mandatory)')]")
	WebElement form_title1;
	
	@FindBy(xpath="//td[@width='150']")
	WebElement username_title;
	
	@FindBy(css="#username")
	WebElement username;
	
	@FindBy(css="form[name='register_form'] tr:nth-child(3)>td[align='right']")
	WebElement password_title;
	
	@FindBy(css="#password")
	WebElement password;
	
	@FindBy(css="form[name='register_form'] tr:nth-child(4)>td[align='right']")
	WebElement repassword_title;
	
	@FindBy(css="#re_password")
	WebElement re_password;
	
	@FindBy(css="form[name='register_form'] tr:nth-child(5)>td[align='right']")
	WebElement fullname_title;
	
	@FindBy(css="#full_name")
	WebElement fullname;
	
	@FindBy(css="form[name='register_form'] tr:nth-child(6)>td[align='right']")
	WebElement email_title;
	
	@FindBy(css="#email_add")
	WebElement email;
	
	@FindBy(css="form[name='register_form'] tr:nth-child(6)>td[align='right']")
	WebElement TermCondition_title;
	
	@FindBy(id="tnc_box")
	WebElement checkbox;
	
	@FindBy(xpath="//a[contains(text(),'Terms & Conditions')]")
	WebElement Terms_title;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement Submit_button;
	
	@FindBy(xpath="//input[@value='Reset']")
	WebElement Reset_button;
	
	
	
	
	
	/*@FindBy(xpath="//h4[contains(text(),'Adactin Hotel Mobile App')]")
	WebElement Mobile_app;
	
	@FindBy(xpath="//a[@href='https://adactinhotelapp.com/resources/AdactinHotelApp_SetupGuide.pdf']")
	WebElement Mobile_app_text;
	
	@FindBy(xpath="//h4[contains(text(),'HotelApp Web Services ')]")
	WebElement Hotel_Web_Service;
	
	@FindBy(xpath="//a[@href='https://adactinhotelapp.com/HotelAdactinWebServices/']")
	WebElement web_service;
	
	@FindBy(xpath="//h4[contains(text(),'Sample TestCases ')]")
	WebElement SAmple_Testcases;
	
	@FindBy(xpath="//a[@href='http://adactinhotelapp.com/resources/Sample-TestCases_HotelApplication.pdf']")
	WebElement Download_Testcases;
	
	@FindBy(xpath="//h4[contains(text(),'Known Defects ')]")
	WebElement Known_Defect;
	
	@FindBy(xpath="//a[@href='http://adactinhotelapp.com/resources/KnownDefects_HotelApp.pdf']")
	WebElement Download_Defect;
	
	@FindBy(xpath="//h4[contains(text(),'Book on Automation')]")
	WebElement Book;
	
	@FindBy(xpath="//iframe[@src='http://www.adactinhotelapp.com/img-horizontal-carousel/index.html']")
	WebElement frame;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/test-automation-using-microsoft-coded-ui-with-c-step-by-step-guide/']")
	WebElement frame_Title;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/test-automation-using-microsoft-coded-ui-with-c-step-by-step-guide/']/following-sibling::a")
	WebElement Click_ToKnowMore;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/sample-exam-questions-istqb-foundation-level-agile-tester-extension-exam/']")
	WebElement Sample_Exam_Question;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/sample-exam-questions-istqb-foundation-level-agile-tester-extension-exam/']/following-sibling::a")
	WebElement Click_Sample;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/test-automation-using-selenium-webdriver-with-java/']")
	WebElement Selenium_Book;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/test-automation-using-selenium-webdriver-with-java/']/following-sibling::a")
	WebElement Click_Java;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/test-automation-using-hp-unified-functional-testing/']")
	WebElement QTP;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/test-automation-using-hp-unified-functional-testing/']/following-sibling::a")
	WebElement Click_QTP;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/test-automation-using-selenium-with-c/']")
	WebElement Selenium_C;
	
	@FindBy(xpath="//a[@href='https://adactin.com/products/books-publications/test-automation-using-selenium-with-c/']/following-sibling::a")
	WebElement Click_Selenium_C;
	
	@FindBy(xpath="//h4[contains(text(),'About Adactin')]")
	WebElement About_Adactin_Text;
	
	@FindBy(xpath="//a[contains(text(),'www.adactin.com')]")
	WebElement About_Adactin_URL;
	
	@FindBy(css=".footer")
	WebElement f2020_Label;
	
	@FindBy(xpath="//a[starts-with(text(),'Adactin.com')]")
	WebElement Adactin_com_Title;
	
	
	*/
	
	
	public SignUpPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void signUp(String un,String ps,String rps,String fullN,String email1) {
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(ps);
		re_password.clear();
		re_password.sendKeys(rps);
		fullname.clear();
		fullname.sendKeys(fullN); 
		email.clear();
		email.sendKeys(email1);
	}
	
	public String vaalidateTitle() {
		return driver.getTitle();
	}

}
