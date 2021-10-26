package com.Penske.Script;

import com.Penske.Generics.BaseTest;
import com.Penske.Pages.HomePage;
import com.Penske.Pages.MovingTruck16Foot;
import com.Penske.Pages.Start_PenskeTruckRental;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class Test_HomePage extends BaseTest {

    @Test
    public void TC_002()throws InterruptedException

    {
        ExtentTest test= extent.createTest("Penske Truck Business","Select Delivery Location");
        HomePage hp = new HomePage(driver);


        test.log(Status.INFO,"Testing started");
//        test.addScreenCaptureFromPath("./Test-Ext-Report/Screenshot/","Screen1");
        hp.truckselect();
        test.pass("Select Truck");
        hp.select16foottruck();
        test.fail("Select Truck");
        MovingTruck16Foot foot16truck = new MovingTruck16Foot(driver);
        foot16truck.GetAQuote();
        Start_PenskeTruckRental StartRental = new Start_PenskeTruckRental(driver);
        StartRental.Logo();
        System.out.println("Title of the page is " + driver.getTitle());
    }

}
