package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/myFeatureFiles/TagFeature.feature",
		glue="myStepDefinitionClasses",
		monochrome = true,
		dryRun = false,
		tags = {"@SmokeTest","~@RegressionTest","@E2ETest"})

public class TestRunner 
{

	
}
