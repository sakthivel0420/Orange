Feature: Register to parabank

  Scenario: Register to parabank using valid credentials 
    Given the user is logged in to the register page
    When the user gives valid firstname
    And the user gives valid lastname
    And the user gives valid address
    And the user gives valid city
    And the user gives valid State
    And the user gives valid zip code
    And the user gives valid phone number
    And the user gives valid SSN
    And the user gives valid Username
    And the user gives valid password
    And the user gives confirm password
    And the user presses the register button
    Then the account was created successfully message is shown

  
