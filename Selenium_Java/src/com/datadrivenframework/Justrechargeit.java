package com.datadrivenframework;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Justrechargeit {

	public static void main(String[] args) throws Exception
	{
		
	//webdriver object creation
	
	WebDriver driver;
	//launch  chrome browser
	System.setProperty("webdriver.chrome.driver"
			,".\\BrowserDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	// enter url
	driver.get("https://www.justrechargeit.com/SignIn.aspx");
	String path=".\\testdata\\td.xls";
	FileInputStream f2=new FileInputStream(path);
	Workbook w=Workbook.getWorkbook(f2);
	Sheet s =w.getSheet("justr");

	driver.manage().window().maximize();
	// type user name into username into edit box
	driver.findElement(By.id(s.getCell(4,2).getContents())).sendKeys(s.getCell(5,2).getContents());
	driver.findElement(By.id(s.getCell(4,3).getContents())).sendKeys(s.getCell(5,3).getContents());
	Thread.sleep(5000);
	driver.findElement(By.id(s.getCell(4,4).getContents())).click();
	//driver.close();
	//signout element is dispalyed r not?going to do validate
	if(driver.findElement( By.id("jriTop_signOut")).isDisplayed()) {
		System.out.println("given credentlias are valid");
		driver.findElement(By.id("jriTop_signOut")).click();
	}else {
		System.out.println("given credentlias are not valid");
	}
}

		// TODO Auto-generated method stub

	}


