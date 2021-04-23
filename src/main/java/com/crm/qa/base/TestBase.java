package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.WebDriverEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
	public static Properties pro;
	

	
	public TestBase(){
		WebDriverManager.chromedriver().setup();
		
		try {
			pro=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\Yogesh\\git\\HotelAdactine\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		pro.load(ip);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void initialization() {
		String browsername=pro.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","D:\\selenium software\\drivers\\chromedriver.exe" );
			 driver=new ChromeDriver(); 
		}
		else if(browsername.equalsIgnoreCase("FF"))
		{
			//System.setProperty("webdriver.gecko.driver","D:\\selenium software\\drivers\\geckodriver.exe" );
			 driver=new FirefoxDriver();
		}
		
		
		/*WebDriverEvent  obj=new WebDriverEvent();
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver); 
		eventHandler.register(obj);
		driver=eventHandler;*/
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(pro.getProperty("url"));
		//driver.navigate().to(pro.getProperty("url"));
				
				
				
	}

}
