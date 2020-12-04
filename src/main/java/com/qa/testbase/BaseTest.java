package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest() {
		try{
	prop = new Properties();
	FileInputStream ip = new FileInputStream("C:/Users/Administrator.JAYARAJ-PC/workspace/DemoGitRepo/src/main/java/com/qa"
			+ "/config/Config.properties");
	prop.load(ip);
		
		}		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		}

public static void initialization(){
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","E://Misc//Selenium1//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	else if (browserName.equals("edge")){
		System.setProperty("webdriver.edge.driver","E://Misc//Selenium1//msedgedriver.exe");
		driver = new EdgeDriver();
	}

	driver.get(prop.getProperty("url"));
	
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}
}