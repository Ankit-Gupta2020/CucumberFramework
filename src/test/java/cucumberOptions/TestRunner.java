package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/myFeatureFiles",
		glue="myStepDefinitionClasses")

public class TestRunner 
{

	
}
