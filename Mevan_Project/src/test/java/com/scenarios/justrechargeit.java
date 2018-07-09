package com.scenarios;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.Commonfunctions;
import com.utilities.StaticVariables;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class justrechargeit extends StaticVariables {
	// create common function object
	Commonfunctions cfn = new Commonfunctions();
	// create object for locators
	Locators obj = new Locators();

	/*@Test
	public void T_01() throws IOException {
		// get the values from the property file
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(".\\testdata\\testdata.properties");
		prop.load(fi);

		
		cfn.sendKeysByID(obj.ID_MAIL,prop.getProperty("username"));
		cfn.sendKeysByID(obj.NAME_PASSWORD, prop.getProperty("password"));
		cfn.clickByID(obj.ID_BUTTON);
		//cfn.takeScreenshot("test");
	}*/
		
	@Test
	public void T_02() throws IOException {
		// get the values from the property file
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(".\\testdata\\testdata.properties");
		prop.load(fi);

		
		cfn.sendKeysByID(obj.ID_MAIL,prop.getProperty("username1"));
		cfn.sendKeysByID(obj.NAME_PASSWORD, prop.getProperty("password"));
		cfn.clickByID(obj.ID_BUTTON);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		//System will get the screenshot and store it in to the ram
	//	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(s, new File("./screenshots/jri.png"));
		
		
		
		// type user name into username into edit box
		//driver.findElement(By.id(obj.ID_MAIL)).sendKeys(prop.getProperty("username"));

	//	driver.findElement(By.name(obj.NAME_PASSWORD)).sendKeys(prop.getProperty("password"));
		// Thread.sleep(8000);
		//driver.findElement(By.id(obj.ID_BUTTON)).click();
		// driver.close();
	

	@BeforeClass
		public void invokeApplication() throws IOException
		{
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(".\\testdata\\testdata.properties");
		prop.load(fi);
		cfn.chromebrowserlaunch();
		cfn.navigateURL(prop.getProperty("baseURL"));
		}
	@AfterMethod
		public void takescreenshot(ITestResult results) throws IOException, InterruptedException {
			cfn.takescreenshotfailorpass(results);
			Thread.sleep(2000);
		}
	
}
	




	
