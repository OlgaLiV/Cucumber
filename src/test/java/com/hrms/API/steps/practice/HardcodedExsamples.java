package com.hrms.API.steps.practice;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class HardcodedExsamples {

	/*
	 * REST Assured - Java library specifically developed to automate REST endpoints
	 * 
	 * Given - Preparing you request When - action you want to perform Then -
	 * Verification
	 * 
	 */

	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM1NTgxODksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzYwMTM4OSwidXNlcklkIjoiMTI4NiJ9.yK0TuZ4G83isNAJFKhgfOsH0i1OKsCEoeYJUXCdKn0w";
	static String epmloyeeID;
	// @Test
	public void sampleTest() {

		/**
		 * BaseURI for all endpoints
		 */
		// RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

		/* JWT **/

		/** Preparing request for /getOneEmployee.php */
		/** Using log().all() to print everithing behind the sciene with request */
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.contentType("application/json").queryParam("employee_id", "3828").log().all();

		/** Making call to /getOneEmployee.php */
		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");

		/** To print */
		getOneEmployeeResponse.prettyPrint();

		/** Using assertThat() to verify status code */
		getOneEmployeeResponse.then().assertThat().statusCode(200);

	}

	//@Test
	public void aPOSTcreateEmployee() {

		/** Preparing request for creating an Employee */
		RequestSpecification createEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\n" + "  \"emp_firstname\": \"Baby\",\n" + "  \"emp_lastname\": \"Shark\",\n"
						+ "  \"emp_middle_name\": \"DoDoDo\",\n" + "  \"emp_gender\": \"M\",\n"
						+ "  \"emp_birthday\": \"2020-01-11\",\n" + "  \"emp_status\": \"Internee\",\n"
						+ "  \"emp_job_title\": \"Cloud Consultant\"\n" + "}\n" + "");
		
		/** making call to /createEmployee.php*/
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");
		
		/**printing response*/
		createEmployeeResponse.prettyPrint();
		
		/**using jsonPath to view the response body which lets us get employee id
		 * we are storing the employee ID as static variable to be */
		epmloyeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
		System.out.println(epmloyeeID);
		
		/**verify that status code is 201*/
		createEmployeeResponse.then().assertThat().statusCode(201);
		
		/**verify that response body Message is paired with "Entry created"*/
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
		
		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("Baby"));
		
		createEmployeeResponse.then().assertThat().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");
		
		
		
		
		
	}
	
	@Test
	public void bGETCreatedEmployee() {
		
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.contentType("application/json").queryParam("employee_id", "27595A").log().all();
		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");
		getOneEmployeeResponse.prettyPrint();
		
	}

}
