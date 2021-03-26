package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ForgotPage extends TestBase
{
	
	@FindBy(css="img.logo")    //xpath="//img[@class='logo']"
	WebElement LogoImg;
	
	@FindBy(xpath="//img[@alt='Adactin Group: Hotel Reservation System']")
	WebElement headerImg;
	
	@FindBy(xpath="//td[contains(text(),'Forgot Password Form ')]")
	WebElement Forgot_Password_Form_Title;
	
	@FindBy(css="span.login_title_comm")
	WebElement Login_Title;
	
	@FindBy(xpath="//a[contains(text(),'Go back to Login page')]")        //a[contains(text(),'Go back to Login page')]css="a[href='index.php']"
	WebElement GoBackLoginPage;
	
	
	@FindBy(xpath="//td[@align='right'][@width='150']")
	WebElement Enter_Email_title;
	
	@FindBy(id="emailadd_recovery")
	WebElement email;
	
	@FindBy(id="Submit")
	WebElement Submit_button;
	
	@FindBy(id="Reset")
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
	
	public void forgotPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String ChangePass(String em)
	{
		email.sendKeys(em);
		Submit_button.click();
		return driver.getTitle();
	}
	
	
	
	public String goBack()
	{
		GoBackLoginPage.click();
		return driver.getTitle();
	}
	
	public void GoBackLoginPage()
	{
		GoBackLoginPage.click();
		
	}
	
	
	
	public String vaalidateTitle() {
		return driver.getTitle();
	}


	
}
