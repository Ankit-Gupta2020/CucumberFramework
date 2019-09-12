package myStepDefinitionClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewEmployee 
{
	WebDriver driver;

	
	  @Given("^Launch OrangeHRM Login Page$") 
	  public void launch_orangehrm_login_page(DataTable url)  
	  {
		 
		System.setProperty("webdriver.chrome.driver", "./libs/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		List<List<String> > appURL =url.raw();
		System.out.println(appURL.get(0).get(0));
		driver.get(appURL.get(0).get(0));
	  }
	 

	@And("^Enter admin User credentials$")
    public void enter_admin_user_credentials(DataTable credentials) 
	{
        List<List<String>> appCredentials=credentials.raw();
        driver.findElement(By.id("txtUsername")).sendKeys(appCredentials.get(0).get(0));
        driver.findElement(By.id("txtPassword")).sendKeys(appCredentials.get(0).get(1));
        driver.findElement(By.id("btnLogin")).click();
    }
	
	@And("^Naviage to Add Employee page under PIM tab$")
    public void naviage_to_add_employee_page_under_pim_tab() 
	{
    
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule"))).build().perform();
		action.click(driver.findElement(By.id("menu_pim_addEmployee"))).build().perform();
		
    }


	@When("^Enter employee details$")
    public void enter_employee_details(DataTable employeeDetails) 
	{
        List<List<String>> addEmployeeDetails=employeeDetails.raw();
        
        String firstName=addEmployeeDetails.get(0).get(0);
        String lastName=addEmployeeDetails.get(0).get(1);
        
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        
    }

	@And("^clicks on save button$")
    public void clicks_on_save_button() 
	{
       driver.findElement(By.id("btnSave")).click();
    }
	
    @Then("^new employee should be added$")
    public void new_employee_should_be_added() 
    {
    
    	System.out.println("new user is added");
    } 

    
}
