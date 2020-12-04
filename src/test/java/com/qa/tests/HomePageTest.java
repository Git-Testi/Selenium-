package com.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.testbase.BaseTest;

public class HomePageTest extends BaseTest {
	HomePage homepage;
	
	public HomePageTest() throws IOException {
		super();
			}
	
	@BeforeMethod
	public void setup() throws IOException{
		initialization();
		homepage = new HomePage();				
	}
	
@Test(priority = 1)
public void homePage(){
	String title = homepage.verifyHomePageTitle();
	Assert.assertEquals("Edmonton Public Library", title);
	
	}

@Test(priority = 2)

public void quickLinksTest(){
	String tag = homepage.verifyQuickLinks();
	Assert.assertEquals("Quick Links", tag);
}

@AfterMethod
public void tearDown() throws IOException{
	driver.quit();
	}
}
