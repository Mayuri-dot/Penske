package com.Penske.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovingTruck16Foot {


    public WebDriver driver;

    @FindBy(xpath = "//button[@id='location-get-quote']")
    private WebElement GetQuote;

    public MovingTruck16Foot(WebDriver driver)
    {

        PageFactory.initElements(driver,this);
    }
    public void GetAQuote()
    {

        GetQuote.click();
    }


}
