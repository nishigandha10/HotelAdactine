package com.crm.qa.pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase
{

	/*@FindBy(id="location")
	WebElement location;
	
	@FindBy(id="hotels")
	WebElement hotel;
	
	@FindBy(id="room_type")
	WebElement room;
	
	@FindBy(id="room_nos")
	WebElement room_num;
	
	@FindBy(id="datepick_in")
	WebElement check_in;
	
	@FindBy(id="datepick_out")
	WebElement check_out;
	
	
	@FindBy(id="adult_room")
	WebElement adult_room;
	
	
	@FindBy(id="child_room")
	WebElement child_room;
	
	
	@FindBy(id="Submit")
	WebElement Submit_button;
	
	@FindBy(id="Reset")
	WebElement Reset_button;
	*/
	
	
	@FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']")
	WebElement welcom_text;
	
	@FindBy(id="username_show")
	WebElement username_show;
	
	
	@FindBy(css="td.welcome_menu>a:nth-of-type(1)")
	WebElement search_hotel;
	
	@FindBy(css="td.welcome_menu>a:nth-of-type(2)")
	WebElement Booked;
	 
	
	@FindBy(css="td.welcome_menu>a:nth-of-type(3)")
	WebElement changePassword;
	
	@FindBy(css="td.welcome_menu>a:nth-of-type(4)")   ////a[contains(text(),'Logout')]
	WebElement logout;
	
	@FindBy(xpath="//h4[contains(text(),'Adactin Hotel Mobile App')]")
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
	
	@FindBy(css=".login_title")
	WebElement login_Title;
	
	@FindBy(css=".login_title_comm")
	WebElement login_title_comm;
	
	@FindBy(css="td[width='150']")
	WebElement location_Title;
	
	@FindBy(css="select#location")
	WebElement location_drop_down;
	
	@FindBy(xpath="//td[starts-with(text(),'Hotels')]")
	WebElement Hotel_Title;
	
	@FindBy(css="select#hotels")
	WebElement hotel_drop_down;
	
	@FindBy(xpath="//td[starts-with(text(),'Room Type')]")
	WebElement RoomTYpe_Title;
	
	@FindBy(css="select#room_type")
	WebElement RoomTYpe_drop_down;
	
	@FindBy(xpath="//td[starts-with(text(),'Number of Rooms')]")
	WebElement No_Of_Rooms_Title;
	
	@FindBy(css="select#room_nos")
	WebElement Roomnos_drop_down;
	
	@FindBy(xpath="//td[starts-with(text(),'Check In Date')]")
	WebElement Check_In_Date_Title;
	
	@FindBy(css="input#datepick_in")
	WebElement Check_In_Date_drop_down;
	
	@FindBy(xpath="//td[starts-with(text(),'Check Out Date')]")
	WebElement Check_Out_Date_Title;
	
	@FindBy(css="input#datepick_out")
	WebElement Check_Out_Date_drop_down;
	
	@FindBy(xpath="//td[starts-with(text(),'Adults per Room')]")
	WebElement adult_room_Title;
	
	@FindBy(css="select#adult_room")
	WebElement adult_room_drop_down;
	
	@FindBy(xpath="//td[starts-with(text(),'Children per Room')]")
	WebElement Children_room_Title;
	
	@FindBy(css="select#child_room")
	WebElement child_room_drop_down;
	
	@FindBy(css="input#Submit")
	WebElement submit_Button;
	
	@FindBy(css="input#Reset")
	WebElement Reset_Button;
	
	@FindBy(css=".footer")
	WebElement f2020_Label;
	
	@FindBy(xpath="//a[starts-with(text(),'Adactin.com')]")
	WebElement Adactin_com_Title;
	
	
	//logout
	
	//Initialize elements//Initialise page object:
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void logout()
		{
			logout.click();
		}
		
		
		
		
		public String locationDropDownByVisibleText(String city)
		{
			//location_drop_down.click();
			
			Select s=new Select(location_drop_down);
			
			s.selectByVisibleText(city);
			
			String s1=s.getFirstSelectedOption().getText();
			return s1;
			
			/*List<WebElement>  list=s.getOptions();
			
			for (WebElement web : list) {
				
				System.out.println(web);
				
			}*/
		}
		
		public String checkInDate(String date)
		{
			
			Check_In_Date_drop_down.clear();
			Check_In_Date_drop_down.sendKeys(date);
			return Check_In_Date_drop_down.getAttribute("value");
		}
		
		
		
		public String checkInOut(String date)
		{
			
			Check_Out_Date_drop_down.clear();
			Check_Out_Date_drop_down.sendKeys(date);
			return Check_Out_Date_drop_down.getAttribute("value");
		}
		}
	
	
		
		

