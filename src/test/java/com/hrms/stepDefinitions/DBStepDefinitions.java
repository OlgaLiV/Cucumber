package com.hrms.stepDefinitions;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.DBUtils;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Then;

public class DBStepDefinitions extends CommonMethods {
	public static List<Map<String, String>> dbData;
	
	@Then("get first name from the DB")
	public void get_first_name_from_the_DB() {
		String sqlQuery = "select emp_firstname from hs_hr_employees where employee_id = " + GlobalVariables.emplId;
		dbData = DBUtils.storeDataFromDb(sqlQuery);
		DBUtils.closeConnection();
		
	}
	
	@Then("get all job title from the DB")
	public void get_all_job_title_from_the_DB() {
	    String sqlQuery = "select job_title from ohrm_job_title order by job_title;";
	    dbData = DBUtils.storeDataFromDb(sqlQuery);
	    DBUtils.closeConnection();
	}

}
