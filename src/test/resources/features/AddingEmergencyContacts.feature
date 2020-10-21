@addEmergencyContact
Feature: Adding Emergency Contacts

  Background: 
    When login with valid credentials
    Then navigate to add employee page
    
    
  @regression 
  Scenario: Adding emergency contacts to employee 
    And enter new employee as "Baby", "Shark" without details
    Then click on Emergency Contacts button
    Then enter new Emergency contact "Emma", "Mom", "123456", "654321", "162534" and save
    Then verify that Emergency contact "Emma" was successfully added

    