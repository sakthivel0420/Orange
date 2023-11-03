Feature: Login to HRM WebApplication
  @ValidCredentials
  Scenario: Login with valid credentials
    Given User is on HRMLogin page
    When User provides valid credentials
    | Username  | Password | 
    | Admin |  admin123 |
    
    And User should be able to login sucessfully and see homepage

  @InValidCredentials
  Scenario: Login with invalid credentials
    Given User is on HRMLogin page
    When User provides valid credentials
     | Username  | Password | 
      | gzfdhgl |     gsdfdsf |
      | hrrhss |     fsdfsdf |
      
    Then User should be able to see unsucessfull with error message

    
      
