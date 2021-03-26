package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	//PageFactory -Object repository
	
	@FindBy(css="img.logo")    //xpath="//img[@class='logo']"
	WebElement LogoImg;
	
	@FindBy(xpath="//td[@class='content_left']")   //css="td.header_title img"
	WebElement Image;
	
	@FindBy(xpath="//td[@class='header_title']/child::img")
	WebElement headerImg;
	
	@FindBy(xpath="//p[contains(text(),'Welcome to Adactin Group of Hotels')]")
	WebElement Welcome_Title;
	
	
	@FindBy(xpath="//img[@alt='Hotel Image 3']")
	WebElement Hotel_Image_3;
	
	@FindBy(xpath="//img[@alt='Hotel Image 1']")
	WebElement Hotel_Image_1;
	
	@FindBy(xpath="//img[@alt='Hotel Image 2']")
	WebElement Hotel_Image_2;
	
	@FindBy(xpath="//img[@alt='Hotel Image 4']")
	WebElement Hotel_Image_4;
	
	@FindBy(css="td.login_title")  //xpath="//td[@class='login_title']"
	WebElement loginTitle;
	
	@FindBy(xpath="//td[contains(text(),'Username')]")
	WebElement Username_Title;
	
	@FindBy(id="username")  //css=#username 
	WebElement username;
	
	@FindBy(xpath="//td[contains(text(),'Password')]")
	WebElement Password_Title;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	@FindBy(css="div.login_forgot")  //linkText="Forgot Password?"
	WebElement forgotten;
	
	@FindBy(linkText="New User Register Here") //css=td.login_register
	WebElement signUp;
	
	@FindBy(css="td.build_title")  //linkText="Forgot Password?"
	WebElement build_title;
	
	@FindBy(xpath="//td[contains(text(),'Hotel Application has 2 builds:')]")
	WebElement BuildNote_Title;
	
	@FindBy(xpath="//strong[starts-with(text(),'Build 1')]")
	WebElement Build1_Title;
	
	@FindBy(xpath="//strong[starts-with(text(),'Go to Build 1')]")
	WebElement Build1URL_Title;
	
	@FindBy(xpath="//strong[starts-with(text(),'Build 1')]")
	WebElement Build2_Title;
	
	@FindBy(xpath="//td[starts-with(text(),'For any queries/issues please email: ')]")
	WebElement Email_Title;
	
	@FindBy(css="a[href='mailto:info@adactin.com']")
	WebElement Email_URL;
	
	@FindBy(xpath="//td[contains(text(),'© 2020 - ')]")
	WebElement footer_Title;
	
	@FindBy(xpath="//a[contains(text(),'Adactin.com')]")
	WebElement hotel_URL;
	
	
	@FindBy(xpath="//b")
	WebElement Error_message;
	
	
	
	@FindBy(xpath="//b/child::*")
	WebElement click_ResetPassword;
	
	
	
	
	
	
	//Initialize elements//Initialise page object:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	

	
	
	
	
	public String loginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return LogoImg.isDisplayed();
	}
	
	public boolean image() {
		return Image.isDisplayed();
	}
	
	public boolean HeaderImg() {
		return headerImg.isDisplayed();
	}
	
	public String welcomeTitle() {
		return Welcome_Title.getText();
	}
	
	public boolean hotelImage1() {
		return Hotel_Image_1.isDisplayed();
	}
	
	public boolean hotelImage2() {
		return Hotel_Image_2.isDisplayed();
	}
	
	public boolean hotelImage3() {
		return Hotel_Image_3.isDisplayed();
	}
	
	public boolean hotelImage4() {
		return Hotel_Image_4.isDisplayed();
	}
	
	public String loginTitle() {
		return loginTitle.getText();
	}
	
	
	public String username_Title() {
		return Username_Title.getText();
	}
	
	public String password_Title() {
		return Password_Title.getText();
	}
	

	public String login(String un, String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		login.click();
		return driver.getTitle();
	} 
	
	public String errorMessage() {
		return Error_message.getText();
	}
	
	
	public String resetPassword() {
		click_ResetPassword.click();
		return driver.getTitle();
	}
	
	public String forgottenTitle() {
		
		return forgotten.getText();
	}
	
	public String forgotPass() {
		
		forgotten.click();
		return driver.getTitle();
		
	}
	
	 public String signUpTitle() {
		
			return signUp.getText();
			
		   }

	
     public String signUp() {
		
	  signUp.click();
		return driver.getTitle();
		
	   }
     
     
     
     public String buildTitle() {
 		
			return build_title.getText();
			
		   }
     
     public String buildNoteTitle() {
  		
			return BuildNote_Title.getText();
			
		   }
     
     public String build1Title() {
  		
			return Build1_Title.getText();
			
		   }
     public String build1URLTitle() {
   		
			return Build1URL_Title.getText();
			
		   }
     public String build2Title() {
   		
			return Build2_Title.getText();
			
		   }
     
     public String emailTitle() {
    		
			return Email_Title.getText();
			
		   }
     
     public String emailURL() {
    		
			return Email_URL.getText();
			
		   }
     
     public String footerTitle() {
    		
			return footer_Title.getText();
			
		   }
     public String hotel_URL() {
 		
			return hotel_URL.getText();
			
		   }
     public String hotelURL() {
    	 hotel_URL.click();
			return driver.getTitle();
			
		   }
     
     

	
}
