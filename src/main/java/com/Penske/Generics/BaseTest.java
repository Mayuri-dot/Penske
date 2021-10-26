package com.Penske.Generics;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest implements IAutoconstant
{

    static
    {
        System.setProperty(EDGE_KEY,EDGE_VALUE);
    }

    public static WebDriver driver;


    public ExtentSparkReporter htmlReporter;

    public ExtentReports extent;
    public ExtentTest extentTest;

    @BeforeSuite
    public void beforeclass()
    {
        // start reporters
        htmlReporter = new ExtentSparkReporter("./Test-Ext-Report/Spark.html");

        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @BeforeMethod
    public  void open_Browser()
    {
        String sBrowser="Edge";
        if (sBrowser.equals("chrome")) {
            driver = new ChromeDriver();
        }

        else if (sBrowser.equals("firefox")){
            driver= new FirefoxDriver();
        }
        else if (sBrowser.equals("Edge")){
            driver= new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
        driver.get(url);
    }



    @AfterSuite
    public void reportEnd(){

        driver.close();

        extent.flush();
    }
}
