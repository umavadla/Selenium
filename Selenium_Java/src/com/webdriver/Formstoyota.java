package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Formstoyota {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",".//BrowserDrivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://forms.toyota.co.uk/quick-finance-quote");
		//driver.switchTo().defaultContent();
	//	driver.switchTo().frame(2);
	 new Select(driver.findElement(By.id("codeweaversModels"))).selectByVisibleText("Avensis");
	 Thread.sleep(5000);
	String s= driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div[2]/div[1]/div/div/div[1]/div[3]/div[2]/div/div/span[1]")).getText();
	System.out.println("text :"+s);
	String s1=driver.findElement(By.id("codeweaversCashPrice")).getText();
	System.out.println("amt :"+s1);
	String s2=driver.findElement(By.cssSelector("div.codeweaversResultElement:nth-child(1) > div:nth-child(1)")).getText();
	System.out.println("Details abt payment  :"+s2);
	String fm = driver.findElement(By.id("codeweaversFirstPayment")).getText();
	System.out.println("amt :"+fm);
	String N=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[2]/div[1]")).getText();
	System.out.println("text  :"+N);
	String N1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[2]/div[2]")).getText();
	System.out.println("amt :"+N1);
	String cd=driver.findElement(By.xpath(".//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[3]/div[1]")).getText();
	System.out.println("text :"+cd);
	String cd1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[3]/div[2]")).getText();
	System.out.println("amt :"+cd1);
	String cp=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[4]/div[1]")).getText();
	System.out.println("text :"+cp);
	String cp1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[4]/div[2]")).getText();
	System.out.println("amt :"+cp1);
	String fd=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[5]/div[1]")).getText();
	System.out.println("text :"+fd);
	String fd1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[5]/div[2]")).getText();
	System.out.println("amt :"+fd1);
	String amc=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[6]/div[1]")).getText();
    System.out.println("text :"+amc);
String amc1=driver.findElement(By.xpath(".//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[6]/div[2]")).getText();
System.out.println("amt "+amc1);
String gfv=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[7]/div[1]")).getText();
System.out.println("text :"+gfv);
String gfv1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[7]/div[2]")).getText();
System.out.println("amt :"+gfv1);
String tap=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[8]/div[1]")).getText();
System.out.println("text :"+gfv);
String tap1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[8]/div[2]")).getText();
System.out.println("amt :"+tap1);
String term=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[9]/div[1]")).getText();
System.out.println("text :"+term);
String term1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[9]/div[2]")).getText();
System.out.println("m :"+term1);
String fri=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[10]/div[1]")).getText();
System.out.println("text :"+fri);
String fri1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[10]/div[2]")).getText();
System.out.println("percent :"+fri1);
String rep=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[11]/div[1]")).getText();
System.out.println("text :"+rep);
String rep1=driver.findElement(By.xpath("//*[@id='codeweaversFinanceTab0']/div[1]/div[2]/div[11]/div[2]")).getText();
System.out.println("res :"+rep1);
	}

}
