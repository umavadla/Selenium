package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeit_textValidation {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.justrechargeit.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	String titleofthepage ="Online Prepaid Mobile, DTH & Data Card Recharge & Top Up Service Provider Company - Justrechargeit";
	System.out.println(titleofthepage);
	//String expectedresult= "create new account
	driver.findElement(By.id("signup-link9")).click();
    String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	if(actualtitle.equals(titleofthepage)) {
		System.out.println("expected page displayed");
	}else
		{System.out.println("expected page not displayed");
	}
}


}
