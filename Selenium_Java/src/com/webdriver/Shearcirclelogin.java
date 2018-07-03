package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shearcirclelogin {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://shearcircle.com/index.php/professional/register?no_redirect=true");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/span/a[1]")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='login_form']/div[3]/div/center/button")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
