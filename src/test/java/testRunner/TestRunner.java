package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Automation//Project//SeleniumCucumber//Features//Login_Page.feature",
        glue = "stepDefinitions"
)
public class TestRunner {
}
