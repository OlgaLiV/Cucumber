package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardcodedExsamples {

	/*
	 * REST Assured - Java library specifically developed to automate REST endpoints
	 * 
	 * Given - Preparing you request When - action you want to perform what type of
	 * call you are making Then - Verification
	 * 
	 */

	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM2MzU3MjUsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzY3ODkyNSwidXNlcklkIjoiMTI4NiJ9.j2B6IPjVjtFqoTMVqKA63N-6PrSNX7-nkxRjlIz7E7w";
	static String employeeID;

	@Test
	public void sampleTest() {

		/**
		 * BaseURI for all endpoints
		 */
		// RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

		/* JWT **/

		/** Preparing request for /getOneEmployee.php */
		/** Using log().all() to print everithing behind the sciene with request */
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.contentType("application/json").queryParam("employee_id", "28278A").log().all();

		/** Making call to /getOneEmployee.php */
		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");

		/** To print */
		// getOneEmployeeResponse.prettyPrint();

		/** Using assertThat() to verify status code */
		getOneEmployeeResponse.then().assertThat().statusCode(200);

	}

	@Test
	public void aPOSTcreateEmployee() {

		/** Preparing request for creating an Employee */
		RequestSpecification createEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json")
				.body("{\n" + "  \"emp_firstname\": \"Baby\",\n" + "  \"emp_lastname\": \"Shark\",\n"
						+ "  \"emp_middle_name\": \"DoDoDo\",\n" + "  \"emp_gender\": \"M\",\n"
						+ "  \"emp_birthday\": \"2020-01-11\",\n" + "  \"emp_status\": \"Internee\",\n"
						+ "  \"emp_job_title\": \"Cloud Consultant\"\n" + "}\n" + "");
		// .log().all();

		/** making call to /createEmployee.php */
		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");

		/** printing response */
		createEmployeeResponse.prettyPrint();

		/**
		 * using jsonPath to view the response body which lets us get employee id we are
		 * storing the employee ID as static variable to be
		 */
		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
		System.out.println(employeeID);

		/** verify that status code is 201 */
		createEmployeeResponse.then().assertThat().statusCode(201);

		/** verify that response body Message is paired with "Entry created" */
		createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));

		createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("Baby"));

		createEmployeeResponse.then().assertThat().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");

	}

	 //@Test
	public void bGETCreatedEmployee() {

		/** Preparing request for /getOneEmployee.php */
		/** Using log().all() to print everithing behind the sciene with request */
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.contentType("application/json").queryParam("employee_id", employeeID);
		/** Making call to /getOneEmployee.php */
		Response getCreatedEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");
		/** To print */
		getCreatedEmployeeResponse.prettyPrint();

		/**
		 * Storing response employee into empID to compare with static global employee
		 * ID
		 */
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		employeeID = getCreatedEmployeeResponse.jsonPath().getString("Employee[0].employee_id");

		/** comparing empID with stored employeeID from created employee call */
		boolean verifyEmpID = empID.equalsIgnoreCase(employeeID);

		/** Asserting to verify the above condition is true */
		// Assert.assertTrue(verifyEmpID);

		/** Verifying status code is 200 */
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);

		String response = getCreatedEmployeeResponse.asString();
		JsonPath js = new JsonPath(response);
		String employeeId = js.getString("employee[0].employee_id");
		/**
		 * String empID =
		 * getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		 * same
		 */

		String employeeFirstName = js.getString("employee[0].emp_firstname");
		String employeeLastName = js.getString("employee[0].emp_lastname");
		String employeeMiddleName = js.getString("employee[0].emp_middle_name");
		String employeeBirthday = js.getString("employee[0].emp_birthday");
		String employeeGender = js.getString("employee[0].emp_gender");
		String employeeJobTitle = js.getString("employee[0].emp_job_title");
		String employeeStatus = js.getString("employee[0].emp_status");

		Assert.assertTrue(employeeId.equalsIgnoreCase(employeeID));
		Assert.assertTrue(employeeFirstName.equalsIgnoreCase("Baby"));
		Assert.assertTrue(employeeLastName.equalsIgnoreCase("Shark"));
		Assert.assertTrue(employeeMiddleName.equalsIgnoreCase("DoDoDo"));
		Assert.assertTrue(employeeBirthday.equalsIgnoreCase("2020-01-11"));
		Assert.assertTrue(employeeGender.equalsIgnoreCase("Male"));
		Assert.assertTrue(employeeJobTitle.equalsIgnoreCase("Cloud Consultant"));
		Assert.assertTrue(employeeStatus.equalsIgnoreCase("Internee"));

	}

	//@Test
	public void cGETAllEmployee() {
		RequestSpecification getAllEmployeesRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token);
		/***/
		Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");
		getAllEmployeesResponse.prettyPrint();
		/***
		 * storing response as a String
		 */
		String response = getAllEmployeesResponse.asString();

		JsonPath js = new JsonPath(response);

		int count = js.getInt("Employees.size()");
		// System.out.println(count);
		/** for loop to print all ids */
