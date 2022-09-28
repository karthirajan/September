package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.objectrepository.MobileValidationPage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileValidationSteps extends Commonactions{
	
	Commonactions c = new Commonactions();
	
	
	@Given("User launches flipkart application")
	public void user_launches_flipkart_application() {
		
		
		
	}
	
	MobileValidationPage m = new MobileValidationPage();

	@Given("User handles login")
	public void user_handles_login() throws InterruptedException {
		
	
				
		
			Thread.sleep(2000);
			m.getCloseIcon().click();
			
			
			
			
		
	}
	
	String name = "";
	
	@When("User search mobile")
	public void user_search_mobile() {
		
		name = "realme";
		
		c.insertText(m.getSearch(), name);
		
	}

	@When("User search mobile {string}")
	public void user_search_mobile(String mobile) {
		
		name = mobile;
		c.insertText(m.getSearch(), name);
		
	}

	@When("User select the mobile and click add to cart")
	public void user_select_the_mobile_and_click_add_to_cart() {
		
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+name+"')])[2]"));
		mobileName.click();
		
		c.windowsHandling();
		
	}

	@When("User doing the payment")
	public void user_doing_the_payment() {
		
		//screenshot
		
	}

	@Then("User receive the confirmation message")
	public void user_receive_the_confirmation_message() {
		
		
		//scrolldown
		
		
	}
	
	
	@When("User search mobile by using OneD list")
	public void user_search_mobile_by_using_D_list(DataTable dataTable) {
		
		List<String> datas = dataTable.asList();
		
        name = datas.get(1);
		
		WebElement search = driver.findElement(By.name("q"));
		c.insertText(search, name);
	    
	}
	
	@When("User search mobile by using OneD map")
	public void user_search_mobile_by_using_D_map(DataTable dataTable) {
		
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		
        name = datas.get('C');
		
		WebElement search = driver.findElement(By.name("q"));
		c.insertText(search, name);
	    
	}

}
