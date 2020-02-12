package com.enyaliyawen.httpclientTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * reason to replace HttpUrlConnection--it's very old
 * Designed around HTTP/1.1 timeframe, Before:Generics,Enums,Lambdas
 * 1.Have to close connection
 * 2.
 * 3.
 * Turn to third-party libraries:1)Apache HttpComponents 2)Square's OkHttp 3)JAX-RS REST Client
 */

public class httpurlconTest {
	public static void main(String args[]) {
		try {
			URL url = new URL("https://pluralsight.com");
			/*
			 * award cast,when you call openConnection on URL you get back a URL connection.
			 * However we know the URL points to an HTTP server, so we want to configure it as such.
			 * Therefore, we need to  first cast it to HttpURLConnection.
			 */		
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			/*
			 * When configuring the HTTP RequestMethod, we pass in a string,because there were 
			 * no Enums when this API was designed. However you could easily pass a malformed string here.
			 */
		    con.setRequestMethod("GET");
		    con.setRequestProperty("User-Agent", "Java 1.1");
		    if(con.getResponseCode()==200) {
		    	/*
		    	 * a little hidden in the middle is the actual handling of the response body.
		    	 * We can ask the connection for the input stream, but that's the raw input stream.
		    	 * Therefore, we need to write a helper method, in this case readInputStream to take that 
		    	 * raw input stream and turn it into something useful.That's pretty low-level code that 
		    	 * you have to write there with lots of possibilities for subtle errors.
		    	 * System.out.println(readInputStream(con.getInputStream()));}
		    	 * 
		    	 */
		    	System.out.println(con.getInputStream());}
		    	else {
		    		System.out.println("Something wrong here!");
		    	}
		    }catch(IOException e) {
			System.out.println("Something wrong there!");
		}
	}
	

}
