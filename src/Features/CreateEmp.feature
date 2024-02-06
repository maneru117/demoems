Feature: Employee Creation

  Scenario: Creating a new employee
    Given the user is on the open page
    And the user clicks on the Employees link
    When the user enters the employees page
    And the user clicks on the Create Employee button
    And the user fills in the employee details as follows:
      | Title     | First Name | Last Name | Email                    | Position         | Reference          |
      | Mr.       | John       | Dee       | john.doe@example.com     | Software Engineer | Friend's referral  |
    And the user clicks the Create Employee button
    Then the user should see the new employee on the employee details page