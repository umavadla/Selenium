package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.justrechargeit.com/SignIn.aspx");
driver.manage().window().maximize();
// type user name into username into edit box
driver.findElement(By.id("txtUserName")).sendKeys("uma.vadla@gmail.com");
driver.findElement(By.name("txtPasswd")).sendKeys("123456");
driver.findElement(By.id("imgbtnSignin")).click();
driver.findElement(By.xpath("//*[@id='listingtable_ImgRecharge_1']")).click();
//Thread.sleep(6000);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.linkText("View Popular Recharges")).click();
//parent window
String ParentWindow = driver.getWindowHandle();
java.util.Set<String> allWindows = driver.getWindowHandles();
//get allwindows names
for( String childwindow :allWindows) {
if(!childwindow.equals(ParentWindow)) {
	driver.switchTo().window(childwindow);
	//Thread.sleep(9000);
	WebDriverWait ww = new WebDriverWait(driver, 10);
	ww.until(ExpectedConditions.elementToBeClickable(By.linkText("55")));
	driver.findElement(By.linkText("55")).click();
	//driver.findElement(By.xpath("//*[@id='lblUserText3']")).click();
//driver.close();
Thread.sleep(5000);
}
}
driver.switchTo().window(ParentWindow);

//Thread.sleep(5000);
WebDriverWait ww = new WebDriverWait(driver, 10);
ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disCd']")));
driver.findElement(By.xpath("//*[@id='disCd']")).click();

	}

	}
	
	


