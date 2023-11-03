package com.Bank;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@InValidCredentials or @ValidCredentials",features="C:\\Users\\ssenthilvel\\Selenium\\Bank\\src\\test\\resources\\infos\\Login.feature",glue="com.LoginBank")
public class runner {

}
