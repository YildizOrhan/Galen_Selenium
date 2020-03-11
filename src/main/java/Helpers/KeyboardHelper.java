package Helpers;

import Backend.AutomationException;
import Base.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import java.net.MalformedURLException;

public class KeyboardHelper {

  public static void keybordESC() throws MalformedURLException {
    try {
      Actions actions = new Actions(DriverManager.driver);
      actions.sendKeys(Keys.chord(Keys.chord(Keys.ESCAPE))).build().perform();
    } catch (Exception ex) {
      throw new AutomationException(ex);
    }
  }

}
