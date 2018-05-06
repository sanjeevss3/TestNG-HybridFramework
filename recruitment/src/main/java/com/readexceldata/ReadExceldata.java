package com.readexceldata;

import com.lib.exceldataconfiguration.ExcelDataConfig;

public class ReadExceldata {

	public static void main(String[] args) {

		ExcelDataConfig excel = new ExcelDataConfig("D:\\Workspace_Selenium\\readdatafromspreadsheet.xls");
		System.out.println(excel.getdata(1, 1, 0));

	}

}
