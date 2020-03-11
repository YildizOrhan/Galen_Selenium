package Helpers;

import Backend.AutomationException;
import Base.DriverManager;

import java.net.MalformedURLException;

public class NavigationHelper {
    public static void navigateTo(String URL) throws MalformedURLException {
        try {
            DriverManager.getDriver().get(URL);
        } catch (Exception ex) {
            throw new AutomationException(ex);
        }
    }

}
