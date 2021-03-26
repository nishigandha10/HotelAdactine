package com.crm.qa.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.relevantcodes.extentreports.ExtentReports;

public class ISuiteImplement implements ISuiteListener{
	
	
	
	public static ExtentReports reports=null;
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		reports=new ExtentReports(getReportName(), true);
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		if(reports!=null) 
		{
			reports.flush();
			reports.close();
			reports=null;
		}
	}
	public static String getReportName()
	{
		
		
		StringBuffer reportFilename=new StringBuffer("D:\\ExtentReports\\NewReport_");
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
		String format=sdf.format(dt).replace("-", "_").replace(" ", "_").replace(":", "_");
		
		
		return reportFilename.append(format).append(".html").toString();
		
	}

}
