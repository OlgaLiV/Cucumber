@searchEmployee
Feature: Searching employee

  Background: 
    When login with valid credentials
    Then navigate to employee list page

  @searchByNameScenario
  Scenario Outline: Searching employee using name
    Then enter name "<Employee Name>"
    And click on search button

    Examples: 
      | Employee Name |
      | Nazaret       |
      | Nerses        |
      | Hakob         |
      | Taline        |
      | Lucine        |

  @searchByIdScenario
  Scenario Outline: Searching employee using id
    Then enter "<Id>"
    And click on search button

    Examples: 
      | Id   |
      | 7334 |
      | 7335 |
      | 7336 |
      | 7337 |
      | 7338 |
