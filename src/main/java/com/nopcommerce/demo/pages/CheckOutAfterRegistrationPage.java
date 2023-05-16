package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutAfterRegistrationPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutAfterRegistrationPage.class.getName());

    public CheckOutAfterRegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")  // value "Micky"
    WebElement firstNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")  // value "Mouse"
    WebElement lastNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")  // value "mickmouse0000@gmail.com"
    WebElement emailInputBox;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")  //value "233"
    WebElement countryDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")  //value "Glasgow"
    WebElement cityInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")  //value "10 Paris Street"
    WebElement address1InputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")  // value "GS10 2FC"
    WebElement postalCodeInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']") // value "02022039384"
    WebElement billingNewAddressPhoneNumber;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")  //button 1
    WebElement buttonContinueFromBillingAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement radioButtonNextDayAir;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")  // button 2
    WebElement buttonContinueFromShippingMethod;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement radioButtonCreditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")        // button 3
    WebElement buttonContinueFromPaymentMethod;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']") // value  "MasterCard"
    WebElement dropDownSelectCard;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")  // value "Mr Micky"
    WebElement cardHolderNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']") // value "5105105105105100"
    WebElement cardNumberInputBox;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']") // "12"
    WebElement dropDownExpiryDateMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")  // value "2023"
    WebElement dropDownExpiryDateYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']") // value "203"
    WebElement cardCodeInputBox;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']") // button 4
    WebElement buttonContinueFromPaymentInformation;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement actualTextOfCardMethod;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement actualTextOfShippingMethod;

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement actualTotalFinalPrice;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")  // button confirm
    WebElement buttonConfirm;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='shippingoption_2'])[1]")
    WebElement radioButton2ndDayAir;


    /**
     * List of methods to perform actions using above locators variables
     */

    // Fill the all mandatory field
    public void firstName(String fName) {
        log.info("Enter first name " + fName + " to username field " + firstNameInputBox.toString());
        clearValue(firstNameInputBox);
        sendTextToElement(firstNameInputBox, fName);
    }

    public void lastName(String lName) {
        log.info("Enter last name " + lName + " to username field " + lastNameInputBox.toString());
        clearValue(lastNameInputBox);
        sendTextToElement(lastNameInputBox, lName);
    }

    public void email(String email) {
        log.info("Enter email " + email + " to username field " + emailInputBox.toString());
        clearValue(emailInputBox);
        sendTextToElement(emailInputBox, email);
    }

    public void selectCountryFromDropDown() {
        log.info("select country from dropdown list" );
        selectByIndexFromDropDown(countryDropDown, 2);
    }

    public void enterCity(String cityName) {
        log.info("Enter city name " + cityName + " to username field " + cityInputBox.toString());
        sendTextToElement(cityInputBox, cityName);
    }

    public void enterAddress(String address) {
        log.info("Enter address " + address + " to username field " + address1InputBox.toString());
        sendTextToElement(address1InputBox, address);
    }

    public void enterPostCode(String postcode) {
        log.info("Enter postcode " + postcode + " to username field " + postalCodeInputBox.toString());
        sendTextToElement(postalCodeInputBox, postcode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        log.info("Enter phone number " + phoneNumber + " to username field " + billingNewAddressPhoneNumber.toString());
        sendTextToElement(billingNewAddressPhoneNumber, phoneNumber);
    }

    public void clickContinue() {
        log.info("click on continue " );
        clickOnElement(buttonContinueFromBillingAddress);
    }


    //Click on Radio Button “Next Day Air($0.00)”
    public void clickOnRadioButtonNextDayAir() {
        log.info("click on radio button next day air " );
        clickOnElement(radioButtonNextDayAir);
    }

    //    2.25 Click on “CONTINUE”
    public void clickOnButtonContinueFromShippingMethod()  {
        log.info("click on button continue from shipping method " );
        // waitUntilVisibilityOfElementLocated(By.xpath("\"//button[@class='button-1 shipping-method-next-step-button']\""),20);
        clickOnElement(buttonContinueFromShippingMethod);
    }

    //    2.26 Select Radio Button “Credit Card”
    public void clickOnRadioButtonCreditCard() {
        log.info("click on radio button credit card " );
        clickOnElement(radioButtonCreditCard);
    }

    // click on continue button --> button 2
    public void clickOnButtonContinueFromPaymentMethod() {
        log.info("click on button continue from payment method " );
        clickOnElement(buttonContinueFromPaymentMethod);
    }

    //    2.27 Select “Master card” From Select credit card dropdown
    public void clickOnDropDownSelectCard(String visa) {
        log.info("click on drop down select card " );
        selectByValueFromDropDown(dropDownSelectCard, visa);
    }

    //    2.28 Fill all the details
    public void fillInCardHolderNameInputBox(String name) {
        log.info("Enter card holder name " + name + " to username field " + cardHolderNameInputBox.toString());
        sendTextToElement(cardHolderNameInputBox, name);
    }

    // fill in card number
    public void fillInCardNumberInputBox(String cardNumber) {
        log.info("Enter card number " + cardNumber + " to username field " + cardNumberInputBox.toString());
        sendTextToElement(cardNumberInputBox, cardNumber);
    }

    // select month
    public void selectDropDownExpiryDateMonth(String month) {
        log.info("select month from dropdown " );
        selectByValueFromDropDown(dropDownExpiryDateMonth, month);
    }

    // select year
    public void selectDropDownExpiryDateYear(String year) {
        log.info("select year from dropdown " );
        selectByValueFromDropDown(dropDownExpiryDateYear, year);
    }

    // fill in card code
    public void fillInCardCodeInputBox(String cardCode) {
        log.info("Enter card code " + cardCode + " to username field " + cardCodeInputBox.toString());
        sendTextToElement(cardCodeInputBox, cardCode);
    }

    //    2.29 Click on “CONTINUE” --> button 4
    public void clickOnButtonContinueFromPaymentInformation() {
        log.info("click On button continue from payment information " );
        clickOnElement(buttonContinueFromPaymentInformation);
    }

    //    2.30 Verify “Payment Method” is “Credit Card”
    public String verifyActualTextOfCardMethod() {
        log.info("verify actual text of card method");
        return getTextFromElement(actualTextOfCardMethod);
    }

    //    2.32 Verify “Shipping Method” is “Next Day Air”
    public String verifyActualTextOfShippingMethod() {
        log.info("verify actual text of shipping method");
        return getTextFromElement(actualTextOfShippingMethod);
    }

    //    2.33 Verify Total is “$2,950.00”
    public String verifyActualTotalFinalPrice() {
        log.info("verify actual total final price");
        return getTextFromElement(actualTotalFinalPrice);
    }

    //    2.34 Click on “CONFIRM”
    public void clickOnButtonConfirm() {
        log.info("click on button confirm " );
        clickOnElement(buttonConfirm);
    }

    public void clickOnRadioButton2ndDayAir() throws InterruptedException {
        log.info("click on radio button 2nd DayAir " );
        clickOnElement(radioButton2ndDayAir);
        Thread.sleep(1000);
    }



}
