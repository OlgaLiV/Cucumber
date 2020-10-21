package com.hrms.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStepDefinitions extends CommonMethods {

//	@When("navigate to add employee page")
//	public void navigate_to_add_employee_page() {
//		click(dash.pimLinkBtn);
//		click(pim.addEmpBtn);
//	}
//
//	@When("enter new employee with details")
//	public void enter_new_employee_with_details() {
//
//		sendText(addEmp.firstNameField, "Anna");
//		sendText(addEmp.lastNameField, "Karenina");
//		click(addEmp.createLoginDetailsCheckbox);
//		sendText(addEmp.userName, "mysteryAnnaKarenina1");
//		sendText(addEmp.userPassword, "f\"{/8+NA");
//		sendText(addEmp.confirmPassword, "f\"{/8+NA");
//		click(addEmp.saveButton);
//
//	}
//
//	@Then("verify successfull adding")
//	public void verify_successfull_adding() {
//		Assert.assertEquals("Anna Karenina", personalPage.profilePictureText.getText());
//
//	}
//
//	@When("enter new employee without details")
//	public void enter_new_employee_without_details() {
//		sendText(addEmp.firstNameField, "Anna");
//		sendText(addEmp.lastNameField, "Karenina");
//		click(addEmp.saveButton);
//	}
//
//	@When("enter first name as {string} middle name {string} and last name as {string}")
//	public void enter_first_name_as_middle_name_and_last_name_as(String firstName, String middleName, String lastName) {
//		sendText(addEmp.firstNameField, firstName);
//		sendText(addEmp.middleNameField, middleName);
//		sendText(addEmp.lastNameField, lastName);
//		click(addEmp.saveButton);
//
//	}
//
//	@When("verify that {string} is added successfully")
//	public void verify_that_is_added_successfully(String fullName) {
//		Assert.assertEquals(fullName, personalPage.profilePictureText.getText());
//	}
//
//	@When("enter employee {string}, {string} and {string}")
//	public void enter_employee_and(String firstName, String middleName, String lastName) {
//		sendText(addEmp.firstNameField, firstName);
//		sendText(addEmp.middleNameField, middleName);
//		sendText(addEmp.lastNameField, lastName);
//		click(addEmp.saveButton);
//
//	}
//
//	@When("verify that {string}, {string} and {string} is successfully added")
//	public void verify_that_and_is_successfully_added(String firstName, String middleName, String lastName) {
//		String fullName = firstName + " " + middleName + " " + lastName;
//		String fullProfileName = personalPage.profilePictureText.getText();
//		Assert.assertEquals(fullName, fullProfileName);
//
//	}
//
//	@When("add mltiple employees and verify they are added")
//	public void add_mltiple_employees_and_verify_they_are_added(DataTable employees) {
//		List<Map<String, String>> employeeNames = employees.asMaps();
//		for (Map<String, String> employeeName : employeeNames) {
//			String firstName = employeeName.get("First Name");
//			String middleName = employeeName.get("Middle Name");
//			String lastName = employeeName.get("Last Name");
//			String empId = employeeName.get("Employee ID");
//
//			sendText(addEmp.firstNameField, firstName);
//			sendText(addEmp.middleNameField, middleName);
//			sendText(addEmp.lastNameField, lastName);
//			sendText(addEmp.idField, empId);
//
//			click(addEmp.saveButton);
//
//			String actualName = personalPage.profilePictureText.getText();
//			String expectedName = firstName + " " + middleName + " " + lastName;
//			Assert.assertEquals("Verifying employee names", expectedName, actualName);
//
//			click(pim.addEmpBtn);
//
//		}
//
//	}
//
//	@When("add multiple employees from {string} verify they are addes successfully")
//	public void add_multiple_employees_from_verify_they_are_addes_successfully(String sheetName) {
//
//		List<Map<String, String>> excelData = ExcelUtility.excelToListMap(Constants.TESTDATA_FILEPATH, sheetName);
//		
//		for (Map<String, String> map : excelData) {
//			String firstName = map.get("First Name");
//			String middleName = map.get("Middle Name");
//			String lastName = map.get("Last Name");
//			String empId = map.get("Employee ID");
//
//			sendText(addEmp.firstNameField, firstName);
//			sendText(addEmp.middleNameField, middleName);
//			sendText(addEmp.lastNameField, lastName);
//			sendText(addEmp.idField, empId);
//			jsClick(addEmp.saveButton);
//
//			String actualName = personalPage.profilePictureText.getText();
//			String expectedName = firstName + " " + middleName + " " + lastName;
//			Assert.assertEquals("Verifying employee names", expectedName, actualName);
//
//			jsClick(pim.addEmpBtn);
//		}
//
//	}
//
}
