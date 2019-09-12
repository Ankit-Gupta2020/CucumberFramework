package myStepDefinitionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LogInPage 
{
	WebDriver driver;
	
	@Given("^Launch OrangeHRM Login Page \"([^\"]*)\"$")
	public void user_is_on_orangehrm_login_page_with(String url) {
		System.out.println("I am on net banking page");
		System.setProperty("webdriver.chrome.driver", "./libs/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	@When("^User Login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_app_username_password(String username ,String password) {
		System.out.println("I have entered " + username +" and " +password +" and clicked on submit button");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

	}

	
	@Then("^HomePage is populaed$")
	public void homepage_is_populated() {
		System.out.println("I am on Home page now");
		String title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", title);
	}
	
	@Then("^Close Browser$")
	public void close_browser()
	{
		driver.quit();
	}


}
