package com.TestRunner;

import org.junit.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith should be used in junit
//@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/Features/TestCases.feature", glue = { "com.StepDefinition" }, plugin = {
				"pretty", "html:src/test/resources/Reports/cucumber-html-report",
				"json:src/test/resources/Reports/cucumber-html-report/jsonreport",
				"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreport.html" },

		monochrome = true

)

public class testrunner extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("WorkShop_CucumberProject/cucuexcel.xlsx");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
