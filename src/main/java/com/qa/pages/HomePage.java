package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.BaseTest;

public class HomePage extends BaseTest {
	
	@FindBy(xpath="//img[@alt='Edmonton Public Library']")
	WebElement image;
	
	@FindBy(xpath="//span[text()='Quick Links']")
	WebElement quickLinks;
	
	public void homePage(){
	PageFactory.initElements(driver,this);
	}
	
	
public HomePage() throws IOException {
		super();
		
	}

public String verifyHomePageTitle(){
	return driver.getTitle();
}

public Boolean verifyLogoPresence(){
	return image.isDisplayed();
}
public Boolean verifyQuickLinks(){
	return quickLinks.isDisplayed();
}
}
