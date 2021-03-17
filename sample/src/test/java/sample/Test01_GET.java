package sample;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import  static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Test01_GET {


	//@Test
	void test_01() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		response.getStatusCode();
		System.out.println(response.asString());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asString());
		System.out.println(response.getTime());



	}
    @Test
	void test_02() {

		given().
        when().
              get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200).
		body("data.id[1]", equalTo(8));
	}
    
    
}

