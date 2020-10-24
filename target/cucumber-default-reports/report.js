$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/jobtitlesValidation.feature");
formatter.feature({
  "name": "Job Title validations against DB",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Job Title validations against DB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@jtValidation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the dashboard logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.LoginStepDefinitions.verify_the_dashboard_logo_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to job titles tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.JobTitlesDBStepDefinitions.navigate_to_job_titles_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify job title table is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.JobTitlesDBStepDefinitions.verify_job_title_table_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get all job title from the table",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.JobTitlesDBStepDefinitions.get_all_job_title_from_the_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get all job title from the DB",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.DBStepDefinitions.get_all_job_title_from_the_DB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate job titles from UI against DB",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.stepDefinitions.JobTitlesDBStepDefinitions.validate_job_titles_from_UI_against_DB()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c[{job_title\u003dAccountant}, {job_title\u003dAPI Tester}, {job_title\u003dApplication Developer}, {job_title\u003dAutomation Engineer}, {job_title\u003dCEO}, {job_title\u003dChief Financial Officer}, {job_title\u003dCloud Architect}, {job_title\u003dCloud Consultant}, {job_title\u003dCloud Product and Project Manager}, {job_title\u003dController}, {job_title\u003dCTO}, {job_title\u003dData Quality Manager}, {job_title\u003dDatabase Administrator}, {job_title\u003dDeveloper}, {job_title\u003dFreelancer}, {job_title\u003dGraphic Designer}, {job_title\u003dInstructor}, {job_title\u003dIT Analyst}, {job_title\u003dIT Support Manager}, {job_title\u003dJr Production Manager}, {job_title\u003dJr Sales Manager}, {job_title\u003dNetwork Administrator}, {job_title\u003dProduction Manager}, {job_title\u003dQA Tester}, {job_title\u003dSales\u0026Marketing Manager}, {job_title\u003dSales\u0026Marketing Manager}, {job_title\u003dSr Production Manager}]\u003e but was:\u003c[{job_title\u003dAccountant}, {job_title\u003dAPI Tester}, {job_title\u003dApplication Developer}, {job_title\u003dAutomation Engineer}, {job_title\u003dCEO}, {job_title\u003dChief Financial Officer}, {job_title\u003dCloud Architect}, {job_title\u003dCloud Consultant}, {job_title\u003dCloud Product and Project Manager}, {job_title\u003dController}, {job_title\u003dCTO}, {job_title\u003dData Quality Manager}, {job_title\u003dDatabase Administrator}, {job_title\u003dDeveloper}, {job_title\u003dGraphic Designer}, {job_title\u003dInstructor}, {job_title\u003dIT Analyst}, {job_title\u003dIT Support Manager}, {job_title\u003dJr Production Manager}, {job_title\u003dJr Sales Manager}, {job_title\u003dNetwork Administrator}, {job_title\u003dProduction Manager}, {job_title\u003dQA Tester}, {job_title\u003dSr Production Manager}]\u003e\n\tat org.junit.Assert.fail(Assert.java:89)\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\n\tat org.junit.Assert.assertEquals(Assert.java:120)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat com.hrms.stepDefinitions.JobTitlesDBStepDefinitions.validate_job_titles_from_UI_against_DB(JobTitlesDBStepDefinitions.java:33)\n\tat ✽.validate job titles from UI against DB(file:///Users/alexandrrudenko/eclipse-workspace/CucumberFramework/src/test/resources/features/jobtitlesValidation.feature:10)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Job Title validations against DB");
formatter.after({
  "status": "passed"
});
});