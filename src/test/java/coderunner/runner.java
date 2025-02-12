package coderunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
		features = {"src/test/java/stories" },
		dryRun = false,                        // for run or not run
		snippets = SnippetType.CAMELCASE, // for remove the underscore
		monochrome = true,
		glue = "steps"
		)

public class runner extends AbstractTestNGCucumberTests {
	
}
