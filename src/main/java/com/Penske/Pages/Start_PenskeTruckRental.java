package com.Penske.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Start_PenskeTruckRental {



    @FindBy(xpath = "(//img[@title=\"Penske Truck Rental\"])[2]")
    private WebElement PenskeLogo;

    public  Start_PenskeTruckRental(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void Logo()

    {
        PenskeLogo.click();
    }

}
