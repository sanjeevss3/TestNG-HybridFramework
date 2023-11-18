package com.readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteIntoExcelFile {

	public static void main(String[] args) throws Exception {

		File scr = new File("./exceltestdata/readdatafromspreadsheet.xls");
		FileInputStream fis = new FileInputStream(scr);
		// C:\\Users\\QA
		// Team\\git\\Recruitment\\recruitment\\exceltestdata\\readdatafromspreadsheet.xls
		// Read data from .xls workbook
		HSSFWorkbook wb = new HSSFWorkbook(fis);

		// Read data from .xlsx workbook
		// XSSFWorkbook xlsxwb = new XSSFWorkbook(fis);

		HSSFSheet sheet1 = wb.getSheet("lmpcredentials");

		sheet1.getRow(0).getCell(2).setCellValue("pass");
		// sheet1.getRow(0).getCell(2).setCellValue("PASS");
		sheet1.getRow(1).getCell(2).setCellValue("FAILED");
		sheet1.getRow(2).getCell(2).setCellValue(3.3);

		FileOutputStream fout = new FileOutputStream(scr);
		wb.write(fout);

		wb.close();
		System.out.println("Data are inserted in excelsheet---------->>>>>>>>>");
	}

}