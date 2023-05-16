package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationSuccessfulPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegistrationSuccessfulPage.class.getName());

    public RegistrationSuccessfulPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement messageOfSuccessfulRegistration;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement buttonContinue;


    public String actualMessageOfSuccessfulRegistration(){
        log.info("Get text successful registration");
        return getTextFromElement(messageOfSuccessfulRegistration);
    }

    public void clickOnButtonContinue() throws InterruptedException {
        log.info("click on continue button " );
        clickOnElement(buttonContinue);
        Thread.sleep(2000);
    }


}
