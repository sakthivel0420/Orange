
Feature: Login to HRM Application
 
	Scenario: Login with valid credentials
	
	Given User is on HRMLogin page
	When User enters username and password
	And User clicks login button
	Then USer Should be able to login sucessfully and Home page opens