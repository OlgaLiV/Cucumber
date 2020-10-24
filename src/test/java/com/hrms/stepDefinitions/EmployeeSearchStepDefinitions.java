package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmployeeSearchStepDefinitions extends CommonMethods{
	@When("navigate to employee list")
	public void navigate_to_employee_list() {
		click(dash.pimLinkBtn);
		click(dash.empListBtn);
	    
	}

	@When("enter a valid employee id {string}")
	public void enter_a_valid_employee_id(String employeeId) {
		sendText(empList.empSearchById, employeeId);
		GlobalVariables.emplId = employeeId;
	    
	}
	
	@Then("click on searchh button")
	public void click_on_searchh_button() {
	    click(empList.searchButton);
	}


	@Then("verify the table is displayed")
	public void verify_the_table_is_displayed() {
	    Assert.assertTrue(empList.isTableDisplayed());
	}

	@When("get first name fron the table")
	public void get_first_name_fron_the_table() {
	    System.out.println(empList.getFirstNameFromTable());
	}


	@Then("validate first names from UI against DB")
	public void validate_first_names_from_UI_against_DB() {
	    Assert.assertEquals(DBStepDefinitions.dbData, empList.getFirstNameFromTable());
	}




}
