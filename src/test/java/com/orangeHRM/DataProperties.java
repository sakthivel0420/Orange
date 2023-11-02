package com.orangeHRM;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class DataProperties {
	String url;
	String username;
	String password;
	
	public DataProperties(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\ssenthilvel\\Selenium\\orangeHRM\\src\\main\\resources\\Feature\\data.properties");
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
		username = prop.getProperty("username");
	    password = prop.getProperty("password");
	}
}