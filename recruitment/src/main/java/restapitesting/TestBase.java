package restapitesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class TestBase {

	public Properties prop;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\restapitesting\\config.properties");
			prop.load(fis);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
