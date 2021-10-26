package com.Penske.Pages;

import com.Penske.Generics.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {

    @FindBy(xpath="(//a[text()='Trucks'])[3]")
    private WebElement truck;

    @FindBy(xpath="(//span[text()='16 Foot Truck'])[2]")
    private WebElement Foottruck16;

    @FindBy(xpath="//a[text()=\"Leasing\"]")
    private WebElement leasing;

    @FindBy(xpath="//input[@id='Email']")
    private WebElement emailid;

    @FindBy(xpath="//button[text()=\"Sign Up\"]")
    private WebElement signupbtn;




    public HomePage(WebDriver driver)
    {

        PageFactory.initElements(driver,this);
    }

    public  void truckselect(){
        Actions act1 = new Actions(BaseTest.driver);
        act1.moveToElement(truck).perform();
    }

    public  void select16foottruck()
    {

        Foottruck16.click();
    }

    public void TruckLeasing()
    {

        leasing.click();
    }
  public void SignupEmail(String email)

  {
      emailid.sendKeys(email);
  }

    public void clicksignupbtn()
    {

        signupbtn.click();
    }
    }
