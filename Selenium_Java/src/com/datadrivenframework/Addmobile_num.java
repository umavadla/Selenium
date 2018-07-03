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

public class Addmobile_num {

	public static void main(String[] args) throws InterruptedException, IOException, JXLException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		// type user name into username into edit box
		driver.findElement(By.id("txtUserName")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.id("imgbtnSignin")).click();
		driver.findElement(By.className("addMobileLink")).click();
		String path=".\\testdata\\addmobilenumbers.xls";
		FileInputStream fo=new FileInputStream(path);
		Workbook w=Workbook.getWorkbook(fo);
		Sheet s=w.getSheet("addmobilenum");
		for(int i=1; i< s.getRows(); i++) {
		
		
			driver.findElement(By.id("txtpopMobileNo")).sendKeys(s.getCell(0,i).getContents());
			Thread.sleep(8000);
			new Select( driver.findElement(By.id("ddlpopMobileSP"))).selectByVisibleText(s.getCell(1,i).getContents());
			Thread.sleep(5000);
			driver.findElement(By.id("txtpopMobileNickname")).sendKeys(s.getCell(2,i).getContents());
			Thread.sleep(5000);
			new Select(driver.findElement(By.id("ddlpopMobileLocation"))).selectByVisibleText(s.getCell(3,i).getContents());
			Thread.sleep(5000);
			driver.findElement(By.id("btnPopupAddMobile")).click();
			Thread.sleep(5000);
			driver.findElement(By.className("addMobileLink")).click();
		}
	}

}
