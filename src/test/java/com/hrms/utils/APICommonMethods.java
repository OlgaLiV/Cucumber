package com.hrms.utils;

import static io.restassured.RestAssured.given;

import org.apache.http.entity.ContentType;

import com.hrms.API.Final.steps.GenerateTokenSteps;
import com.hrms.testbase.PageInitializer;

import io.restassured.specification.RequestSpecification;

public class APICommonMethods {

	/** Use this method to create an employee */
	/**
	 * Pass below parameters
	 * 
	 * @param token
	 * @param createEmployeeBody
	 * @return
	 */

	public static RequestSpecification createEmployeeRequest(String token, String createEmployeeBody) {
		return given().header("Authorization", token).header("Content-Type", "application/json")
				.body(createEmployeeBody);

	}

	/** This method to get an Employee */
	/**
	 * 
	 * @param token
	 * @param employeeID
	 * @return
	 */
	public static RequestSpecification getOneEmployeeRequest(String token, String employeeID) {
		return given().header("Content-Type", ContentType.APPLICATION_JSON).header("Authorization", token)
				.param("employee_id", employeeID);

	}

	/** Use this method to generate token */
	/**
	 * 
	 * @param generateTokenBody
	 * @return
	 */
	public static RequestSpecification generateTokenRequest(String generateTokenBody) {
		return given().header("Content-Type", "application/json").body(generateTokenBody);
	}

}
