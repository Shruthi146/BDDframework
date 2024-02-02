package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features"},
		glue = {"com.automation.steps"},
		plugin = {"pretty","html:target/cucumber-reports/CucumberTestReport.html"},
		tags= "@Test10",
//		dryRun=true,
		monochrome=true

)


public class TestRunner {

}
