package com.LoginBank;

import com.Bank.InfoProperties;
import com.Bank.help;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef {
	LoginAct la =new LoginAct();
	InfoProperties in = new InfoProperties();

	@Given("User is on the bank login pages")
	public void user_is_on_the_bank_login_pages() {
		help.openPage(in.url);
		
	}

	@When("user enters a valid username as {string}")
	public void user_enters_a_valid_username_as(String string) {
		la.setUserName(string);
		
	}

	@When("user enters a valid password as {string}")
	public void user_enters_a_valid_password_as(String string) {
		la.setPassword(string);
	}

	@When("user click the loginButton")
	public void user_click_the_login_button() {
		la.clickreg();
		
	}

	@Then("user is logged in")
	public void user_is_logged_in() {
		System.out.println("---------------------USER IS LOGGED IN-----------------------");
		
	}

	@When("user enters a invalid username as {string}")
	public void user_enters_a_invalid_username_as(String string) {
		la.setUserName(string);

	}

	@When("user enters a invalid password as {string}")
	public void user_enters_a_invalid_password_as(String string) {
		la.setPassword(string);

	}

	@Then("user is shown error message")
	public void user_is_shown_error_message() {
		System.out.println("---------------------USER NOT IN-----------------------");
	}





}
