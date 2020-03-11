package Helpers;

import Backend.AutomationException;
import Base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class WaitHelper {

    public static void waitElementInvisibility(By selector) throws MalformedURLException {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.driver, 10);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(selector));
        } catch (Exception ex) {
            throw new AutomationException(ex);
        }
    }
}
