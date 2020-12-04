package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;

import com.qa.pages.LoginPage;
import com.qa.testbase.BaseTest;

public class LoginPageTest extends BaseTest{
	LoginPage loginpage;
	

	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage();
	}
	
	/*@Test(priority = 1)
	public void pageTitleTest(){
		String title = loginpage.verifyPageTitle();
		Assert.assertEquals("Edmonton Public Library", title);
	}*/
	@Test(priority = 2)
	public void loginPageTest(){
		String topmess = loginpage.verifyLogin(prop.getProperty("username"),prop.getProperty("password"));
		 
		Assert.assertEquals("The username or PIN is incorrect. Please try again", topmess);
	}
	
	
		@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
