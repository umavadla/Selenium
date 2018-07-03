package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Page {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		// wait
		Thread.sleep(5000);
		// Click on Images link
		// driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[3]/a")).click();

		// get the text from application
		String gmailText = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailText);
		
	}

}
