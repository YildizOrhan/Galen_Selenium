
package Helpers;

import Backend.AutomationException;
import Base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class GenericHelper {

  public static void highlightElement(By by) throws  MalformedURLException {
    try {
      Thread.sleep(100);
      WebElement el = DriverManager.getDriver().findElement(by);
      if (DriverManager.getDriver() instanceof JavascriptExecutor) {
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].style.border='3px solid red'", el);
      }

    } catch (Exception e) {
      throw new AutomationException(e);
    }

  }
}
