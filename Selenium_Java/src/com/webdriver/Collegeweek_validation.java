package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Collegeweek_validation {
public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.collegeweeklive.com/go-signup/");
		driver.findElement(By.xpath("//*[@id='register']/div[7]/div/button")).click();
		String msg= driver.findElement(By.xpath("//*[@id='firstNameError']/span")).getText();
		System.out.println(msg);
		String msg2=driver.findElement(By.xpath("//*[@id='lastNameError']/span")).getText();
		System.out.println(msg2);
		String msg3=driver.findElement(By.xpath("//*[@id='emailAddressError']/span")).getText();
		System.out.println(msg3);
		String msg4=driver.findElement(By.xpath("//*[@id='phoneNumberError']/span")).getText();
		System.out.println(msg4);
		String msg5=driver.findElement(By.xpath("//*[@id='passwordError']/span")).getText();
		System.out.println(msg5);
		String msg6=driver.findElement(By.xpath("//*[@id='ConfirmPasswordError']/span")).getText();
		System.out.println(msg6);
		String msg7=driver.findElement(By.xpath("//*[@id='nationalityError']/span")).getText();
		System.out.println(msg7);
		String msg8=driver.findElement(By.xpath("//*[@id='attendeeTypeError']/span")).getText();
		System.out.println(msg8);
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("ANDORRA");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("High School Student/Future Undergraduate Student");
}
}
