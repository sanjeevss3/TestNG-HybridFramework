package sni_mpi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class Test {
	public static void main(String[] args){

		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";

		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		File scr = new File("D:\\Workspace_Selenium\\TestData.xls");
//		FileInputStream fis = new FileInputStream(scr);
//
//		HSSFWorkbook xlswb = new HSSFWorkbook(fis);
//
//		HSSFSheet sheet1 = xlswb.getSheet("sheetname2");

			driver.getCurrentUrl();

			{

//			FileInputStream fi = new FileInputStream(“D:\\data.xls”);
//
//			Workbook w = Workbook.getWorkbook(fi);
//
//			s = w.getSheet();
//				driver.get();
//
//			driver.get(“sheet1”);
//
//			 
//
//			for(int row=1; row <=s.getRows();row++)
//
//			{
//
//			String Urllist = s.getCell(0, row).getContents();
//
//			System.out.println(“Urllist”+ Urllist);
//			java.util.List<WebElement> linkElements = driver.findElements(By.tagName(“a”));
//
//			 
//
//			String[] linkTexts = new String[linkElements.size()];
//
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//			 
//
//			int j = 0;
//
//			for (WebElement e : linkElements)
//
//			{
//
//			linkTexts[j] = e.getText();
//
//			j++;
//
//			}

			 

			//test each link
//
//			for (String t : linkTexts)
//
//			{
//
//			if (t != null && !t.isEmpty())
//
//			{
//
//			driver.findElement(By.linkText(t)).click();
//
//			String title;
//
//			title=driver.getTitle();
//
//			if(title.contains(“404”))
//
//			{
//
//			out.println(t+” the link is not working”);
//			}
//
//			else{
//
//			out.println(“\”” + t + “\””
//			+ ” is working.”);
//
//			}
	}
	}
}
			
