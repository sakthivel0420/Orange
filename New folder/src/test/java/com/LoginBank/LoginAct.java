package com.LoginBank;

import org.openqa.selenium.support.PageFactory;

import com.Bank.help;

public class LoginAct {
LoginLoc LoginLoc=null;
	
	
	public LoginAct() {
		LoginLoc = new LoginLoc();
		PageFactory.initElements(help.getDriver(),LoginLoc);
	}
	public void setUserName(String UserName) {
		LoginLoc.username.sendKeys(UserName);
	}
	public void setPassword(String Password) {
		LoginLoc.Password.sendKeys(Password);
	}
	
	public void clickreg() {
		LoginLoc.button.click();
		}
}
