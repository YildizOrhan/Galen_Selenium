package Helpers;

import Backend.AutomationException;
import Base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class ClickHelper {

  public static void click(By locator) throws  MalformedURLException {
    try {
      GenericHelper.highlightElement(locator);
      WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 120);
      wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    } catch (Exception ex) {
      throw new AutomationException(ex);
    }
  }



}
