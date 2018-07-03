package com.webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toyota_selectcar {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://www.toyota.co.uk/order-a-brochure");
driver.findElement(By.id("disclaimerEprivacySave")).click();
Thread.sleep(8000);
//to click on ok button in alert ,we use accept
//driver.switchTo().alert().accept();
Thread.sleep(4000);
driver.switchTo().defaultContent();
driver.switchTo().frame(0);
driver.findElement(By.xpath("//*[@id='delivery_method']/div/ul/li[2]/a/div/div")).click();
driver.findElement(By.xpath("//*[@id='car_models']/div/ul/li[6]/div/img")).click();
String s=driver.findElement(By.xpath("//*[@id='car_models']/div/ul/li[6]/label")).getText();
System.out.println("car name:"+s);
	}
}