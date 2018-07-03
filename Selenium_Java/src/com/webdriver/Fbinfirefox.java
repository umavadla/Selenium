package com.webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbinfirefox {

		


			public static void main(String[] args) throws Exception 
			{
				// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",".//BrowserDrivers//geckodriver.exe");
			
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123dsafff");
			}
		}
