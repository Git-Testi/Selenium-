package com.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.SearchPage;
import com.qa.testbase.BaseTest;

public class SearchPageTest extends BaseTest{
	 
	SearchPage searchpage;
	
public SearchPageTest() throws IOException {
		super();
		
		
			}
@BeforeMethod
public void before() throws IOException{
	initialization();
	searchpage = new SearchPage();
 
	}

@Test(priority = 1)
public void textBoxTest(){
	Boolean text = searchpage.verifyTextBox();
	Assert.assertTrue(text);
}

@Test(priority = 2)

public void defaultTextTest1(){
	
	String defaultText = searchpage.verifyDefaultText1();
	System.out.println("The text is: "+defaultText);
	}

@Test(priority = 3)

public void defaultTextTest2(){
	
	String defaultText = searchpage.verifyDefaultText2();
	System.out.println("The text is: "+defaultText);
	}

@AfterMethod
public void tearDown()	{
	driver.quit();
}
}
