package fata;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class hrmDef {
	WebDriver driver=new EdgeDriver();
	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("User provides valid credentials")
	public void user_provides_valid_credentials(DataTable dataTable) throws InterruptedException {
		System.out.println("cred entered");
		List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
			String username =form.get("Username");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
			
			String password=form.get("Password");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
					
		}
	   
	}

	@When("User should be able to login sucessfully and see homepage")
	public void user_should_be_able_to_login_sucessfully_and_see_homepage() {
		String newPageText=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		System.out.println("newpagetxt");
		Assert.assertTrue(newPageText.equals("Dashboard"));
	}


	@Then("User should be able to see unsucessfull with error message")
	public void user_should_be_able_to_see_unsucessfull_with_error_message() {
		String expectedError =driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
		Assert.assertTrue(expectedError.equals("Invalid credentials"));
	}




}
