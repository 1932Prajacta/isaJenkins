package testLogging;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogging {
	@Given("I want to enter valid name1 and pass1")
	public void i_want_to_enter_valid_name1_and_pass1() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I want to enter valid name1 and pass1");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I click on login button");
	}

	@Then("I should be able to login with valid username and password")
	public void i_should_be_able_to_login_with_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be able to login with valid username and password");
	}

	@Given("I want to enter valid name2 and pass2")
	public void i_want_to_enter_valid_name2_and_pass2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to enter valid name2 and pass2");
	}

}
