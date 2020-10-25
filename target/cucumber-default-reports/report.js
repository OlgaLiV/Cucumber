$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/APIWorkFlow.feature");
formatter.feature({
  "name": "Syntax HRMS API Workflow",
  "description": "  Description: This feature file tests Syntax HRMS APIWorkflow",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@APIWorkflow"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "a JWT is generated",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.GenerateTokenSteps.a_JWT_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating an employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@APIWorkflow"
    }
  ]
});
formatter.step({
  "name": "a request is prepared to create an employee",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.APIFinalSteps.a_request_is_prepared_to_create_an_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a POST call is made to create an employee",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.APIFinalSteps.a_POST_call_is_made_to_create_an_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code for creating employee is 201",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.APIFinalSteps.the_status_code_for_creating_employee_is(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee is created",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.APIFinalSteps.the_employee_is_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the employee ID is stored as a global variable to be used for other calls",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.API.Final.steps.APIFinalSteps.the_employee_ID_is_stored_as_a_global_variable_to_be_used_for_other_calls()"
});
formatter.result({
  "status": "passed"
});
});