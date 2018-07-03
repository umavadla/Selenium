package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.read.biff.BiffException;

import jxl.write.WritableWorkbook;

public class Retestingwithresultsprac {

	public static void main(String[] args) throws JXLException, IOException, InterruptedException,BiffException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String Results;
		//launch  chrome browser
		System.setProperty("webdriver.chrome.driver"
				,".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// enter url
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		String path=".\\testdata\\td.xls";
		FileInputStream f2=new FileInputStream(path);
		Workbook w=Workbook.getWorkbook(f2);
		Sheet s =w.getSheet("justr");
        Sheet s2=w.getSheet("retesting");
        //create excel file using fileoutputstream
        FileOutputStream fo=new FileOutputStream(".\\testdata\\resultswithstatus.xls");
        WritableWorkbook ww=Workbook.createWorkbook(fo);
        WritableSheet ws=ww.createSheet("RESULTS",0);
        System.out.println("row count"+s2.getRows());
        for ( int i = 1; i<s2.getRows(); i++) {
		driver.manage().window().maximize();
		// type user name into username into edit box
		driver.findElement(By.id(s.getCell(4,2).getContents())).clear();
		driver.findElement(By.id(s.getCell(4,3).getContents())).clear();
		driver.findElement(By.id(s.getCell(4,2).getContents())).sendKeys(s2.getCell(0, i).getContents());//username
		driver.findElement(By.id(s.getCell(4,3).getContents())).sendKeys(s2.getCell(1, i).getContents());//password
        
		Thread.sleep(5000);
		driver.findElement(By.id(s.getCell(4,4).getContents())).click();
		//driver.close();
		//signout element is dispalyed r not?going to do validate
		if(driver.findElement( By.id("jriTop_signOut")).isDisplayed()) {
			Results="pass";
			System.out.println("given credentlias are valid");
			
			driver.findElement(By.id("jriTop_signOut")).click();
		}else {
			Results="fail";
			System.out.println("given credentlias are not valid");
		}
		//create new excel 
		//get the values from exist excel
		//send the data with results to newly created excel file
	
			for(int j=0; j<s2.getColumns(); j++) //child loop
				{
				Label a= new Label (j,i, s2.getCell(j,i).getContents());
				ws.addCell(a);
		}//loop ends
			//send the result in the newly created file
			Label b= new Label(2,i,Results);
			ws.addCell((WritableCell) b);
		
		}//i for loop ended
	//create heading of new excel file//UN,PAS,RES
	Label UN=new Label(0,1,"Username");
	Label PWD=new Label(1,0,"Password");
	Label Res=new Label(2,0,"Results");
	ws.addCell(UN);
	ws.addCell(PWD);
	ws.addCell(Res);		
	
	ww.write();
	ww.close();		

	

	}

}
