package Base;

import Enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

public class DriverManager {
    private DriverManager() {
    }

    public static WebDriver driver;

    private static String browserType;

    public static void setBrowserType(String browser) {

        browserType = browser;
    }

    public static WebDriver getDriver() throws MalformedURLException {

        BrowserType browser = BrowserType.valueOf(browserType);

        if (driver == null) {
            switch (browser) {
                case CHROME:
                    ChromeOptions options = new ChromeOptions();
                    WebDriverManager.chromedriver().setup();
                    options.addArguments("--disable-notifications");
                   // options.addArguments("--headless");
                    driver = new ChromeDriver(options);
                    break;
                case IE:
                    //...
                    break;
                default:
                    //...
                    break;
            }
        }
        return driver;
    }

}
