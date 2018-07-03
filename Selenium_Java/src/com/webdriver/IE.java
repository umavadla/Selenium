
package com.webdriver;


import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class IE {

		


			public static void main(String[] args) throws Exception 
			{
				// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.ie.driver",".//BrowserDrivers//IEDriverServer.exe");
			
		driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123dsafff");
			}
		}
