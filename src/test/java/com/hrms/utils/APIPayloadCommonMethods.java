package com.hrms.utils;

import org.json.JSONObject;

public class APIPayloadCommonMethods {

	public static String createEmployeeBody() {
		// First way
		String createEmployeeBody = "{\n" + "  \"emp_firstname\": \"Baby\",\n" + "  \"emp_lastname\": \"Shark\",\n"
				+ "  \"emp_middle_name\": \"DoDoDo\",\n" + "  \"emp_gender\": \"M\",\n"
				+ "  \"emp_birthday\": \"2020-01-11\",\n" + "  \"emp_status\": \"Internee\",\n"
				+ "  \"emp_job_title\": \"Cloud Consultant\"\n" + "}";
		return createEmployeeBody;
	}

	// second way
	public static String createEmployeePayload() {

		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", "Baby");
		obj.put("emp_lastname", "Shark");
		obj.put("emp_middle_name", "DoDoDo");
		obj.put("emp_gender", "M");
		obj.put("emp_birthday", "2020-01-11");
		obj.put("emp_status", "Internee");
		obj.put("emp_job_title", "Cloud Consultant");

		return obj.toString();
	}

	// more dynamic way
	public static String createEmployeePayloadSecondWay(String firstName, String lastName, String middleName,
			String gender, String dob, String employeeStatus, String employeeJobTitle) {

		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", firstName);
		obj.put("emp_lastname", lastName);
		obj.put("emp_middle_name", middleName);
		obj.put("emp_gender", gender);
		obj.put("emp_birthday", dob);
		obj.put("emp_status", employeeStatus);
		obj.put("emp_job_title", employeeJobTitle);

		return obj.toString();
	}

}
