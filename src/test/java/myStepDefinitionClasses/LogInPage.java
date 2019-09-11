package myStepDefinitionClasses;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInPage 
{

	
	@Given("^User is on NetBanking Login page$")
	public void user_is_on_netbankig_login_page()
	{
		System.out.println("I am on net banking page");
	}
	
	
	
	@When("^User Login into application with username and password$")
	public void user_login_into_app_username_password()
	{
		System.out.println("I have entered username and pasword and clicked on submit button");
		
	}
	
	
	@Then("^HomePage is populaed$")
	public void homepage_is_populated()
	{
		System.out.println("I am on Home page now");
	}
	
	@And("^Cards are displayed$")
	public void card_are_displayed()
	{
		System.out.println("Cards are displaying");
	}
	
	
	
}
