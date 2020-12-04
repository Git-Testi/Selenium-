package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testbase.BaseTest;

public class LoginPage extends BaseTest{
	
	@FindBy(xpath = "//span[text()='Log In / My EPL']")
	WebElement login;
	
	@FindBy(xpath="//a[@href='https://epl.bibliocommons.com/user/login']")
	WebElement register;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='user_pin']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//p[@class='message-text']")
	WebElement topMess;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle(){
		return driver.getTitle();
	}
	
	public String verifyLogin(String un, String pwd){
login.click();
register.click();
username.sendKeys(un);
password.sendKeys(pwd);
loginBtn.click();
WebDriverWait wait = new WebDriverWait (driver,60);
wait.until(ExpectedConditions.visibilityOf(topMess));

String topmess = topMess.getText();
return topmess;

	}
	

}
