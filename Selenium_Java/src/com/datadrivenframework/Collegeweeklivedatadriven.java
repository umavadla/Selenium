package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class Collegeweeklivedatadriven {

		public static void main(String[] args) throws Exception,IOException,JXLException {
			// TODO Auto-generated method stub
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver",".//BrowserDrivers//chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://www.collegeweeklive.com/go-signup/");
			String path=".\\testdata\\td.xls";
			FileInputStream f=new FileInputStream(path);
			Workbook w=Workbook.getWorkbook(f);
			Sheet s=w.getSheet("collegeweek");
			driver.findElement(By.id(s.getCell(4,2).getContents())).sendKeys(s.getCell(5,2).getContents());
			driver.findElement(By.id(s.getCell(4,3).getContents())).sendKeys(s.getCell(5,3).getContents());
			driver.findElement(By.id(s.getCell(4,4).getContents())).sendKeys(s.getCell(5,4).getContents());
			driver.findElement(By.id(s.getCell(4,5).getContents())).sendKeys(s.getCell(5,5).getContents());
			driver.findElement(By.name(s.getCell(4,6).getContents())).sendKeys(s.getCell(5,6).getContents());
			driver.findElement(By.name(s.getCell(4,7).getContents())).sendKeys(s.getCell(5,7).getContents());
			new Select(driver.findElement(By.name(s.getCell(4,8).getContents()))).selectByVisibleText(s.getCell(5,8).getContents());
			new Select(driver.findElement(By.name(s.getCell(4,9).getContents()))).selectByVisibleText(s.getCell(5,9).getContents());
	       new Select(driver.findElement(By.xpath(s.getCell(4,10).getContents()))).selectByVisibleText(s.getCell(5,10).getContents());
			new Select(driver.findElement(By.id(s.getCell(4,11).getContents()))).selectByVisibleText(s.getCell(5,11).getContents());
			new Select(driver.findElement(By.id(s.getCell(4,12).getContents()))).selectByVisibleText(s.getCell(5,12).getContents());
			new Select(driver.findElement(By.id(s.getCell(4,13).getContents()))).selectByVisibleText(s.getCell(5,13).getContents());
			driver.findElement(By.xpath(s.getCell(4,14).getContents())).click();
			driver.findElement(By.xpath(s.getCell(4,15).getContents())).click();
			driver.findElement(By.xpath(s.getCell(4,16).getContents())).click();
			driver.findElement(By.xpath(s.getCell(4,17).getContents())).click();	
		}
	

	}


