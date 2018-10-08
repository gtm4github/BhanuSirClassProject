package excelSheet;
/*
-->In order to handle excel file we need to use 'API' given by 'Apache' called 'POI' (Poor Obfuscation Implementation)
 # we can download the API file from (latest version: 4.0.0)---> " http://poi.apache.org/ "
	 but we will use older version from---> " http://archive.apache.org/dist/poi/release/bin/poi-bin-3.17-20170915.zip "
	   after downloading-->extract it and create the folder inside your java project called 'poi' in eclipse
	   copy all the 13 jar files from the extracted folder & paste them into 'poi' folder--> and add all the jar files to 'build path'
 # create a excel file on the desktop,with the name 'Book1.xlsx' open it & enter the values in the first row of 'Sheet1'
 # copy the excel file and paste it inside 'input' folder present in eclipse

*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoExcel {
	public static void main(String[] args) throws Exception {
//Read
		Workbook w= WorkbookFactory.create(new FileInputStream("./input/Book1.xlsx"));
		String v=w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(v);
//write
		w.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Bhanu");
		w.write(new FileOutputStream("./input/Book2.xlsx")); //--> we r giving different path like 'SaveAs'
		w.close();
	}

}
