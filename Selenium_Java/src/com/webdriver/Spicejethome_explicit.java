package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class Spicejethome_explicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// round tript
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		// from city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// click on Hyd
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[7]/a")).click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(5000);

		/*
		 * WebDriverWait ww = new WebDriverWait(driver, 10);// 10 xeconds is maximum
		 * time to wait for the element
		 * ww.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * linkText("Goa (GOI)")));
		 */

		// if goa text is not present, then system will wait another 0.5 sec and do same
		// action again

		// click on Goa
		driver.findElement(By.linkText("Goa (GOI)")).click();

		// date selection
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[5]/a")).click();
		Thread.sleep(2000);
		
		//to date selection
		driver.findElement(By.xpath("//*[@id='Div1']/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[2]/a")).click();

		// currency selection
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("USD");

		// click on search button
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

		// WebDriverWait w = new WebDriverWait(driver, 5);
		// w.until(ExpectedConditions.elementToeClickable(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")));
		// driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		//
	}

}
