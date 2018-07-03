package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NSR_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/vasu/Desktop/NSR_Selenium%20Automation.html");
		driver.findElement(By.name("firstname")).sendKeys("vasu");
		driver.findElement(By.name("lastname")).sendKeys("singareddy");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-6")).click();
		driver.findElement(By.id("datepicker")).sendKeys("15/05/2018");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		new Select(driver.findElement(By.id("continents"))).selectByVisibleText("Antartica");
		
		//new Select(driver.findElement(By.id("countries"))).selectByVisibleText("Nepal");
		new Select(driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[7]/div/select[2]"))).selectByVisibleText("Nepal");

		new Select(driver.findElement(By.id("CurrentlyWorking"))).selectByVisibleText("Yes");
		
		new Select(driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/form/fieldset/div[7]/div[2]/select[2]"))).selectByVisibleText("3-5 L");
		
		new Select(driver.findElement(By.id("selenium_commands"))).selectByVisibleText("Wait Commands");
		//driver.findElement(By.id("submit")).click();
	
		

		
		
			

	}

}
