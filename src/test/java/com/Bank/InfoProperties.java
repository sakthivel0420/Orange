package com.Bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class InfoProperties {
	public String url;
	String first;
	String last;
	String add;
	String city;
	String state;
	String zip;
	String phone;
	String SSN;
	String username;
	String password;
	String confirm;
	
	
	public InfoProperties(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\ssenthilvel\\Selenium\\Bank\\src\\test\\resources\\infos\\info.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		first=prop.getProperty("firstname");
		last=prop.getProperty("lastname");
		add=prop.getProperty("address");
		city=prop.getProperty("city");
		state=prop.getProperty("State");
		zip=prop.getProperty("zip");
		phone=prop.getProperty("phone");
		SSN=prop.getProperty("SSN");
		username = prop.getProperty("Username");
	    password = prop.getProperty("password");
	    confirm=prop.getProperty("confirm");
	}
}

