package com.advancewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getext {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".//BrowserDrivers//chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/tooltip/default.html");
		String text1=driver.findElement(By.linkText("Tooltips")).getText();
		System.out.println("text :"+text1);
		String text2=driver.findElement(By.linkText("Tooltips")).getAttribute("title");
		System.out.println("text :"+text2);
		String textlink=driver.findElement(By.linkText("ThemeRoller")).getText();
		System.out.println("text :"+textlink);
		String textmsg=driver.findElement(By.linkText("ThemeRoller")).getAttribute("title");
		System.out.println("text :"+textmsg);
        String age=driver.findElement(By.id("age")).getAttribute("title");
        System.out.println("text :"+age);
	}

}
