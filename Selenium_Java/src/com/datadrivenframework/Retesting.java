package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Retesting {

	public static void main(String[] args) throws IOException, BiffException, Exception {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		String path = ".\\testData\\Test_justrecharge.xls";
		FileInputStream fi = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("JustRc");
		// retesting
		Sheet s1 = w.getSheet("Retesting");
		System.out.println("Row Count: "+s1.getRows());
		//row is 'i'
		for (int i = 1; i<7; i++) {
			//clear the data into username element
			driver.findElement(By.id(s.getCell(4, 2).getContents())).clear();
			driver.findElement(By.id(s.getCell(4, 2).getContents())).sendKeys(s1.getCell(0, i).getContents());// UN
			
			driver.findElement(By.id(s.getCell(4, 3).getContents())).clear();
			driver.findElement(By.id(s.getCell(4, 3).getContents())).sendKeys(s1.getCell(1, i).getContents());// PWD
			Thread.sleep(5000);
			driver.findElement(By.id(s.getCell(4, 4).getContents())).click();
			Thread.sleep(5000);

			if (driver.findElement(By.id("jriTop_signOut")).isDisplayed()) {
				System.out.println("Given credentilas are valid");
				driver.findElement(By.id("jriTop_signOut")).click();
			} else {
				System.out.println("Given credentilas are in-valid");
				
			}

		}

	}
}
