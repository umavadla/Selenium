package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Commands {
	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mail.com/");

		driver.findElement(By.id("login-button")).click();

		// click on Can't access your account?
		driver.findElement(By.linkText("Can't access your account?")).click();

		// get the title of the page
		String titleofthepage = driver.getTitle();// Actual result, capturing from Application
		System.out.println(titleofthepage);

		String expectedTitle = "Help Center";// expected results, we are providing to eclipse

		// validate whether the title of the page is displayed "Help Center" or not?
		if (expectedTitle.equals(titleofthepage)) {
			System.out.println("expected page has displayed");

		} else {
			System.out.println("expected page has not displayed");
		}
	}

}
