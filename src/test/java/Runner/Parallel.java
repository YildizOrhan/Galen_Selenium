package Runner;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.junit.Courgette;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Courgette.class)
@CourgetteOptions (
  threads =2,
  runLevel = CourgetteRunLevel.SCENARIO,
  showTestOutput = true,
  reportTargetDir = "reports",
  rerunFailedScenarios = true,
  rerunAttempts = 3,
  cucumberOptions = @CucumberOptions(glue = "StepDef",  plugin = { "json:target/json-cucumber- reports/cukejson.json",
    "junit:target/junit-cucumber-reports/cukejunit.xml","pretty",
    "html:target/cucumber-reports/cucumber-pretty",
    "json:target/cucumber-reports/CucumberTestReport.json",
    "rerun:target/cucumber-reports/rerun.txt" }, features = "src/test/java/Features/TrendyolLayout.feature")

)
public class Parallel {

}