//		for (int i = 0; i < count; i++) {
//			String allEmployeeIDs = js.getString("Employees[" + i + "].employee_id");
//			//System.out.println(allEmployeeIDs);
//			if(allEmployeeIDs.contentEquals(employeeID)){
//				System.out.println("Employee ID: " + employeeID + " is present in the body");
//				String firstnameOfEmpId = js.getString("Employees[" + i + "].emp_firstname");
//				System.out.println(firstnameOfEmpId);
//				break;
//			}
//		}
		/** for loop to print out first names of all employees */
//		for(int i = 0; i < count; i++) {
//			String allEmployeesNames = js.getString("Employees" + "[" + i + "]" + ".emp_firstname");
//			System.out.println(allEmployeesNames);
//		}

	}

	@Test
	public void dPUTUpdatedEmployee() {
		RequestSpecification updateEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token)
				.body("{\n" + "  \"employee_id\": \"" + employeeID + "\",\n" + "  \"emp_firstname\": \"Robocar\",\n"
						+ "  \"emp_lastname\": \"Poli\",\n" + "  \"emp_middle_name\": \"el\",\n"
						+ "  \"emp_gender\": \"M\",\n" + "  \"emp_birthday\": \"2017-09-17\",\n"
						+ "  \"emp_status\": \"Independent contractor\",\n" + "  \"emp_job_title\": \"API Tester\"\n"
						+ "}\n" + "");

		Response updateEmployeeResponse = updateEmployeeRequest.when().put("/updateEmployee.php");
		updateEmployeeResponse.prettyPrint();
		
		String response = updateEmployeeResponse.asString();
		
		JsonPath js = new JsonPath(response);
		String employeeId = js.getString("employee[0].employee_id");
		String employeeFirstName = js.getString("employee[0].emp_firstname");
		String employeeLastName = js.getString("employee[0].emp_lastname");
		String employeeMiddleName = js.getString("employee[0].emp_middle_name");
		String employeeBirthday = js.getString("employee[0].emp_birthday");
		String employeeGender = js.getString("employee[0].emp_gender");
		String employeeJobTitle = js.getString("employee[0].emp_job_title");
		String employeeStatus = js.getString("employee[0].emp_status");
		
		
		Assert.assertTrue(employeeId.equalsIgnoreCase(employeeID));
		Assert.assertTrue(employeeFirstName.equalsIgnoreCase("Robocar"));
		Assert.assertTrue(employeeLastName.equalsIgnoreCase("Poli"));
		Assert.assertTrue(employeeMiddleName.equalsIgnoreCase("el"));
		Assert.assertTrue(employeeBirthday.equalsIgnoreCase("2017-09-17"));
		Assert.assertTrue(employeeGender.equalsIgnoreCase("Male"));
		Assert.assertTrue(employeeJobTitle.equalsIgnoreCase("API Tester"));
		Assert.assertTrue(employeeStatus.equalsIgnoreCase("Independent contractor"));
		
		
		
		
		

	}

}
