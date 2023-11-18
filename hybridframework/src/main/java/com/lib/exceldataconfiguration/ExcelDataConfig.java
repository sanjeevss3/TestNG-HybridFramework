package com.lib.exceldataconfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataConfig {

	HSSFWorkbook xlswb;
	HSSFSheet sheet1;

	public ExcelDataConfig(String excelpath) {

		try {
			File scr = new File(excelpath);
			FileInputStream fis = new FileInputStream(scr);

			// Read data from .xls workbook
			xlswb = new HSSFWorkbook(fis);

			// Read data from .xlsx workbook
			// XSSFWorkbook xlsxwb = new XSSFWorkbook(fis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getdata(int sheetnumber, int row, int column) {
		sheet1 = xlswb.getSheetAt(sheetnumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}

	public int getRowCount(int sheetIndex) {
		int row = xlswb.getSheetAt(sheetIndex).getLastRowNum();
		return row = row + 1;

	}
}
