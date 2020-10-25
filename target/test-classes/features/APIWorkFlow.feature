#Author: Olga
@APIWorkflow
Feature: Syntax HRMS API Workflow
  Description: This feature file tests Syntax HRMS APIWorkflow

  Background: 
    Given a JWT is generated
    
    Scenario: Creating an employee
    Given a request is prepared to create an employee
    When a POST call is made to create an employee
    Then the status code for creating employee is 201
    And the employee is created
    And the employee ID is stored as a global variable to be used for other calls
    
    
