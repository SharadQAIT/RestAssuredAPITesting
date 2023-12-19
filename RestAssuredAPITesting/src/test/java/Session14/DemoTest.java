package Session14;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoTest {

	@Test(priority = 1)
	public void test1() {
		// https://run.mocky.io/v3/f8a1b650-17a0-4e40-883b-36bb818c9165

		// Create request specification
		RequestSpecification Reqspec = RestAssured.given();

		// specify URL
		Reqspec.baseUri("https://run.mocky.io/v3/f8a1b650-17a0-4e40-883b-36bb818c9165");

		// perform get request
		Response response = Reqspec.get();

		// print response body
		response.prettyPrint();

		// validate status code to be 200
		Assert.assertEquals(response.statusCode(), 200, "Check for status code");

	}

/*	@Test(priority = 2)
	public void test2() {
	
		//https://youtu.be/wB8__bMZjdI?si=sXxpAjVbM_s0xVbz - Program done - But getting error 

		
		// https://run.mocky.io/v3/f8a1b650-17a0-4e40-883b-36bb818c9165

		// Create request specification
		RequestSpecification Reqspec = RestAssured.given();

		// specify URL
		Reqspec.baseUri("https://run.mocky.io/v3/f8a1b650-17a0-4e40-883b-36bb818c9165");

		// perform get request
		EmpPojoClass emp = Reqspec.get().as(EmpPojoClass.class);

		System.out.println("------print after covert JSON object to class object");
		System.out.println("FirstName:" + emp.getFirstname());
		System.out.println("LastName:" + emp.getLastname());
		System.out.println("Age:" + emp.getAge());
		System.out.println("Salary:" + emp.getSalary());
		System.out.println("Degrees:" + emp.getDegress());
		System.out.println("Family Members:" + emp.getFamilymembers());
		System.out.println("Hobbies Members:" + emp.getHobbies());
		System.out.println("Hobbies Members:" + emp.isMarried());
		
		System.out.println("Hobbies:");
		
		String [] hobbiesStr = emp.getHobbies();
		
		for(int i=0; i<hobbiesStr.length;i++)
		{
			System.out.println(hobbiesStr[i]);
		}
		

		// using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : emp.getFamilymembers().entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
	} */
}
