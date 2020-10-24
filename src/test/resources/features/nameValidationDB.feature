Feature: Name validations against DB
@dbValidation
Scenario: First name validation against DB - searching by Employee ID
When login with valid credentials
Then verify the dashboard logo is displayed
When navigate to employee list 
And enter a valid employee id "0056266"
Then click on searchh button
And verify the table is displayed
When get first name fron the table
Then get first name from the DB
Then validate first names from UI against DB
