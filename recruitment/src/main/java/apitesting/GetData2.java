package apitesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class GetData2 {

	@Test(priority = 0)
	public void testResponseCode() {

		int code = get(
				"http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=7814e9516997d0c169b9f701bb57966d﻿")
						.getStatusCode();
		System.out.println("Status code is: " + code);
		Assert.assertEquals(code, 200);

	}

	@Test(priority = 1)
	public void testBody() {

		String data = get(
				"http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=7814e9516997d0c169b9f701bb57966d﻿")
						.asString();
		System.out.println(data);
		long time = get(
				"http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=7814e9516997d0c169b9f701bb57966d﻿")
						.getTime();
		System.out.println("Response Time" + time);

	}

}
