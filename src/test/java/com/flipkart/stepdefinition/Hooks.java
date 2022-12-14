package com.flipkart.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions c = new Commonactions();
	
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");
		c.launch("http://www.flipkart.com/");

	}
	
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("After Scenario");
		if(scenario.isFailed()){
			
		final byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.embed(screenshotAs, "image/png");	
		}else{
			
			final byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(screenshotAs, "image/png");	
			
		}
		
		driver.quit();

	}
	
	
	//Execution Order
	//Before
	//Background
	//Scenario
	//After

}
