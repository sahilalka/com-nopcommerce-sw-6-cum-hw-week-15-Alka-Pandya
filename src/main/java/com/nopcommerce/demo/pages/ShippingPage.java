package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShippingPage.class.getName());

    public ShippingPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(css = "#shippingoption_1")
    WebElement nextDayAirRadioLocator;

    @CacheLookup
    @FindBy(css = ".button-1.shipping-method-next-step-button")
    WebElement continueButtonAfterShippingLocator;



    public void shippingMethod(){
        log.info("click on next day air radio  " );
        clickOnElement(nextDayAirRadioLocator);
    }

    public void shippingMethodContinueButton(){
        log.info("click on continue button " );
        clickOnElement(continueButtonAfterShippingLocator);


    }

}
