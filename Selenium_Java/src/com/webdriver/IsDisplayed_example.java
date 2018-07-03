package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsDisplayed_example {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.plus2net.com/javascript_tutorial/listbox-disabled-demo.php");
		//Page load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//validate whether the element is displayed or not?
		//submit form
		boolean submit = driver.findElement(By.xpath("//*[@id='f1']/input[3]")).isDisplayed();
		System.out.println(submit);
		
		//validate whether the element is selected or not?
		//No radio button
		boolean noRadioButton = driver.findElement(By.xpath("//*[@id='f1']/input[2]")).isSelected();
		System.out.println("Before click noRadioButton: "+noRadioButton);
	
		//click on NO rdiobutton
		driver.findElement(By.xpath("//*[@id='f1']/input[2]")).click();
		
		Thread.sleep(6000);
		
		boolean noRadioButton1 = driver.findElement(By.xpath("//*[@id='f1']/input[2]")).isSelected();
		System.out.println("AfternoRadioButton: "+noRadioButton1);
		
		
		//validate whether the element is enable or not?
		//Select dropdown
		boolean selectIsEnabled = driver.findElement(By.name("Category")).isEnabled();
		System.out.println("selectIsEnabled: "+selectIsEnabled);			
		
		/*String text = driver.findElement(By.xpath("//*[@id='f1']/text()[1]")).getText();
		System.out.println(text);*/
		
		
		//Explicitwait
		//wait time we declared
		WebDriverWait ww = new WebDriverWait(driver, 20);
		ww.until(ExpectedConditions.invisibilityOfElementLocated(By.name("Category")));
		
		System.out.println("explicit wait done");
				
				
				
				
				
				
				
				
				
		
		
		
		//Close all the related windows
		driver.quit();
	}

}
