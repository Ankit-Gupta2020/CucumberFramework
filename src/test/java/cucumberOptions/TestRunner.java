package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/myFeatureFiles/AddEmployee.feature",
		glue="myStepDefinitionClasses",
		monochrome = true,
		dryRun = false)

public class TestRunner 
{

	
}
