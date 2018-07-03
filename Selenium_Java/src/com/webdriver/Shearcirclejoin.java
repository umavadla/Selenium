package com.webdriver;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shearcirclejoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		

		driver.get("http://shearcircle.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/span/a[2]")).click();
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[2]/div/a")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,900)");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='register_form']/div[12]/button")).click();
		String expectedResultsOffirstnameErrMsg = "Please enter first name";
		System.out.println(expectedResultsOffirstnameErrMsg);
		String actulaResultsOffirstnameErrMsg = driver.findElement(By.xpath("//*[@id='register_form']/div[1]/em")).getText();
		Thread.sleep(5000);
		System.out.println(actulaResultsOffirstnameErrMsg);
		
		/*//validation
		if (actulaResultsOffirstnameErrMsg.equals(expectedResultsOffirstnameErrMsg)) {
			System.out.println("both r matching");
			driver.navigate().refresh();
		}
		else {
			System.out.println("both r not matching");

		}
		System.out.println("After Validation");*/
		
		//Assertion
		System.out.println("Before Assertion");
		//assertEquals(actulaResultsOffirstnameErrMsg, expectedResultsOffirstnameErrMsg);
		//assertEquals(actual, expected);
		
		//assertEquals(actual, expected, message);
		assertEquals(actulaResultsOffirstnameErrMsg, expectedResultsOffirstnameErrMsg, "Both the texts are not matching");
		
		driver.navigate().refresh();
		System.out.println("After Assertion");
		
		
		
		
		
		
		
		
		
		
		
	}

}
