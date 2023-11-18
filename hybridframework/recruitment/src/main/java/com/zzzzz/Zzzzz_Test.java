package com.zzzzz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.lib.exceldataconfiguration.ExcelDataConfig;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class Zzzzz_Test {
	
	public static void main(String[] args) throws IOException {
//		ExcelDataConfig excel=new ExcelDataConfig("D:\\Workspace_Selenium\\readdatafromspreadsheet.xls");
//		System.out.println(excel.getdata(1, 1, 1));
		
		File src=new File("D:\\\\Workspace_Selenium\\\\readdatafromspreadsheet.xls");
		FileInputStream fis=new FileInputStream(src);
		
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet=workbook.getSheet("lmpcredentials");
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);
		workbook.close();
	}

}
