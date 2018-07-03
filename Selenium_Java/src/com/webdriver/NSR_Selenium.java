package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NSR_Selenium {
	public static void main(String[] args) throws Exception {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///C:/Users/UMA%20C/Downloads/NSR_Selenium%20Automation.html");
		// driver.navigate().to("file:///C:/Users/UMA%20C/Downloads/NSR_Selenium%20Automation.html");

		// driver.get("http://shearcircle.com/index.php/professional/register?no_redirect=true");
		// get the current URL of the page
		System.out.println("getCurrentUrl: " + driver.getCurrentUrl());

		// get title of the page
		System.out.println("getTitle: " + driver.getTitle());

		driver.findElement(By.name("firstname")).sendKeys("UmaReddy");
		driver.findElement(By.name("lastname")).sendKeys("vadla");
		Thread.sleep(6000);

		// //refresh / reload the page
		// driver.navigate().refresh();
		// driver.navigate().forward();
		// driver.navigate().back();

		Thread.sleep(5000);
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-0")).click();
		driver.findElement(By.id("datepicker")).sendKeys("mm-dd-yyyy");
		driver.findElement(By.className("checkbox")).click();
		driver.findElement(By.id("tool-2")).click();

		// new
		// Select(driver.findElement(By.name("continents"))).selectByVisibleText("North
		// America");
		new Select(driver.findElement(By.name("continents"))).selectByIndex(5);
		new Select(driver.findElement(By.name("countries"))).selectByVisibleText("U.S.A");

		new Select(driver.findElement(By.id("CurrentlyWorking"))).selectByVisibleText("Yes");

		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		new Select(driver.findElement(By.xpath("//*[@id='content']//form/fieldset/div[7]/div[2]/select[2]")))
				.selectByVisibleText("5-10 L");

		// print editbox count on Form
		int editBoxCount = driver.findElements(By.xpath("//*[@type='text']")).size();
		System.out.println("Editbox count: " + editBoxCount);

		// print radio count on Form
		int radioButtonCount = driver.findElements(By.xpath("// *[@type='radio']")).size();
		System.out.println("radiobutton count: " + radioButtonCount);

		int checkboxCount = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		System.out.println("Checkbox count : " + checkboxCount);

		int dropDownCount = driver.findElements(By.xpath("//select")).size();
		System.out.println("DropDown Count : " + dropDownCount);

		int linkCount = driver.findElements(By.xpath("//a")).size();
		System.out.println("linkCount : " + linkCount);

		int buttonCount = driver.findElements(By.xpath("//button")).size();
		System.out.println("buttonCount : " + buttonCount);

		int allElementsCount = editBoxCount + radioButtonCount + checkboxCount + dropDownCount + linkCount
				+ buttonCount;
		System.out.println("allElementsCount: " + allElementsCount);
		new Select(driver.findElement(By.xpath("//*[@id='selenium_commands']"))).selectByVisibleText("Switch Commands");
		new Select(driver.findElement(By.xpath("//*[@id='selenium_commands']")))
				.selectByVisibleText("WebElement Commands");

		/*
		 * List<WebElement> allitems =
		 * driver.findElements(By.xpath("//input[@type='radio']"));
		 * 
		 * for (WebElement ele : allitems)
		 * 
		 * {
		 * 
		 * System.out.println(ele.getAttribute("type"));
		 * 
		 * }
		 */

		// driver.findElement(By.id("CurrentlyWorking")).click();
		// Thread.sleep(20
		// driver.findElement(By.xpath("//*[@id='CurrentlyWorking']/option[2]")).click();
		// driver.findElement(By.className("input-xlarge")).click();
		// driver.findElement(By.xpath("//*[@id='CurrentlyWorking']/option[3]")).click();

		// driver.findElement(By.id("selenium_commands")).click();
		// driver.findElement(By.xpath("//*[@id=\\'selenium_commands\\']/option[4]")).click();chr
		// driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

		WebDriverWait ww = new WebDriverWait(driver, 20);
		ww.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

		//driver.findElement(By.id("submit")).click();
	}
}