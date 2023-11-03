package com.Bank;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankDef {
	InfoProperties in = new InfoProperties();
	BankActions ba = new BankActions();
	HomeActions ha = new HomeActions();
	
	
	
	@Given("the user is logged in to the register page")
	public void the_user_is_logged_in_to_the_register_page() {
		help.openPage(in.url);
	    System.out.println("REGISTER PAGE");		

	}

	@When("the user gives valid firstname")
	public void the_user_gives_valid_firstname() {
		ba.setFirstname(in.first);
	    System.out.println("FIRSTNAME ENTERD");		

	}

	@When("the user gives valid lastname")
	public void the_user_gives_valid_lastname() {
		ba.setLastname(in.last);
	    System.out.println("LASTNAME ENTERED");		

	}

	@When("the user gives valid address")
	public void the_user_gives_valid_address() {
		ba.setaddress(in.add);
	    System.out.println("ADDRESS ENTERED ");		

	}

	@When("the user gives valid city")
	public void the_user_gives_valid_city() {
		ba.setcity(in.city);
	    System.out.println("CITY ENTERED ");		

	}

	@When("the user gives valid State")
	public void the_user_gives_valid_state() {
		ba.setstate(in.state);
	    System.out.println("STATE ENTERED ");		

	}

	@When("the user gives valid zip code")
	public void the_user_gives_valid_zip_code() {
		ba.setzip(in.zip);
	    System.out.println("ZIP CODE ENTERED ");		

	}

	@When("the user gives valid phone number")
	public void the_user_gives_valid_phone_number() {
		ba.setphone(in.phone);
	    System.out.println("PHONE NUMBER ENTERED ");		

	}

	@When("the user gives valid SSN")
	public void the_user_gives_valid_ssn() {
		ba.setSSN(in.SSN);
	    System.out.println("SSN ENTERED ");		

	}

	@When("the user gives valid Username")
	public void the_user_gives_valid_username() {
		ba.setUserName(in.username);
	    System.out.println("USERNAME ENTERED ");		

	}

	@When("the user gives valid password")
	public void the_user_gives_valid_password() {
		ba.setPassword(in.password);
	    System.out.println("PASSWORD ENTERED ");		

	}

	@When("the user gives confirm password")
	public void the_user_gives_confirm_password() {
		ba.setconfirm(in.confirm);
	    System.out.println("PASSWORD CONFIRMED ");		

	}

	@When("the user presses the register button")
	public void the_user_presses_the_register_button() {
		ba.clickreg();
	    System.out.println("REGISTER BUTTEN PRESSED ");		

	}

	@Then("the account was created successfully message is shown")
	public void the_account_was_created_successfully_message_is_shown() {
		Assert.assertTrue(ha.getVerifyText().contains("Your account was created successfully. You are now logged in."));
	    System.out.println("SUCESSFULLY DONE ");		

	}


}
