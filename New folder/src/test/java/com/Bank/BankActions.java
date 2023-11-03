package com.Bank;

import org.openqa.selenium.support.PageFactory;

public class BankActions {

	BankLocators BankLocators=null;
	
	
	public BankActions() {
		BankLocators = new BankLocators();
		PageFactory.initElements(help.getDriver(),BankLocators);
	}
	public void setFirstname(String Firstname) {
		BankLocators.firstname.sendKeys(Firstname);
	}
	public void setLastname(String Lastname) {
		BankLocators.lastname.sendKeys(Lastname);
	}
	public void setaddress(String Address) {
		BankLocators.address.sendKeys(Address);
	}
	public void setcity(String city) {
		BankLocators.city.sendKeys(city);
	}
	public void setstate(String state) {
		BankLocators.State.sendKeys(state);
	}
	public void setzip(String zip) {
		BankLocators.zip.sendKeys(zip);
	}
	public void setphone(String phone) {
		BankLocators.phone.sendKeys(phone);
	}
	public void setSSN(String SSN) {
		BankLocators.SSN.sendKeys(SSN);
	}
	public void setUserName(String UserName) {
		BankLocators.username.sendKeys(UserName);
	}
	public void setPassword(String Password) {
		BankLocators.Password.sendKeys(Password);
	}
	public void setconfirm(String confirm) {
		BankLocators.confirm.sendKeys(confirm);
		}
	public void clickreg() {
		BankLocators.reg.click();
		}
	
}