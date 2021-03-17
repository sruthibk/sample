package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import  static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_POST {
	
	
	//@Test
	public void test_01() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "sruthi");
		map.put("job", "QA");
		
		JSONObject request = new JSONObject();
		request.put("name", "Sruthi");
		request.put("job", "QA");
		System.out.println(request.toJSONString());
		
		Response res= given().
		     contentType(ContentType.JSON).accept(ContentType.JSON).
		     body(request.toJSONString()).
		when().
             post("https://reqres.in/api/users").
        then().
             statusCode(201).log().body().extract().response();		

		String jsonString = res.asString();
		Assert.assertEquals(jsonString.contains(""), true);
		
	}
	
	//@Test
public void test_02_put() {
		
		
		
		JSONObject request = new JSONObject();
		request.put("name", "Sruthi");
		request.put("job", "QAA");
		System.out.println(request.toJSONString());
		
		given().
		     contentType(ContentType.JSON).accept(ContentType.JSON).
		     body(request.toJSONString()).
		when().
             put("https://reqres.in/api/users/896").
        then().
             statusCode(200).log().all();	

		
		
	}

	
	
	
	//@Test
	public void test_03_patch() {
			
			
			
			JSONObject request = new JSONObject();
			request.put("name", "Sruthibk");
			System.out.println(request.toJSONString());
			
			given().
			     contentType(ContentType.JSON).accept(ContentType.JSON).
			     body(request.toJSONString()).
			when().
	             patch("https://reqres.in/api/users/896").
	        then().
	             statusCode(200).log().all();
			

			
			
		}

	//@Test
	public void test_04_delete() {
			
			
			
			
			
			given().
			     contentType(ContentType.JSON).accept(ContentType.JSON).
			    
			when().
	             delete("https://reqres.in/api/users/2").
	        then().
	             statusCode(204).log().all();	

			
			
		}


}
