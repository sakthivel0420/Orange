package com.Bank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class help {
	private static help help;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT=10;
	help(){
		driver = new EdgeDriver();
		wait =new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(help==null) {
			help=new help();
		}
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		help=null;
	}
}
