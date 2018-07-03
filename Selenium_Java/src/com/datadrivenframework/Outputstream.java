package com.datadrivenframework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



import jxl.JXLException;
import jxl.write.Label;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Outputstream {

	public static void main(String[] args) throws FileNotFoundException,IOException, JXLException {
		// TODO Auto-generated method stub
FileOutputStream fo=new FileOutputStream("./testdata/testoutput.xls");
WritableWorkbook ww=Workbook.createWorkbook(fo);
WritableSheet ws=ww.createSheet("testing",0);
//to move data into specific loationa using labels
Label a = new Label(0,0,"Username");//now the label store in ram loaction
// to move data into specific location
Label b = new Label(1,0,"password");
ws.addCell(b);

ws.addCell(a);
ww.write();
ww.close();
	}

}
