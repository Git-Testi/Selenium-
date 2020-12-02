package com.qa.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.testbase.BaseTest;

public class HomePageTest extends BaseTest {
	HomePage homepage;
	
	WebDriver driver;
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
public void logoTest(){
	Boolean flag = homepage.verifyLogoPresence();
	Assert.assertTrue(flag);
}

@Test(priority = 3)
public void quickLinksTest(){
	Boolean flag = homepage.verifyQuickLinks();
	Assert.assertTrue(flag);
}

@AfterMethod
public void tearDown(){
driver.quit();
}
}


