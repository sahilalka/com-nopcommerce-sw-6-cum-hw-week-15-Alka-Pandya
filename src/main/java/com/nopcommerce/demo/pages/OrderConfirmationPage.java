package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends Utility {
    private static final Logger log = LogManager.getLogger(OrderConfirmationPage.class.getName());

    public OrderConfirmationPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//li[@class='payment-method']//span[2]")
    WebElement paymentMethodTextLocator;

    @CacheLookup
    @FindBy(xpath="//li[@class='shipping-method']//span[2]")
    WebElement shippingMethodTextLocator;

    @CacheLookup
    @FindBy(xpath="//tr[@class='order-total']/td[@class='cart-total-right']/span")
    WebElement totalPriceLocator;

    @CacheLookup
    @FindBy(css=".button-1.confirm-order-next-step-button")
    WebElement confirmButtonLocator;



    public String getTextFromPaymentMethod() {
        log.info("Get Text From Payment Method" );
        return getTextFromElement(paymentMethodTextLocator);
    }

    public String getTextFromShippingMethod()
    {
        log.info("Get Text From Shipping Method" );
        return getTextFromElement(shippingMethodTextLocator);
    }

    public String getTextFromTotalPrice() {
        log.info("Get Text From Total Price" );
        return getTextFromElement(totalPriceLocator);
    }

    public void clickConfirmButton() {
        log.info("Click On Confirm Button" );
        clickOnElement(confirmButtonLocator);

    }

}
