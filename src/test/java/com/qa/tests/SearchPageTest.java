package com.qa.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.SearchPage;
import com.qa.testbase.BaseTest;

public class SearchPageTest extends BaseTest{
	SearchPage searchpage;
	WebDriver driver;
	
public SearchPageTest() throws IOException {
		super();
		
			}
@BeforeMethod
public void setup() throws IOException{
	initialization();
	searchpage = new SearchPage();
	}
@Test(priority = 1)
public void searchPageTest(){
		String searchTitle = searchpage.verifySearchPageTitle();
	Assert.assertEquals("Search | Edmonton Public Library | BiblioCommons", searchTitle);
	
}
@Test(priority = 2)
public void textBoxTest(){
	Boolean text = searchpage.verifyTextBox();
	Assert.assertTrue(text);
}
@Test(priority = 3)
public void sendText(){
	String searchTitle2 = searchpage.verifySendtext();
	Assert.assertEquals("Search | Edmonton Public Library | BiblioCommons", searchTitle2);
}
@AfterMethod
public void tearDown(){
	driver.quit();
}
}
