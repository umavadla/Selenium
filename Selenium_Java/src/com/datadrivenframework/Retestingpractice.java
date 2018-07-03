package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.JXLException;
import jxl.Sheet;

import jxl.Workbook;

public class Retestingpractice {

	public static void main(String[] args) throws JXLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
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
        Sheet s2=w.getSheet("retesting");
        System.out.println("row count"+s2.getRows());
        for ( int i = 1; i<s2.getRows(); i++) {
		driver.manage().window().maximize();
		// type user name into username into edit box
		driver.findElement(By.id(s.getCell(4,2).getContents())).clear();
		driver.findElement(By.id(s.getCell(4,3).getContents())).clear();
		driver.findElement(By.id(s.getCell(4,2).getContents())).sendKeys(s2.getCell(0, i).getContents());//username
		driver.findElement(By.id(s.getCell(4,3).getContents())).sendKeys(s2.getCell(1, i).getContents());//password
        
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
	}

}
