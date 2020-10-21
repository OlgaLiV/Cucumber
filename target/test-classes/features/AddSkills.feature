@addSkills
Feature: Add New Skills to System

Background: 
		When login with valid credentials
    Then navigate to skills page
    
    Scenario: Adding new skils to HRMS system
    And enter new skill "Management" to system
    Then verify that "Management" was successfull adding
    