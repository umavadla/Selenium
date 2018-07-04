package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myaccountvalidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUserName")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.id("imgbtnSignin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("My Profile")).click();
	String name=driver.findElement(By.id("lblName")).getText();
	System.out.println("name :"+name);
		driver.findElement(By.xpath("//*[@id='first_div']/table/tbody/tr[18]/td[2]/a/img")).click();
	
		driver.findElement(By.id("cust_name")).clear();
		driver.findElement(By.id("cust_name")).sendKeys("Uma Reddy Vadla");
		Thread.sleep(3000);
		String name2=driver.findElement(By.xpath("//*[@id='cust_name']")).getAttribute("value");
		System.out.println("name :"+name2);
		if(name.equals(name2)) {
			System.out.println("both r same names");
		}else {
			System.out.println("both r not same names");
		}
			
	}

}
