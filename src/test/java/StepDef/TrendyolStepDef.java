package StepDef;

import Base.DriverManager;
import Helpers.GalenHelper;
import Helpers.JavaScriptHelper;
import Helpers.NavigationHelper;
import PageActions.HomaPageActions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class TrendyolStepDef {

  @Before
  public void before() throws IOException {

    if (DriverManager.driver == null) {
      DriverManager.setBrowserType("CHROME");
      DriverManager.getDriver().manage().window().maximize();
      DriverManager.getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
      DriverManager.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
  }

  @After
  public void after() throws Exception {
    DriverManager.getDriver().close();
    DriverManager.getDriver().quit();
    DriverManager.driver = null;
  }
  
  @Given("I launch {string}")
  public void iLaunch(String URL) throws MalformedURLException {
    NavigationHelper.navigateTo(URL);
    JavaScriptHelper.pageLoadComplete();
  }

  @When("I closed gender popup")
  public void iClosedGenderPopup() throws MalformedURLException {
    HomaPageActions.clickCloseGenderSelectionPopup();
  }

  @When("I load gspec file (.*?)$")
  public void i_load_gspec_file(String gSpecfileName) throws Throwable {
    GalenHelper.loadSpecFile(gSpecfileName);
  }

  @Then("Test Info (.*?) and Report Info (.*?) is updated")
  public void test_Info_and_Report_Info_is_updated(String testInfo, String reportInfo) throws Throwable {
    GalenHelper.createReport(testInfo,reportInfo);
  }

  @And("Click Login button")
  public void clickLoginButton() throws MalformedURLException {
    HomaPageActions.clickLoginButton();
  }
}
