package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartTitleLocator;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement qtyFieldLocator;

    @CacheLookup
    @FindBy(css = ".cart-label")
    WebElement shoppingCartLocator;

    @CacheLookup
    @FindBy(css = ".button-1.cart-button")
    WebElement goToCartButtonLocator;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']//td[@class='cart-total-right']/span")
    WebElement totalPriceLocator;

    @CacheLookup
    @FindBy(xpath ="(//input[@id='termsofservice'])[1]")
    WebElement termsOfServiceCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButtonLocator;

    @CacheLookup
    @FindBy(css = "#updatecart")
    WebElement updateShoppingCartButtonLocator;
    @CacheLookup
    @FindBy(xpath= "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(className = "qty-input")
    WebElement qtyField1Locator;


    public String getTextFromShoppingCart() {
        log.info("Get text from shopping cart");
        return getTextFromElement(shoppingCartTitleLocator);
    }

    public void mouseHoverOnShoppingCart() {
        log.info("Mouse hover on shopping cart");
        mouseHoverToElement(shoppingCartLocator);
    }

    public void clickOnGoToCart() {
        log.info("click On go to cart " );
        clickOnElement(goToCartButtonLocator);
    }

    public void updateTheQuantity(String qty) {
        log.info("Update the quantity " + qty + " to quantity field " + qtyFieldLocator.toString());
        sendTextToElement(qtyFieldLocator, qty);
    }

    public void clickUpdateCartButton() {
        log.info("click On update cart button " );
        clickOnElement(updateShoppingCartButtonLocator);
    }

    public void clearAnElementFromUpdatedShoppingCart() {
        log.info("clear an element from updated shopping cart " );
        //        WebElement element = driver.findElement(qtyFieldLocator);
        //element.clear();
        clearValue(qtyFieldLocator);
    }

    public String getTextFromTotal() {
        log.info("Get text from total");
        return getTextFromElement(totalPriceLocator);

    }

    public void checkBoxClick() {
        log.info("click on check box " );
        clickOnElement(termsOfServiceCheckBoxLocator);
    }

    public void clickCheckOut() {
        log.info("click on check out " );
        clickOnElement(checkoutButtonLocator);
    }
    public String verifyTextShoppingCart(){
        log.info("verifyTextShoppingCart" );
        return getTextFromElement( shoppingCartText);
    }

    public String verifyQuantity() {
        log.info("verifyQuantity " );
        return driver.findElement(By.className("qty-input")).getAttribute("value");

    }

}
