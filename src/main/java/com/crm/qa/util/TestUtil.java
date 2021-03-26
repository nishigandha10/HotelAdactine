package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

import com.crm.qa.base.TestBase;


public class TestUtil extends TestBase
{
	
	public static Workbook book=null;
	public static org.apache.poi.ss.usermodel.Sheet sheet=null;
	
	public static Object[][] fileRead(String name) throws  IOException, Exception 
	{
	FileInputStream file=new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\testdata.xlsx");
	
	Workbook book=WorkbookFactory.create(file);
	
	/*XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheetAt(0);*/
	
	sheet=book.getSheet(name);
	  
	 Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	 
	 for(int i=0;i<sheet.getLastRowNum(); i++)
	 {
		 for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
		 {
			 data[i][k]=sheet.getRow(i+1).getCell(k).toString();
		 }
			 }
	return data;
	 
	 
}
	
	
	public static String takeScreenShot() throws Exception, IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		 
	   
	        FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(getReportName()));
	   
	    String filepath=getReportName();
	    
	    return filepath;
	}
	
	public static String getReportName()
	{
		
		
		StringBuffer reportFilename=new StringBuffer("C:\\Users\\Hp\\eclipse-workspace\\FreeCRMTest\\Screenshots\\Screenshot_");
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		String format=sdf.format(dt).replace("-", "_").replace(" ", "_").replace(":", "_");
		
		
		return reportFilename.append(format).append(".png").toString();
		
	}
	
	
	
	 

}
