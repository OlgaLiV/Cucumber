package com.hrms.API.Final.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class GenerateTokenSteps {
	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	static String token;
	
	@Given("a JWT is generated")
	public void a_JWT_is_generated() {
		
		RequestSpecification generateTokenRequest = given().header("Content-Type", "application/json").body("{\n" + 
				"  \"email\": \"olga@gmail.com\",\n" + 
				"  \"password\": \"Olga!123456\"\n" + 
				"}");
		
		Response generateTokenResponse = generateTokenRequest.when().post("/generateToken.php");
		generateTokenResponse.prettyPrint();
		
		token = "Bearer " + generateTokenResponse.jsonPath().getString("token");

	}
}
