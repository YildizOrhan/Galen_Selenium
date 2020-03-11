
package Helpers;
import Base.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
public class JavaScriptHelper  {

  public static void pageLoadComplete() throws MalformedURLException {
    JavascriptExecutor jsDriver = (JavascriptExecutor) DriverManager.getDriver();
    ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {

      public Boolean apply(WebDriver driver) {
        return jsDriver.executeScript("return document.readyState", true).toString().equals("complete");
      }
    };
    try {
      WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 200);
      wait.until(expectation);
    } catch (Throwable error) {
    }
  }






}
