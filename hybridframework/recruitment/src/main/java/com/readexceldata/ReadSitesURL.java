package com.readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSitesURL {

	public static void main(String[] args) throws Exception {

		File scr = new File("D:\\Workspace_Selenium\\readdatafromspreadsheet.xls");
		FileInputStream fis = new FileInputStream(scr);

		// Read data from .xls workbook
		HSSFWorkbook xlswb = new HSSFWorkbook(fis);

		// Read data from .xlsx workbook
		// XSSFWorkbook xlsxwb = new XSSFWorkbook(fis);

		HSSFSheet sheet1 = xlswb.getSheet("lmpcredentials");

		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total no. of rows: " + (rowcount + 1));

		for (int i = 0; i < rowcount; i++) {
			String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Data from row: " + i + " is " + data0);
		}

		xlswb.close();
	}

}