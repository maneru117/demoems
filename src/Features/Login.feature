Feature: User Login

  Scenario: Successful Login
    Given the user is on the login page
    When the user enters valid credentials username "skilledems@gmail.com" pwd "admin"
    And clicks the login button
    Then the user should be redirected to the dashboard

