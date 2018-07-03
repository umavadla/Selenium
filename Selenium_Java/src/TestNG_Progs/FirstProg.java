package TestNG_Progs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstProg {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Iam @TEST annotation f");
  }
  @Test
  public void login() {
	  System.out.println("Iam @TEST annotation login");
}
  @Test
  public void sendmail() {
	  System.out.println("Iam @TEST annotation sendmail");
}
  @Test
  public void logout() {
	  System.out.println("Iam @TEST annotation logout");
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
		// Maximize Browser window
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

@AfterClass
public void afterClass() {
	  driver.quit();
}
}
