package Helpers;

import Base.DriverManager;
import com.galenframework.api.Galen;
import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;
import com.galenframework.support.GalenReportsContainer;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class GalenHelper {
    public static LayoutReport layoutReport;
    public static String specPath = "src/test/resources/specs/";

    public static void loadSpecFile(String gSpecfileName) throws Throwable {
        try {
            layoutReport = Galen.checkLayout(DriverManager.getDriver(), specPath + gSpecfileName, Arrays.asList("web"));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to load gspec file");
        }
    }
    public static void createReport(String testInfo, String reportInfo) throws Throwable {
        try {
            List<GalenTestInfo> tests = GalenReportsContainer.get().getAllTests();
            GalenTestInfo test = GalenTestInfo.fromString(testInfo);
            test.getReport().layout(layoutReport, reportInfo);
            tests.add(test);
            new HtmlReportBuilder().build(tests, "target/galen-html-reports");

            if (layoutReport.errors() > 0) {
                System.out.println(layoutReport.errors());
                Assert.fail("Layout test failed");
            }
        } catch (Exception e) {
            Assert.fail("Exception in report");
        }
    }
}
