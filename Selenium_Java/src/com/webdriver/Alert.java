package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
		 WebDriver driver;
	      System.setProperty("webdriver.chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("https://retail.onlinesbi.com/retail/login.htm");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //click on contne button
	      driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	      
	      //Click on New user link
	      driver.findElement(By.linkText("New User ? Register here")).click();
	      
	      Thread.sleep(5000);
	      
	      //alert will be display
	      
	      //get the text from alert
	      String alertText = driver.switchTo().alert().getText();
	      System.out.println("alert message is : "+ alertText);
	      //to do cancel on alert
	     // driver.switchTo().alert().dismiss();
	      
	      //to click on Ok button in Alert
	      driver.switchTo().alert().accept();
	      //close()
	      //Where the  cursor  isavaialble that window will close
	      driver.close();
	      //quite: the related windows all will close when we use quit command
	      
	     // driver.quit();
	      
	      
	      
	}

}
