package com.hrms.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteEmployeesStepDefinition extends CommonMethods {

	@Then("enter id number {string} and click on search button")
	public void enter_id_number_and_click_on_search_button(String employeeId) {
		waitForClickability(empList.empSearchById);
		sendText(empList.empSearchById, employeeId);
		jsClick(empList.searchButton);
	}

	@Then("verify {string} in table")
	public void verify_in_table(String id) {
		String actualId = empList.idInTable.getText();
		Assert.assertEquals(id, actualId);
	}

	@Then("click on check")
	public void click_on_check() {
		jsClick(empList.checkbox);
	}

	@Then("click on delete button")
	public void click_on_delete_button() {
		jsClick(empList.deleteButton);
		waitForClickability(empList.confirmDeleteBtn);
		jsClick(empList.confirmDeleteBtn);

	}
	
	@When("delete multiple employees from {string} verify they are deleted successfully")
	public void delete_multiple_employees_from_verify_they_are_deleted_successfully(String sheetName) {
		List<Map<String, String>> excelData = ExcelUtility.excelToListMap(Constants.TESTDATA_FILEPATH, sheetName);
		
		for (Map<String, String> empMap : excelData) {
			String empId = empMap.get("Employee ID");
			
			sendText(empList.empSearchById, empId);
			jsClick(empList.searchButton);
			verify_in_table(empId);
			click_on_check();
			click_on_delete_button();
			
		}
	    
	}


}
