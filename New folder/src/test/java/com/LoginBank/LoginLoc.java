package com.LoginBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLoc {
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[1]/input")
	public WebElement username;
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[2]/input")
	public WebElement Password;
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[3]/input")
	public WebElement button;

}
