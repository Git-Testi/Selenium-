package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.BaseTest;

public class SearchPage extends BaseTest{
	
	@FindBy(xpath = "//button[@type='submit']/ancestor::form[@action='https://epl.bibliocommons.com/locations']")
	WebElement searchBtn;
	
	@FindBy(name = "q")
	WebElement textBox;

	public void searPage(){
		PageFactory.initElements(driver,this);
		}
	
	public SearchPage() throws IOException {
		super();
		
			}
		
public String verifySearchPageTitle(){
	searchBtn.click();
	return driver.getTitle();
	}
public Boolean verifyTextBox(){
	return textBox.isDisplayed();
	
}
public String verifySendtext(){
	textBox.sendKeys(prop.getProperty("text"));
	searchBtn.click();
	return driver.getTitle();
	
}

}

