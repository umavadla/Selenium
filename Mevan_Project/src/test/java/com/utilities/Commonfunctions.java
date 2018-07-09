package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;

public class Commonfunctions extends StaticVariables {
	private static final String Locators = null;

	// chromebrowser lanch
	public void chromebrowserlaunch() {
		// for chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// for firefox
	public void firefoxbrowserlaunch() {
		System.setProperty("webdriver.gecko.driver", ".\\browserdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();

	}

	public void internetexplorerlaunch() {
		System.setProperty("webdriver.ie.driver", ".\\browserdrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	public void navigateURL(String baseURL) {
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
	}

	/*************** sendkeys *****************/
	public void sendKeysByID(String Locators, String inputdata) {
		WebElement element = driver.findElement(By.id(Locators));
		if (element.isDisplayed() && element.isEnabled()) {
			element.clear();
			element.sendKeys(inputdata);
		} else {
			System.out.println("element is not displayed or not in enable state");
		}
	}

	/************* sendkeysbyname *****************/
	public void sendKeysByNAME(String Locators, String inputdata) {
		WebElement element = driver.findElement(By.id(Locators));
		if (element.isDisplayed() && element.isEnabled()) {
			element.clear();
			element.sendKeys(inputdata);
		} else {
			System.out.println("element is not displayed or not in enable state");
		}

	}

	/***** click ****/
	public void clickByID(String Locators) {
		WebElement element = driver.findElement(By.id(Locators));
		if (element.isDisplayed() && element.isEnabled()) {

			element.click();
		} else {
			System.out.println("element is not displayed or not in clickable state");
		}
		/******** screenshot *****/
	}

	public String timeStamp() {
		Date d = new Date();
		// system date in the format thu jun 28 06:08:41:03IST
		// we need dd_mm_yyyy_hr_min_ss
		SimpleDateFormat myformat = new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
		String timeStamp = myformat.format(d);
		return timeStamp;
	}

	public void takeScreenshot(String name) throws IOException {

		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("./screenshots/ " + name + "_" + timeStamp() + "_" + ".png"));

	}

	public void takescreenshotfailorpass(ITestResult results) throws IOException {
		// get classname which testcase is executing
		ClassName = results.getTestClass().getName().trim();
		methodname = results.getName().trim();
		if (results.getStatus() == ITestResult.FAILURE) {

			File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(s, new File(
					"./screenshots/" + "FAIL" + "_" + ClassName + "_" + methodname + "_" + timeStamp() + ".png"));

		}
		if (results.getStatus() != ITestResult.FAILURE) {

			File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(s, new File(
					"./screenshots/" + "pass" + "_" + ClassName + "_" + methodname + "_" + timeStamp() + ".png"));

		}
	}

	public void switchTodefaultFrame() {
		try {
			driver.switchTo().defaultContent();
			System.out.println("Navigated back to webpage from frame");
		} catch (Exception e) {
			System.out.println("Unable to navigate to main wepage from Frame" + e.getStackTrace());
		}
	}

	public void switchToFrame() {
		driver.switchTo().defaultContent();
		WebElement iFrameElement = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(iFrameElement);
	}

	public void switchToFrameByInt(int i) {
		switchTodefaultFrame();
		driver.switchTo().frame(i);
	}

	// system will identify the frames count
	public int iFrameCount() {
		switchTodefaultFrame();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());
		System.out.println("numberOfFrames count : " + numberOfFrames);
		return numberOfFrames;

	}

	public int loopAllIframeAndReturnCountOfElement(By locater) {
		int elementPresenceCount = 0;
		int loop = 0;
		int maxFrameCount = iFrameCount();// 2

		while (elementPresenceCount < 1) {
			try {
				Thread.sleep(500);
				switchToFrameByInt(loop);
				elementPresenceCount = driver.findElements(locater).size();// 1
				loop++;// 1
				if (elementPresenceCount > 0 || loop > maxFrameCount) {
					break;
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		return elementPresenceCount;

	}

}