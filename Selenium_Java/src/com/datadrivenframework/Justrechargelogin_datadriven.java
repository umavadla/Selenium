package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Justrechargelogin_datadriven {

	public static void main(String[] args) throws InterruptedException, IOException, JXLException {
		// TODO Auto-generated method stub
		WebDriver driver;

		// System.setProperty("webdriver.chrome.driver",".\\browserDrivers\\chromedriver.exe");
		// driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		// Where is Excel file located in local system
		String path = ".\\testData\\Test_justrecharge.xls";
		// Identify the path of the external files
		FileInputStream fi = new FileInputStream(path);
		// we can give file path like this also , we don't need assign to variable
		// FileInputStream fi =new
		// FileInputStream(".\\testData\\Test_justrecharge.xls");

		// read & assign the excel from file_location
		Workbook w = Workbook.getWorkbook(fi);
		// Get the sheet name from Excel(w)
		Sheet s = w.getSheet("JustRc");
		// type User name into Email edit box
		driver.findElement(By.id(s.getCell(4, 2).getContents())).sendKeys(s.getCell(5, 2).getContents());
		// password
		driver.findElement(By.id(s.getCell(4, 3).getContents())).sendKeys(s.getCell(5, 3).getContents());
		Thread.sleep(5000);
		// login button
		driver.findElement(By.id(s.getCell(4, 4).getContents())).click();
		Thread.sleep(5000);
		// signout element is displayed or not? we are going to validate it
		if (driver.findElement(By.id("jriTop_signOut")).isDisplayed()) {
			System.out.println("Given credentilas are valid");
			driver.findElement(By.id("jriTop_signOut")).click();
		} else {
			System.out.println("Given credentilas are in-valid");
		}

	}

}
