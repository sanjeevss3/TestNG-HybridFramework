package com.restapitesting;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import restapitesting.RestClient;
import restapitesting.TestBase;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class GetAPITest extends TestBase {
	TestBase testBase;
	String serviceURL;
	String apiURL;
	String url;

	@BeforeMethod
	public void setUp() throws IOException {
		testBase = new TestBase();
		serviceURL = prop.getProperty("URL");
		apiURL = prop.getProperty("serviceURL");
		url = serviceURL + apiURL;
	}

	@Test
	public void getAPITest1() throws ClientProtocolException, IOException {
		RestClient rest = new RestClient();
		rest.get(url);
	}

}
