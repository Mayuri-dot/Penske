package com.Penske.Script;

import com.Penske.Generics.BaseTest;
import com.Penske.Generics.FWUtils;
import com.Penske.Pages.HomePage;
import org.testng.annotations.Test;

public class Test_HomePageLeasing extends BaseTest {

   @Test
    public void Tc_003()
   {
       HomePage hp = new HomePage(driver);
       hp.TruckLeasing();
       hp.SignupEmail(FWUtils.getExcelData("Sheet1",0,0));
       hp.clicksignupbtn();

   }
}
