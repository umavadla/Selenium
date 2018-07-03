package com.webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Justrechargeit {
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
	//webdriver object creation
	
	WebDriver driver;
	//launch  chrome browser
	System.setProperty("webdriver.chrome.driver"
			,".\\BrowserDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	// enter url
	driver.get("https://www.justrechargeit.com/SignIn.aspx");
	driver.manage().window().maximize();
	// type user name into username into edit box
	driver.findElement(By.id("txtUserName")).sendKeys("uma.vadla@gmail.com");
	driver.findElement(By.name("txtPasswd")).sendKeys("123456");
	Thread.sleep(5000);
	driver.findElement(By.id("imgbtnSignin")).click();
	//driver.close();
}
}
