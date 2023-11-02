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
//	public void logins() {
//		File file =new File("C:\\Users\\ssenthilvel\\Selenium\\orangeHRM\\src\\main\\resources\\Feature\\data.properties");
//		FileInputStream fileinput=null;
//		try {
//			fileinput=new FileInputStream(file);
//		}catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		Properties prop = new Properties();
//		
//		try {
//			prop.load(fileinput);
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//		strUserName=prop.getProperty("username1");
//		strPassword=prop.getProperty("password1");
//		strurl=prop.getProperty("url");
//		
//		
//	}
// 

