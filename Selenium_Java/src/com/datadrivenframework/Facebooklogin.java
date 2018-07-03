package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class Facebooklogin {
			public static void main(String[] args) throws Exception,IOException,JXLException
			{
				// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UMA C\\Desktop\\Selenium\\lib\\chromedriver_win32\\chromedriver.exe");
			
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//where is the excel file located in local system
		String path=".\\testdata\\td.xls";
		//get the data from external files will use fileinputstream API
		FileInputStream fi=new FileInputStream(path);
		//read and assign the excel from file_location
		Workbook w=Workbook.getWorkbook(fi);
		//get the sheet from excel
		Sheet s =w.getSheet("fb");
		//type user name and password
		driver.findElement(By.id(s.getCell(4,2).getContents())).sendKeys(s.getCell(5,2).getContents());
		driver.findElement(By.name(s.getCell(4,3).getContents())).sendKeys(s.getCell(5,3).getContents());
			}
		

	}


