package com.webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fb {

		


			public static void main(String[] args) throws Exception 
			{
				// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\UMA C\\Desktop\\Selenium\\lib\\chromedriver_win32\\chromedriver.exe");
			
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("uma.vadla@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123dsafff");
			}
		}

	


