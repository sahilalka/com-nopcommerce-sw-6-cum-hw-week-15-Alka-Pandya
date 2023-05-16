package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    public PaymentPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(css="#paymentmethod_1")
    WebElement creditCartRadioLocator;

    @CacheLookup
    @FindBy(css=".button-1.payment-method-next-step-button")
    WebElement continueButtonPaymentMethodLocator;

    @CacheLookup
    @FindBy(id="CreditCardType")
    WebElement creditCardDropdownLocator;

    @CacheLookup
    @FindBy(id="CardholderName")
    WebElement cardHolderNameFieldLocator;

    @CacheLookup
    @FindBy(id="CardNumber")
    WebElement cardNumberFieldLocator;

    @CacheLookup
    @FindBy(id="ExpireMonth")
    WebElement expireMonthDropdownLocator;

    @CacheLookup
    @FindBy(id="ExpireYear")
    WebElement expireYearDropdownLocator;
    @CacheLookup
    @FindBy(xpath="//input[@data-val-regex-pattern='^[0-9]{3,4}$']")
    WebElement cardCodeFieldLocator;

    @CacheLookup
    @FindBy(css=".button-1.payment-info-next-step-button")
    WebElement continueButtonAfterCreditCardInfoLocator;



    public void selectCreditCardRadioButton() {
        log.info("Select Credit Card Radio Button" );
        clickOnElement(creditCartRadioLocator);
    }

    public void continuePaymentButton() {
        log.info("Continue Payment Button" );
        clickOnElement(continueButtonPaymentMethodLocator);
    }

    public void selectCreditCard(int index) {
        log.info("Select Credit Card  " + index + " to Credit Card  field " + creditCardDropdownLocator.toString());
        selectByIndexFromDropDown(creditCardDropdownLocator, index);
    }

    public void cardHolderName(String name) {
        log.info("Select card Holder Name  " + name + " to Credit Card  field " + cardHolderNameFieldLocator.toString());
        sendTextToElement(cardHolderNameFieldLocator, name);
    }

    public void cardNumber(String cardNumber) {
        log.info("Select card Number   " + cardNumber + " to Credit Card  field " + cardNumberFieldLocator.toString());
        sendTextToElement(cardNumberFieldLocator, cardNumber);
    }

    public void selectExpiryMonth(String index) {
        log.info("Select Expiry Month " + index + " to Credit Card  field " + expireMonthDropdownLocator.toString());
        selectByVisibleTextFromDropDown(expireMonthDropdownLocator,index);
    }

    public void selectExpiryYear(String index)
    {
        log.info("Select Expiry Year " + index + " to Credit Card  field " + expireYearDropdownLocator.toString());
        selectByVisibleTextFromDropDown(expireYearDropdownLocator,index);
    }

    public void enterCardCode(String cardNumber) {
        log.info("Enter Card Code " + cardNumber + " to Credit Card  field " + cardCodeFieldLocator.toString());
        sendTextToElement(cardCodeFieldLocator, cardNumber);
    }

    public void paymentContinueButton(){
        log.info("Click Payment Continue Button" );
        clickOnElement(continueButtonAfterCreditCardInfoLocator);
    }

}
