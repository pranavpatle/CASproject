package com.becognizant.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage {
	
	WebDriver driver; //Initialize the driver
	
	// Constructor of the driver
	
	public basepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}