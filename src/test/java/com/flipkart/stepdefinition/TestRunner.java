package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
                     glue = "com.flipkart.stepdefinition",
               monochrome = true,
                   plugin = {"html:target","json:target/reports.json"},
                   dryRun = false,
                     tags = {"~@Mobile"})

public class TestRunner {
	
	//log4j
	//ExtentReporter
	//Reporter

}
