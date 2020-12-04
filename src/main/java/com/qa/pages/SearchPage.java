package com.qa.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testbase.BaseTest;

public class SearchPage extends BaseTest{
	
	@FindBy(name = "q")
	WebElement textBox;

	@FindBy(xpath="(//span[contains(text(),'Catalogue')]/ancestor::div[@class='bootstrap-select-wrapper'])[1]")
	WebElement catalogue;
	
	@FindBy(xpath="(//span[contains(text(),'Keyword')])[1]")
	WebElement keyword;
	
	

	public SearchPage() throws IOException {
		PageFactory.initElements(driver,this);
		
			}
		
public Boolean verifyTextBox(){
	return textBox.isDisplayed();
	
}

public String verifyDefaultText1(){
	
	return catalogue.getText();
}
public String verifyDefaultText2(){
	
	return keyword.getText();
}

}

