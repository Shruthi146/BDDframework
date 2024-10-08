package com.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		glue = {"com.automation.steps"},
		plugin = {
				"pretty",
				"html:target/cucumber-reports/CucumberTestReport.html",
				"json:target/Reports/cucumber.json,",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags= "@Test3",
//		dryRun=true,
		monochrome=true

)


public class TestRunner extends AbstractTestNGCucumberTests{

}
