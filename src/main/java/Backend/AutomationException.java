package Backend;

import Base.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AutomationException extends RuntimeException {


    public AutomationException(Exception message) throws MalformedURLException {
        super(message);
        String pattern = "yyyyMMdd_HHMMSS";
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        File scrFile = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
        String filePath = System.getProperty("user.dir") + "//screenshots//" + date + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
