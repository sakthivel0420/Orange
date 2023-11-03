Feature: Login Functionality of bank Web Application

@ValidCredentials
Scenario Outline: Verification of login using valid credentials
Given User is on the bank login pages 
When user enters a valid username as "<username>"
And user enters a valid password as "<password>"
And user click the loginButton
Then user is logged in

    Examples: 
      | username | password |
      | Admin    | admin123 |
			
@InValidCredentials
Scenario Outline: Verification of login using Invalid credentials
Given User is on the bank login pages 
When user enters a invalid username as "<invalidusername>"
And user enters a invalid password as "<invalidpassword>"
And user click the loginButton
Then user is shown error message

    Examples: 
      | invalidusername | invalidpassword|
      | admin           | bjhjjkh        |
      | Adminasd        | admin123dad    |
			| dasdd           | kk5g34         |