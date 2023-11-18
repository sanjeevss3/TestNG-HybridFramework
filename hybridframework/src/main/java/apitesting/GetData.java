package apitesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class GetData {

	@Test(priority=0)
	public void testResponseCode() {
		Response resp = RestAssured.get(
				"http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=7814e9516997d0c169b9f701bb57966d﻿");
		int code = resp.getStatusCode();
		System.out.println("Status code is: " + code);
		Assert.assertEquals(code, 200);

	}

	@Test(priority=1)
	public void testBody() {
		Response resp = RestAssured.get(
				"http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=7814e9516997d0c169b9f701bb57966d﻿");
		String data = resp.asString();
		System.out.println("Data is: " + data);
		System.out.println("Response Time" + resp.getTime());

	}

}
