package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "StepDef", plugin = { "json:target/json-cucumber- reports/cukejson.json",
  "junit:target/junit-cucumber-reports/cukejunit.xml","pretty",
  "html:target/cucumber-reports/c" +
    "ucumber-pretty",
  "json:target/cucumber-reports/CucumberTestReport.json"
}, features = "src/test/java/Features/TrendyolLayout.feature")
public class TestRunner {

}
