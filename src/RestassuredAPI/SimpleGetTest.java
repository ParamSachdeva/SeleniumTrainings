package RestassuredAPI;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTest {


	public static void main(String[] args) 
	{   
		// Specify the base URL to the RESTful web service

//		RestAssured
//		.when()
//		.get("url")
//		.then()
//		.statusCode(200)
//		.assertThat()

		
		//.body("WindSpeed", hasItems("1.30", "5.25"));
		//.body(hasXPath("/employees/employee/first-name"));//, containsString("Ja")));
		
		//.body("Humidity", equals("55 Percent"));
		
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Delhi");		
		String responseBody = response.getBody().asString();
		
		if(responseBody.contains("2.1 Km per hour"))
		{
		System.out.println("Response Body is =>  " + responseBody);
		}


	}

}