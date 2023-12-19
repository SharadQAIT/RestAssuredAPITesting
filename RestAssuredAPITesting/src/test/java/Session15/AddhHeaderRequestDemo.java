package Session15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Rest Assured API Testing Session# 28 - How To Add Header In Request
//https://youtu.be/v3AG1IuTRkM?si=PwdNT-9D-7G-e2F1


public class AddhHeaderRequestDemo
{

	
	@Test (priority=1)
	public void test1()
	{
		// 1) RequestSpecification headers(String firstHeaderName, Object firstHeaderValue,object...........headerNameValuepairs);

		
		RequestSpecification reqspec= RestAssured.given();
		// add header
		reqspec.header("Header1","Value1");
		reqspec.log().headers();
		//Specify URL
		reqspec.baseUri("https://reqres.in/api/users?page=2");
		
		//Perform get request
		
		reqspec.get();
		
		//https://reqres.in/api/users?page=2
	}
	
	@Test (priority=2)
	public void test2()
	{
		//2) RequestSpecification headers <Map<String,?>headers);

		
		Map<String,String> requestHeader = new HashMap<String, String>();
		requestHeader.put("Header1", "Value1");
		requestHeader.put("Header2", "Value2");

		
		RequestSpecification reqspec= RestAssured.given();
		// add header
		reqspec.headers(requestHeader);
		reqspec.log().headers();
		//Specify URL
		reqspec.baseUri("https://reqres.in/api/users?page=2");
			
		//Perform get request
			
		reqspec.get();
			
		//https://reqres.in/api/users?page=2
	}
	
	@Test (priority=3)
	public void test3()
	{
		// 5) RequestSpecificatio header (Header header);

		
		Map<String,String> requestHeader = new HashMap<String, String>();
		requestHeader.put("Header1", "Value1");
		requestHeader.put("Header2", "Value2");

		Header requestHeaderObj= new Header("Header1", "Value1");;
		RequestSpecification reqspec= RestAssured.given();
		
		// add header
		reqspec.header(requestHeaderObj);
		reqspec.log().headers();
		
		//Specify URL
		reqspec.baseUri("https://reqres.in/api/users?page=2");
			
		//Perform get request
			
		Response response=reqspec.get();
		
		//validate response code
		
		Assert.assertEquals(response.statusCode(), 200);
		
			
		//https://reqres.in/api/users?page=2
		

	}

	@Test (priority=4)
	public void test4()
	{
		// 3) RequestSpecification headers(Headers headers);


		
		Map<String,String> requestHeader = new HashMap<String, String>();
		requestHeader.put("Header1", "Value1");
		requestHeader.put("Header2", "Value2");

		Header header1= new Header("Header1", "Value1");;
		Header header2= new Header("Header2", "Value2");;
		Header header3= new Header("Header3", "Value3");;

		List<Header> headerlist = new ArrayList<Header>();
		headerlist.add(header1);
		headerlist.add(header2);
		headerlist.add(header3);

		Headers headersObj = new Headers(headerlist);
		
	/*	RequestSpecification reqspec= RestAssured.given();
		
		// add headers
		reqspec.headers(headersObj);
		reqspec.log().headers();
		
		//Specify URL
		reqspec.baseUri("https://reqres.in/api/users?page=2");
			
		//Perform get request
			
		Response response=reqspec.get();
		
		//validate response code
		
		Assert.assertEquals(response.statusCode(), 200);
		
	*/		
		//https://reqres.in/api/users?page=2 
		
	}
	
	@Test(priority = 5)
	public void test5() 	
	{
		
		Map<String,String> requestHeader = new HashMap<String, String>();
		requestHeader.put("Header1", "Value1");
		requestHeader.put("Header2", "Value2");

		Header header1= new Header("Header1", "Value1");;
		Header header2= new Header("Header2", "Value2");;
		Header header3= new Header("Header3", "Value3");;

		List<Header> headerlist = new ArrayList<Header>();
		headerlist.add(header1);
		headerlist.add(header2);
		headerlist.add(header3);

		Headers headersObj = new Headers(headerlist);
		
		
		
		// BDD Style (Given,When,then)
		
		RestAssured
		.given()
			.headers(headersObj)
			.log().headers()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.log().body();

	}
}
	

	
	

