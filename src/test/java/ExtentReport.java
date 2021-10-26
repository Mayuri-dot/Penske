import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;


public class ExtentReport {

    public ExtentSparkReporter htmlReporter;

    public ExtentReports extent;
    public ExtentTest extentTest;
    WebDriver driver;

    @BeforeSuite
    public void beforeclass()
    {
        // start reporters
        htmlReporter = new ExtentSparkReporter("./Test-Ext-Report/Spark.html");

        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }



}
