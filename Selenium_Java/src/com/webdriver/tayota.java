package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tayota {

	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub
		WebDriver driver;
		//launch  chrome browser
		System.setProperty("webdriver.chrome.driver"
				,".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
         driver.get("https://www.toyota.co.uk/#/iframe/https%3A%2F%2Fforms.toyota.co.uk%2Fquick-finance-quote%3F_ga%3D2.97778331.525121620.1526690498-2141577628.1526690498");
         //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         WebDriverWait abc = new WebDriverWait(driver, 20);
         abc.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='codeweaversModels']/option[8]")));
	    driver.findElement(By.xpath("//*[@id='codeweaversModels']/option[8]")).click();
         System.out.println(abc);
}
}
