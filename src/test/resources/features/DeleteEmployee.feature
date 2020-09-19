@deleteEmployees
Feature: Delete employees

  Background: 
    When login with valid credentials
    Then navigate to employee list page

  @deteteById
  Scenario Outline: delete employee by ID
    And enter id number "<Id>" and click on search button
    Then verify "<Id>" in table
    Then click on check
    And click on delete button

    Examples: 
      | Id   | First Name | Last Name |
      | 7319 | Nazaret    | Sarkisyan |
      | 7321 | Hakob      | Davidyan  |
      | 7323 | Lucine     | Mooshian  |

  @deleteEmployeesUsingExcel
  Scenario: Delete multiple employees from excel file
    When delete multiple employees from "Sheet1" verify they are deleted successfully
