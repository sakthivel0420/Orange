package com.orangeHRM;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
LoginPageLocators loginPageLocators=null;
 
public LoginPageActions() {
	loginPageLocators = new LoginPageLocators();
	
	PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
}
 
	// Set user name in textbox
	public void setUserName(String strUserName) {
	loginPageLocators.username.sendKeys(strUserName);
}
	public void setPassword(String strPassword) {
	loginPageLocators.Password.sendKeys(strPassword);
}
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	public void loginInfo(String username, String password) {
		setUserName(username);
		setPassword(password);
	}
}


