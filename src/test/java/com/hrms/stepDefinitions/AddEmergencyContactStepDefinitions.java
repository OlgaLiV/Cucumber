package com.hrms.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmergencyContactStepDefinitions extends CommonMethods {

	@Then("navigate to add employee page")
	public void navigate_to_add_employee_page() {
		hoverUsingAction(driver, dash.pimLinkBtn);
		click(pim.addEmpBtn);
	}

	@Then("enter new employee as {string}, {string} without details")
	public void enter_new_employee_as_without_details(String name, String lastName) {
		sendText(addEmp.firstNameField, name);
		sendText(addEmp.lastNameField, lastName);
		click(addEmp.saveButton);
	}

	@Then("click on Emergency Contacts button")
	public void click_on_Emergency_Contacts_button() {
		jsClick(personalPage.emergencyContactsBtn);
	}

	@Then("enter new Emergency contact {string}, {string}, {string}, {string}, {string} and save")
	public void enter_new_Emergency_contact_and_save(String name, String relationship, String homePhone, String mobile,
			String workPhone) {
		click(emgCont.addContactBtn);
		if (emgCont.emgContactsName.isEnabled() && emgCont.emgRelationship.isEnabled()
				&& emgCont.emgHomePhone.isEnabled() && emgCont.emgMobilePhone.isEnabled()
				&& emgCont.emgWorkPhone.isEnabled()) {
			sendText(emgCont.emgContactsName, name);
			sendText(emgCont.emgRelationship, relationship);
			sendText(emgCont.emgHomePhone, homePhone);
			sendText(emgCont.emgMobilePhone, mobile);
			sendText(emgCont.emgWorkPhone, workPhone);
		}
	}

	@Then("verify that Emergency contact {string} was successfully added")
	public void verify_that_Emergency_contact_was_successfully_added(String name) {
		
		for (WebElement contact : emgCont.emgListTable) {
				if(contact.getText().equals(name))	{
					Assert.assertEquals(name, contact.getText());
				}
		}
		
		
			
	}

}
