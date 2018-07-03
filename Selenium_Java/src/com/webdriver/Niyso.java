package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Niyso {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://mis.nyiso.com/public/");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		
		String s=driver.findElement(By.xpath("/html/body/table/tbody/tr[8]/td[2]/span")).getText();
		System.out.println("text :"+s);
	}

}
