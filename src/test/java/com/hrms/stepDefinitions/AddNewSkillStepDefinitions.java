package com.hrms.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;


public class AddNewSkillStepDefinitions extends CommonMethods{

	@Then("navigate to skills page")
	public void navigate_to_skills_page() {
		
		hoverUsingAction(driver, dash.adminLinkBtn);
		hoverUsingAction(driver, dash.qualifications);
		jsClick(dash.skillsBtn);
	    
	}

	@Then("enter new skill {string} to system")
	public void enter_new_skill_to_system(String qName) {
	    click(skillsPage.addSkillsBtn);
	    sendText(skillsPage.skillName, qName);
	    click(skillsPage.skillSaveBtn);
	}

	@Then("verify that {string} was successfull adding")
	public void verify_that_was_successfull_adding(String qName) {
		
		for(WebElement elements:dash.recordListTable) {
			if(elements.equals(qName)) {
				Assert.assertEquals(qName, elements.getText());
			}
		}
	    
	}



}
