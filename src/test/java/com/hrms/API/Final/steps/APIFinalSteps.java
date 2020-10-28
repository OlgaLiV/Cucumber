package com.hrms.API.Final.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APIFinalSteps {
	RequestSpecification request;
	Response response;
	String BaseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	static String employeeID;

	@Given("a request is prepared to create an employee")
	public void a_request_is_prepared_to_create_an_employee() {
		request = given().header("Authorization", GenerateTokenSteps.token).header("Content-Type", "application/json")
				.body("{\n" + "  \"emp_firstname\": \"Baby\",\n" + "  \"emp_lastname\": \"Shark\",\n"
						+ "  \"emp_middle_name\": \"DoDoDo\",\n" + "  \"emp_gender\": \"M\",\n"
						+ "  \"emp_birthday\": \"2020-01-11\",\n" + "  \"emp_status\": \"Internee\",\n"
						+ "  \"emp_job_title\": \"Cloud Consultant\"\n" + "}")
				.log().all();

	}

	@When("a POST call is made to create an employee")
	public void a_POST_call_is_made_to_create_an_employee() {
		Response response = request.when().post("/createEmployee.php");
	}

	@Then("the status code for creating employee is {int}")
	public void the_status_code_for_creating_employee_is(int statusCode) {
		response.then().assertThat().statusCode(statusCode);

	}

	@Then("the employee is created")
	public void the_employee_is_created() {

		response.then().assertThat().body("Message", equalTo("Entry Created"));
	}

	@Then("the employee ID is stored as a global variable to be used for other calls")
	public void the_employee_ID_is_stored_as_a_global_variable_to_be_used_for_other_calls() {

		employeeID = response.jsonPath().getString("Employee[0].employee_id");

	}
	
	@Given("a request is prepared to retrieve the created employee")
	public void a_request_is_prepared_to_retrieve_the_created_employee() {
	    
	}

	@When("a GET call is made to retrieve the created employee")
	public void a_GET_call_is_made_to_retrieve_the_created_employee() {
	    
	}

	@Then("the status code for retrieven the created employee is {int}")
	public void the_status_code_for_retrieven_the_created_employee_is(Integer int1) {
	    
	}

	@Then("the retrieved employee ID matches the globally stored employee ID")
	public void the_retrieved_employee_ID_matches_the_globally_stored_employee_ID() {
	    
	}

	@Then("the retrieved data matches the data used to create an employee")
	public void the_retrieved_data_matches_the_data_used_to_create_an_employee() {
	    
	}

	@Given("a request is prepared to retrieve all employees")
	public void a_request_is_prepared_to_retrieve_all_employees() {
	    
	}

	@When("a GET call is made to retrieve all employees")
	public void a_GET_call_is_made_to_retrieve_all_employees() {
	    
	}

	@Then("the status code for retrieving all employees is {int}")
	public void the_status_code_for_retrieving_all_employees_is(Integer int1) {
	    
	}

	@Then("the retrieved data contains the globally stored employee ID")
	public void the_retrieved_data_contains_the_globally_stored_employee_ID() {
	    
	}

	@Then("the retrieved data matches the data that was used to create an employee")
	public void the_retrieved_data_matches_the_data_that_was_used_to_create_an_employee() {
	    

	}




}
