package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.DBUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobTitlesDBStepDefinitions extends CommonMethods{
	@When("navigate to job titles tab")
	public void navigate_to_job_titles_tab() {
	   hoverUsingAction(driver, dash.adminLinkBtn);
	   hoverUsingAction(driver, dash.jobLinkBtn);
	   click(dash.jobTitleBtn);
	}

	@When("verify job title table is displayed")
	public void verify_job_title_table_is_displayed() {
	    Assert.assertTrue(jobTitlesPage.isJobTitlesTableDisplayed());
	}

	@When("get all job title from the table")
	public void get_all_job_title_from_the_table() {
	    System.out.println(jobTitlesPage.getJobTitlesFromTable());
	    
	}


	@Then("validate job titles from UI against DB")
	public void validate_job_titles_from_UI_against_DB() {
	    Assert.assertEquals(DBStepDefinitions.dbData, jobTitlesPage.getJobTitlesFromTable());
	}




}
