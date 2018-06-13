package sni_mpi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class Stock_Count {

	public static void main(String[] args) throws IOException {
		String data1;
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		File file = new File("C:\\Vinay\\Test.xls");

		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);

		HSSFSheet sheet = workbook.getSheet("sheetname2");

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			data1 = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data1);

			driver.get(data1);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.open('/')");
			// System.out.println(driver.getTitle());
			// System.out.println(driver.findElement(By.className("used-search-block-count")).getText());

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(data1);
			{
				HttpResponse response = client.execute(request);
				if (response.getStatusLine().getStatusCode() != (404)
						|| response.getStatusLine().getStatusCode() != (500))
					;
				System.out.println(response);

			}

			workbook.close();
		}

		// driver.get("http://www.northstarsussex.co.uk/used-results/list");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.findElement(By.className("used-search-block-count")).getText());
		//

	}

}
