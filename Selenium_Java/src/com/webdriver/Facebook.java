package com.webdriver;   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//webdriver object creation
		
		WebDriver driver;
		//launch  chrome browser
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\UMA C\\Desktop\\Selenium\\lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// enter url
		driver.get("https://www.facebook.com/");
		// type user name into username into edit box
		driver.findElement(By.id("email")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("umareddy70");
		driver.findElement(By.id("loginbutton")).click();
	}

}
 