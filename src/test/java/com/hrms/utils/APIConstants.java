package com.hrms.utils;

import io.restassured.RestAssured;

public class APIConstants {
	public static final String BASE_URI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	public static final String GENERATE_TOKEN_URI = BASE_URI + "/generateToken.php";
	public static final String CREATE_EMPLOYEE_URI = BASE_URI + "/createEmployee.php";
	public static final String GET_ONE_EMPLOYEE_URI = BASE_URI + "/getOneEmployee.php";
	public static final String UPDATE_EMPLOYEE_URI = BASE_URI + "/updateEmployee.php";
	public static final String GET_ALL_EMPLOYEES_URI = BASE_URI + "/getAllEmployees.php";

	public static final String CREATE_EMPLOYEE_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/createEmployee.json";
	
	public static final String GENERATE_TOKEN_JSON = System.getProperty("user.dir")
			+ "/src/test/resources/JSONFiles/generateToken.json";
	
	
	
	
}
