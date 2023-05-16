package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletionPage extends Utility {
    private static final Logger log = LogManager.getLogger(OrderCompletionPage.class.getName());

    public OrderCompletionPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Thank you']")
    WebElement thankYouTitleLocator;

    @CacheLookup
    @FindBy(xpath="//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfullMessageLocator;

    @CacheLookup
    @FindBy(css=".button-1.order-completed-continue-button")
    WebElement continueButtonCompletedOrderLocator;





    public String getTextFromThankYouTitle() {
        log.info("Get Text From ThankYou Title" );
        return getTextFromElement(thankYouTitleLocator);
    }
    public String getTextFromOrderSuccessMessage() {
        log.info("Get Text From Order SuccessMessage" );
        return getTextFromElement(successfullMessageLocator);
    }

    public void clickOnContinueOrderCompletionButton(){
        log.info("Click On Continue Order Completion Button" );
        clickOnElement(continueButtonCompletedOrderLocator);
    }

}
