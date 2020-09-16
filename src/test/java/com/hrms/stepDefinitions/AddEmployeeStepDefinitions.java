package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStepDefinitions extends CommonMethods {

	@When("navigate to add employee page")
	public void navigate_to_add_employee_page() {
		click(dash.pimLinkBtn);
		click(pim.addEmpBtn);
	}

	@When("enter new employee with details")
	public void enter_new_employee_with_details() {

		sendText(addEmp.firstNameField, "Anna");
		sendText(addEmp.lastNameField, "Karenina");
		click(addEmp.createLoginDetailsCheckbox);
		sendText(addEmp.userName, "mysteryAnnaKarenina1");
		sendText(addEmp.userPassword, "f\"{/8+NA");
		sendText(addEmp.confirmPassword, "f\"{/8+NA");
		click(addEmp.saveButton);

	}

	@Then("verify successfull adding")
	public void verify_successfull_adding() {
		Assert.assertEquals("Anna Karenina", personalPage.profilePictureText.getText());

	}

	@When("enter new employee without details")
	public void enter_new_employee_without_details() {
		sendText(addEmp.firstNameField, "Anna");
		sendText(addEmp.lastNameField, "Karenina");
		click(addEmp.saveButton);
	}

	@When("enter first name as {string} middle name {string} and last name as {string}")
	public void enter_first_name_as_middle_name_and_last_name_as(String firstName, String middleName, String lastName) {
		sendText(addEmp.firstNameField, firstName);
		sendText(addEmp.middleNameField, middleName);
		sendText(addEmp.lastNameField, lastName);
		click(addEmp.saveButton);

	}

	@When("verify that {string} is added successfully")
	public void verify_that_is_added_successfully(String fullName) {
		Assert.assertEquals(fullName, personalPage.profilePictureText.getText());
	}

	@When("enter employee {string}, {string} and {string}")
	public void enter_employee_and(String firstName, String middleName, String lastName) {
		sendText(addEmp.firstNameField, firstName);
		sendText(addEmp.middleNameField, middleName);
		sendText(addEmp.lastNameField, lastName);
		click(addEmp.saveButton);

	}

	@When("verify that {string}, {string} and {string} is successfully added")
	public void verify_that_and_is_successfully_added(String firstName, String middleName, String lastName) {
		String fullName = firstName + " " + middleName + " " + lastName;
		String fullProfileName = personalPage.profilePictureText.getText();
		Assert.assertEquals(fullName, fullProfileName);

	}

}
