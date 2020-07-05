package com.Testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions
	(
			features = "src/test/resources/FeaturesFile/Login.feature",
					 plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
			"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
			glue = {"com.StepDefinition"}
	)
	public class LoginRunner 
	{
		 @AfterClass
	     public static void extendReport()
	   {
	       Reporter.loadXMLConfig("src/test/resources/TestData/Extent_config.xml");
	       Reporter.setSystemInfo("user", System.getProperty("user.name"));
	       Reporter.setSystemInfo("os", "Windows");
	       Reporter.setTestRunnerOutput("Sample test runner output message");
	   }
		 

}
