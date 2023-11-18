package restapitesting;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.gson.JsonObject;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class RestClient {

	// 1. GET Method:
	public void get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);
		System.out.println(url);
		CloseableHttpResponse httpresopnse = httpclient.execute(httpget); // Hit the GET URL

		// A. Status code
		int statuscode = httpresopnse.getStatusLine().getStatusCode();
		System.out.println("Status code----> " + statuscode);

		// B. JSON String
		String responsestring = EntityUtils.toString(httpresopnse.getEntity(), "UTF-8");
		JSONObject responsejson = new JSONObject(responsestring);
		System.out.println("Response JSON from API---->" + responsejson);

		// C. All Headers:
		Header[] headerArray = httpresopnse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();

		for (Header header : headerArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		System.out.println("Header Array --> " + allHeaders);

	}

}
