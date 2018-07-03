package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JustrechargeAlert {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 WebDriver driver;
	      System.setProperty("webdriver.chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://www.justrechargeit.com/SignIn.aspx");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.id("txtUserName")).sendKeys("uma.vadla@gmail.com");
	      driver.findElement(By.id("txtPasswd")).sendKeys("123456");
	      driver.findElement(By.id("imgbtnSignin")).click();
	      driver.findElement(By.id("listingtable_LinkButton3_0")).click();
	      Thread.sleep(2000);
	      String alerttext = driver.switchTo().alert().getText();
	      System.out.println("alertmsg :"+alerttext);
	      driver.switchTo().alert().accept();
	    //  driver.quit();
	}

}
