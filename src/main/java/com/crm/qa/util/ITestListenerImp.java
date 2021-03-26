package com.crm.qa.util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ITestListenerImp implements ITestListener
{
	public static ExtentTest test=null;

	public void onTestStart(ITestResult result) {

		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, "Test Pass");
	}

	public void onTestFailure(ITestResult result) {

		test.log(LogStatus.FAIL, "Test FAIL");
		try {
			test.addScreenCapture(TestUtil.takeScreenShot());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, "Test SKIP");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		if(test==null) 
		{
			System.out.println(context.getName());
			test=ISuiteImplement.reports.startTest(context.getName(),"login");
		}	
	}

	public void onFinish(ITestContext context) {
		if(test!=null) {
			ISuiteImplement.reports.endTest(test);
			test=null;
		}
	}

	
}
