package com.Bank;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hook {
	@Before
	public static void setUp() {
		help.setUpDriver();
	}
	@After
	public static void tearDown(Scenario scenario) {
		help.tearDown();
	}
 
}
