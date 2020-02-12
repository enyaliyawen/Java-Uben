package com.enyaliyawen.httpclientTest;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class qucikexample {
	HttpClient client = HttpClient.newHttpClient();
	
	HttpRequest request =
			HttpRequest.newBuilder(URI.create("https://pluralsight.com"))
			.build();
//	
//		HttpResponse<String> response =
//				client.send(request,HttpResponse.BodyHandlers.ofString());
//				

}
