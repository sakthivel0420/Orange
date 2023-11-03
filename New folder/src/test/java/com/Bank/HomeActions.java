package com.Bank;

import org.openqa.selenium.support.PageFactory;

public class HomeActions{
	homelocators homelocators;
	public HomeActions() {
		homelocators = new homelocators();
		PageFactory.initElements(help.getDriver(), homelocators);
	}
	public String getVerifyText() {
		return homelocators.verifyText.getText();
	}

}
