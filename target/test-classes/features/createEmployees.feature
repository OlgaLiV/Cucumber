@CreateEmployees
Feature: Creating employees
  
  Description: This feature creates employees

  Background: 
    Given a JWT is generated

  Scenario Outline: Creating employees
    Given a request is prepared to create employees
    When employee data provided is "<employeeFirstName>", "<employeeLastName>", "<employeeMiddleName>", "<employeeGender>", "<employeeBirthday>", "<employeeJobStatus>", "<employeeJobTitle>"
    Then employees are created

    Examples: 
      | employeeFirstName | employeeLastName | employeeMiddleName | employeeGender | employeeBirthday | employeeJobStatus      | employeeJobTitle |
      | Dog               | Dog              | Dog                | F              | 2005-09-30       | Employee               | Cloud Architect  |
      | Cat               | Cat              | Cat                | M              | 2017-09-17       | Independent contractor | CEO              |
      | Monkey            | Monkey           | Monkey             | M              | 2000-01-10       | Super Contractor       | IT Analyst       |
