package com.Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankLocators {
	@FindBy(xpath="//*[@id=\"customer.firstName\"]")
	public WebElement firstname;
	@FindBy(xpath="//*[@id=\"customer.lastName\"]")
	public WebElement lastname;
	@FindBy(xpath="//*[@id=\"customer.address.street\"]")
	public WebElement address;
	@FindBy(xpath="//*[@id=\"customer.address.city\"]")
	public WebElement city;
	@FindBy(xpath="//*[@id=\"customer.address.state\"]")
	public WebElement State;
	@FindBy(xpath="//*[@id=\"customer.address.zipCode\"]")
	public WebElement zip;
	@FindBy(xpath="//*[@id=\"customer.phoneNumber\"]")
	public WebElement phone;
	@FindBy(xpath="//*[@id=\"customer.ssn\"]")
	public WebElement SSN;
	@FindBy(xpath="//*[@id=\"customer.username\"]")
	public WebElement username;
	@FindBy(xpath="//*[@id=\"customer.password\"]")
	public WebElement Password;
	@FindBy(xpath="//*[@id=\"repeatedPassword\"]")
	public WebElement confirm;
	@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	public WebElement reg;

}
