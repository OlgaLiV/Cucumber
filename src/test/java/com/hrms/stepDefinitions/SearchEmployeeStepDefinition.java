package com.hrms.stepDefinitions;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class SearchEmployeeStepDefinition extends CommonMethods{
	@Then("navigate to employee list page")
	public void navigate_to_employee_list_page() {
	    click(dash.pimLinkBtn);
	    click(dash.empListBtn);
	}

	@Then("enter name {string}")
	public void enter_name(String empName) {
		waitForVisability(empList.empSearchByName);
	    sendText(empList.empSearchByName, empName);
	}

	@Then("click on search button")
	public void click_on_search_button() {
	    click(empList.searchButton);
	}
	
	@Then("enter {string}")
	public void enter(String empId) {
	    waitForVisability(empList.empSearchById);
	    sendText(empList.empSearchById, empId);
	}






}
