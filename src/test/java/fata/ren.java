package fata;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@ValidCredentials",features="C:\\Users\\ssenthilvel\\Selenium\\Bank\\src\\test\\resources\\infos\\database.feature",glue="fata",plugin={"pretty","junit:target/Cucumber-reports/Cucumber.junit"})
public class ren extends AbstractTestNGCucumberTests{
	

}
