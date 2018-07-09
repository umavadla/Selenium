package com.scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Facebooklogin {
	WebDriver driver;

  @Test
  public void f() {
	// enter url
			// type user name into username into edit box
			driver.findElement(By.id("email")).sendKeys("uma.vadla@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("umareddy70");
			driver.findElement(By.id("loginbutton")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\UMA C\\Desktop\\Selenium\\lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

  }

  @AfterClass
  public void afterClass() {
  }

}
