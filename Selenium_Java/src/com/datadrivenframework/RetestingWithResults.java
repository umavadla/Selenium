package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class RetestingWithResults {

	public static void main(String[] args) throws IOException, BiffException, Exception {

		WebDriver driver;
		String Results;
		System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		String path = ".\\testData\\Test_justrecharge.xls";
		FileInputStream fi = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("JustRc");		
		// retesting
		Sheet s1 = w.getSheet("Retesting");
		
		//create excel file using Fileoutputstream
		FileOutputStream fo = new FileOutputStream(".\\testData\\Resultswithstatus.xls");
		WritableWorkbook ww = Workbook.createWorkbook(fo);
		WritableSheet ws = ww.createSheet("Results",0);
			
		System.out.println("Row Count: " + s1.getRows());
		// row is 'i'
		for (int i = 1; i < s1.getRows(); i++) {
			// clear the data into username element
			driver.findElement(By.id(s.getCell(4, 2).getContents())).clear();
			driver.findElement(By.id(s.getCell(4, 2).getContents())).sendKeys(s1.getCell(0, i).getContents());// UN

			driver.findElement(By.id(s.getCell(4, 3).getContents())).clear();
			driver.findElement(By.id(s.getCell(4, 3).getContents())).sendKeys(s1.getCell(1, i).getContents());// PWD
			Thread.sleep(5000);
			driver.findElement(By.id(s.getCell(4, 4).getContents())).click();
			Thread.sleep(5000);

			if (driver.findElement(By.id("jriTop_signOut")).isDisplayed()) {
				Results = "Pass";
				System.out.println("Given credentilas are valid");
				driver.findElement(By.id("jriTop_signOut")).click();
			} else {
				Results = "Fail";
				System.out.println("Given credentilas are in-valid");
			}			
			//get the values from exsiting excel andsend though values to newly created excelsheet;
			for (int j = 0; j < s1.getColumns(); j++) {
				
				Label a = new Label(j, i, s1.getCell(j, i).getContents());
				ws.addCell(a);
				
				
			}//j for loop end
			
			//send the results to newly created excel file
			Label b = new Label(2, i, Results);
			ws.addCell(b);				

		}//i for loop end
		
		//create headings of new excel file //UN //PWD/ Results
		Label UN = new Label(0, 0, "UserName");
		Label PWD = new Label(1, 0, "Password");
		Label Res = new Label(2, 0, "Rsults");
		ws.addCell(UN);
		ws.addCell(PWD);
		ws.addCell(Res);		
		
		ww.write();
		ww.close();		

	}

}
