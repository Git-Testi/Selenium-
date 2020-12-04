package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.BaseTest;

public class HomePage extends BaseTest {
	
	
	@FindBy(xpath="//span[text()='Quick Links']")
	WebElement quickLinks;	
	
public HomePage() throws IOException {
	PageFactory.initElements(driver,this);
	}

public String verifyHomePageTitle(){
	return driver.getTitle();

}
public String verifyQuickLinks(){
	return quickLinks.getText();
}

}