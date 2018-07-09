package com.scenarios;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilities.Commonfunctions;

public class TayotaFrameCount {
	public static void main(String[] args) throws Exception {
		Commonfunctions cfn = new Commonfunctions();
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".//browserDrivers//chromedriver.exe");
		driver =new ChromeDriver();
//		driver.get("https://jqueryui.com/resources/demos/tooltip/default.html");
		driver.get("https://www.toyota.co.uk/order-a-brochure");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.switchTo().defaultContent();
		cfn.loopAllIframeAndReturnCountOfElement(By.xpath(".//*[@id='delivery_method']/div/ul/li[2]/a/div/div"));
	}

}



	


