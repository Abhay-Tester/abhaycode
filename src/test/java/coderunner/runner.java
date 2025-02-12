package coderunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
		features = {"src/test/java/stories" },
		dryRun = false,                        // for run or not run
		snippets = SnippetType.CAMELCASE, // for remove the underscore
		monochrome = true,
		glue = "steps",
		plugin= {"pretty", "html:test-output/todo.html"} //to generate different types of reporting

		)

public class runner extends AbstractTestNGCucumberTests {
	
}
