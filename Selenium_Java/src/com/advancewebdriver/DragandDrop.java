package com.advancewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".//BrowserDrivers//chromedriver.exe");
		driver =new ChromeDriver();
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();
        //action scripts
        Actions act=new Actions(driver);
        WebElement draggable= driver.findElement(By.id("draggable"));
        WebElement droppable= driver.findElement(By.id("droppable"));
        act.dragAndDrop(draggable,droppable).build().perform();
        

	}

}
