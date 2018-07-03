package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addnumbertojustrecharge {

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

		Thread.sleep(5000);
		driver.findElement(By.id("imgbtnSignin")).click();
		driver.findElement(By.xpath("//*[@id='divLnkAddMobile']/a")).click();
		driver.findElement(By.xpath("//*[@id='txtpopMobileNo']")).sendKeys("9997226312");
		new Select(driver.findElement(By.xpath("//*[@id='ddlpopMobileSP']"))).selectByVisibleText("Idea");
		// Thread.sleep(6000);
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait ww = new WebDriverWait(driver, 20);
		ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='txtpopMobileNickname']")));

		
		
		WebDriverWait ww1 = new WebDriverWait(driver, 20);
		ww1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddlpopMobileLocation']")));

		new Select(driver.findElement(By.xpath("//*[@id='ddlpopMobileLocation']"))).selectByVisibleText("Bihar & Jharkhand");
		
		driver.findElement(By.xpath("//*[@id='txtpopMobileNickname']")).sendKeys("sseendfh");
		
		driver.findElement(By.xpath("//*[@id='btnPopupAddMobile']")).click();
		//driver.findElement(By.xpath("//*[@id='img1']")).click();

	}
}
