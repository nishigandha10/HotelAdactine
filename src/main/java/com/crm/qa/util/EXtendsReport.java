package com.crm.qa.util;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class EXtendsReport {
	public static ExtentReports reportfile=null;
	public static ExtentTest test=null ;



	public static void extend1()
	{
	if(reportfile==null) {
		
	
	reportfile = new ExtentReports("D:\\ExtentReports\\IReport1111.html", true);
	}
	}

	public static void addtest(String TestName, String description)
	{
	if(test == null) {
	test = reportfile.startTest(TestName, description);
	       }
	}

	public static void endtest()
	{
	if(test != null)
	{
	reportfile.endTest(test);
	test= null;
	}
	}


	public static void endReort()
	{
	if(reportfile != null)
	{


	reportfile.flush();
	reportfile.close();
	reportfile = null;
	}
	}
}
