package sample;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import  static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenExamples extends dataForTests {
	
	//@Parameters({"firstname"}{"lastname"}{"subjectid"})
	//@Test
	//@Test(dataProvider = "DataForPost",priority = 1)
	public void test_01(String firstname,String lastname,int subjectId) {
		baseURI = "http://localhost:3000/";
		
		JSONObject request = new JSONObject();
		request.put("first_name", firstname);
		request.put("last_name", lastname);
		request.put("subjectId", subjectId);
		
		given().
		     contentType(ContentType.JSON).accept(ContentType.JSON).
		     body(request.toJSONString()).
        when().
             post("/users").
        then().
             statusCode(201).log().all();    
	}
	
	@Parameters({"userId"})
	@Test
	//@Test(priority = 2,dataProvider = "DataForDelete")
	public void test_02_delete(int userId) {
		
		baseURI = "http://localhost:3000/";
		
		given().
		     contentType(ContentType.JSON).accept(ContentType.JSON).
		    
		when().
             delete("/users/"+userId).
        then().
             statusCode(200).log().all();	

		
		
	}
	
	
	

}
