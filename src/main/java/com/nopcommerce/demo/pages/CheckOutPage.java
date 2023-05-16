package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeSignInPageTitleLocator;

    @CacheLookup
    @FindBy(css = ".button-1.checkout-as-guest-button")
    WebElement checkoutAsGuestButtonLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_FirstName")
    WebElement firstNameFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_LastName")
    WebElement lastNameFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Email")
    WebElement emailFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_CountryId")
    WebElement countryDropDownLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_City")
    WebElement cityFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement addressFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_ZipPostalCode")
    WebElement postCodeFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_PhoneNumber")
    WebElement phoneNumberFieldLocator;

    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButtonLocator;

    //By ButtonRegister = By.cssSelector(".button-1.register-button");
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement ButtonRegister;

    public String getTextFromWelcomeText() {
        log.info("get text from welcome text");
        return getTextFromElement(welcomeSignInPageTitleLocator);
    }

    public void clickCheckOut() {
        log.info("click on check out " );
        clickOnElement(checkoutAsGuestButtonLocator);
    }

    public void firstName(String fName) {
        log.info("Enter first name " + fName + " to username field " + firstNameFieldLocator.toString());
        sendTextToElement(firstNameFieldLocator, fName);
    }

    public void lastName(String lName) {
        log.info("Enter last name " + lName + " to username field " + lastNameFieldLocator.toString());
        sendTextToElement(lastNameFieldLocator, lName);
    }

    public void email(String email) {
        log.info("Enter email " + email + " to username field " + emailFieldLocator.toString());
        sendTextToElement(emailFieldLocator, email);
    }

    public void selectCountryFromDropDown() {
        log.info("select country from dropdown list" );
        selectByIndexFromDropDown(countryDropDownLocator, 2);

    }
    public void enterCity(String cityName) {
        log.info("Enter city name " + cityName + " to username field " + cityFieldLocator.toString());
        sendTextToElement(cityFieldLocator, cityName);
    }

    public void enterAddress(String address) {
        log.info("Enter address " + address + " to username field " + addressFieldLocator.toString());
        sendTextToElement(addressFieldLocator,address );
    }

    public void enterPostCode(String postcode) {
        log.info("Enter postcode " + postcode + " to username field " + postCodeFieldLocator.toString());
        sendTextToElement(postCodeFieldLocator, postcode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        log.info("Enter phone number " + phoneNumber + " to username field " + phoneNumberFieldLocator.toString());
        sendTextToElement(phoneNumberFieldLocator, phoneNumber);
    }

    public void clickContinue() {
        log.info("click on continue " );
        clickOnElement(continueButtonLocator);
    }

    public void clickOnButtonRegister() throws InterruptedException {
        log.info("click on button register " );
        clickOnElement(ButtonRegister);
        Thread.sleep(1000);
    }

}
