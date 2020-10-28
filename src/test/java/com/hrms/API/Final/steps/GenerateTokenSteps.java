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
		/**Preparing request for generate token*/
		RequestSpecification generateTokenRequest = given().header("Content-Type", "application/json").body("{\n" + 
				"  \"email\": \"olga@gmail.com\",\n" + 
				"  \"password\": \"Olga!123456\"\n" + 
				"}");
		/**Storing response into generateTokenResponse*/
		Response generateTokenResponse = generateTokenRequest.when().post("/generateToken.php");
		/**Optional print response*/
		generateTokenResponse.prettyPrint();
		/**Storing token as a static global variable that will be used for other calls*/
		token = "Bearer " + generateTokenResponse.jsonPath().getString("token");

	}
}
