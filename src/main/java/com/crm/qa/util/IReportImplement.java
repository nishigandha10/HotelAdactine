package com.crm.qa.util;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;




public class IReportImplement  implements IReporter{

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		
		
			
			EXtendsReport.extend1();
			
			for (ISuite suite : suites) {
				
			
			         Map<String, ISuiteResult> suiteResults = suite.getResults();
			         java.util.Set<Entry<String,ISuiteResult>> entrySet = suiteResults.entrySet();

			         for (Entry<String ,ISuiteResult> entry : entrySet)
			         {
			         ITestContext con = entry.getValue().getTestContext();


			         IResultMap passedtest = con.getPassedTests();

			         java.util.Set<ITestResult> allresult = passedtest.getAllResults();

			         for (ITestResult itr : allresult)
			         {
	                        System.out.println(itr.getName());
			        	 EXtendsReport.addtest(itr.getName(), "description");
			        	 System.out.println(itr.getName());
			        	 
			        	 EXtendsReport.test.log(LogStatus.PASS, "Test case pass ");



			        	 EXtendsReport.endtest();


			         }

			         IResultMap failtest = con.getFailedTests();
			        		 

			         java.util.Set<ITestResult> alltofail = failtest.getAllResults();

			         for (ITestResult itr1 : alltofail)
			         {

			        	 EXtendsReport.addtest(itr1.getName(), "description");
			        	 EXtendsReport.test.log(LogStatus.FAIL, "Test case faIL ");



			        	 EXtendsReport.endtest();


			         }

			         IResultMap skiptest = con.getSkippedTests();

			         java.util.Set<ITestResult> alltoskip = skiptest.getAllResults();

			         for (ITestResult itr3 : alltoskip)
			         {

			        	 EXtendsReport.addtest(itr3.getName(), "description");
			        	 EXtendsReport.test.log(LogStatus.SKIP, "Test case skips ");



			        	 EXtendsReport.endtest();


			         }

			         }

			         }
			 EXtendsReport.endReort();
			      
		}
	}

	


