package com.webdriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spiceject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      WebDriver driver;
      System.setProperty("webdriver.chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("http://www.spicejet.com/");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
      //from city
      driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
      //select hyd
      driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[7]/a")).click();
    //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Thread.sleep(5000);
      driver.findElement(By.linkText("Jaipur (JAI)")).click();
      Thread.sleep(2000);
      //date selection
      driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[5]/a")).click();
      
     Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id='Div1']/button")).click();
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[2]/a")).click();
     
      //currency selection
      new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
      //click on search
      driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
