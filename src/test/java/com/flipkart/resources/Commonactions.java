package com.flipkart.resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	public void launch(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("--headless");
		
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void insertText(WebElement ele, String value) {
		
		ele.sendKeys(value,Keys.ENTER);

	}
	
	public void windowsHandling() {
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if(!parent.equals(x)){
				driver.switchTo().window(x);
			}
			
		}

	}

}
