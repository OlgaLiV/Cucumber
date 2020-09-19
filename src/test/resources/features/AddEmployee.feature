@addEmployee
Feature: Adding Employee

  Background: 
    When login with valid credentials
    Then navigate to add employee page

  Scenario: Adding with login details
    And enter new employee with details
    Then verify successfull adding

  Scenario: Adding without login detales but without middle name
    And enter new employee without details
    Then verify successfull adding

  @parameter
  Scenario: Add employee without login details but with middle name
    When enter first name as "Anna" middle name "Can" and last name as "Karenina"
    And verify that "Anna Can Karenina" is added successfully

  @examples
  Scenario Outline: Adding multiple employees without login details
    When enter employee "<First Name>", "<Middle Name>" and "<Last Name>"
    And verify that "<First Name>", "<Middle Name>" and "<Last Name>" is successfully added

    Examples: 
      | First Name | Middle Name | Last Name |
      | Mark       | J           | Smithy    |
      | Hunter     | ABC         | Musoevy   |
      | John       | M           | Wicky     |
      | John       | F           | kennedyy  |

  @dtWithHeader
  Scenario: Adding multiple employees at one execution
    When add mltiple employees and verify they are added
      | First Name | Middle Name | Last Name | Employee ID |
      | Mark       | J           | Smith     | rfaeryuk    |
      | Hunter     | ABC         | Musoev    | yuatgoss    |
      | John       | M           | Wick      | vvbajhd     |
      | John       | F           | kennedy   | mlojagkfds  |

  @excelTask
  Scenario: Adding multiple employees from excel file
    When add multiple employees from "Sheet1" verify they are addes successfully
