package TestNG_Progs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class crosstesting {
	WebDriver driver;
  @Test
  public void f() {
	//  driver.get("https://www.collegeweeklive.com/go-signup/");
		driver.findElement(By.id("firstName")).sendKeys("uma");
		driver.findElement(By.id("lastName")).sendKeys("vadla");
		driver.findElement(By.id("emailAddress")).sendKeys("uma.vadlamail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("234-456-0000");
		driver.findElement(By.name("password")).sendKeys("uma12345");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("uma12345");
		new Select(driver.findElement(By.name("nationality"))).selectByVisibleText("INDIA");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Current Undergraduate Student Looking to Transfer");
    new Select(driver.findElement(By.xpath("//*[@id='questions[q_134]']"))).selectByVisibleText("Spring 2020");
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByVisibleText("February");
		new Select(driver.findElement(By.id("questions_16_DayOfMonth"))).selectByVisibleText("2");
		new Select(driver.findElement(By.id("questions_16_DOBYear"))).selectByVisibleText("2002");
		driver.findElement(By.xpath("//*[@id='questions[q_19]']/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='questions[q_19]']/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"questions[q_19]\"]/div[2]/div[3]/label")).click();
		driver.findElement(By.xpath("//*[@id='questions[q_19]']/div[1]")).click();
	
  }
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser) throws Exception {
	  try {
		  if (browser.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver",".//BrowserDrivers//chromedriver.exe");
				driver =new ChromeDriver();
		  }else if(browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver",".//BrowserDrivers//geckodriver.exe");
				driver =new FirefoxDriver();
				

  }else if(browser.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver",".//BrowserDrivers//IEDriverServer.exe");
		driver =new InternetExplorerDriver();
	  
  }else {
	  System.out.println("browser is not avaliable");
  }
		
	} catch (Exception e) {
		System.out.println(e);
	} 	
				driver.get("https://www.collegeweeklive.com/go-signup/");
				Thread.sleep(5000);

  }

  @AfterClass
  public void afterClass() {
	  driver.quit();

  }

}
