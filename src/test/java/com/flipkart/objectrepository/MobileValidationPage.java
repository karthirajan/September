package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class MobileValidationPage extends Commonactions{
	
	public MobileValidationPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "q")
	private WebElement search;
	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement closeIcon;
	
	@FindBys({
	@FindBy(name = "q"),
	@FindBy(id = "search")
	})
	private WebElement searchAndOperator;
	
	@FindAll({
		@FindBy(name = "q"),
		@FindBy(id = "search")
	})
	private WebElement searchOrOperator;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getCloseIcon() {
		return closeIcon;
	}
	
	

}
