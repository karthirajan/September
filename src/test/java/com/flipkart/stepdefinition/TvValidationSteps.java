package com.flipkart.stepdefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.objectrepository.MobileValidationPage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.When;

public class TvValidationSteps extends Commonactions{

    String name = "";
    Commonactions c = new Commonactions();
    MobileValidationPage m = new MobileValidationPage();
	
	@When("User search tv")
	public void user_search_tv() {
		
		name = "SAMSUNG";
		
		c.insertText(m.getSearch(), name);
		
	}
	
	@When("User select the tv and click add to cart")
	public void user_select_the_tv_and_click_add_to_cart() {
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]"));
		mobileName.click();
		
		c.windowsHandling();
		
	}
	
}
