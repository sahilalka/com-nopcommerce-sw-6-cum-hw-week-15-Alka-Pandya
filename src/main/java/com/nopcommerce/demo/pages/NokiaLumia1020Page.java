package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NokiaLumia1020Page extends Utility {
    private static final Logger log = LogManager.getLogger(NokiaLumia1020Page.class.getName());

    public NokiaLumia1020Page() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement TitleTextOfProductNokiaLumia1020Page;

    @CacheLookup
    @FindBy(xpath="//span[@id='price-value-20']")
    WebElement PriceOfProductNokiaLumia1020;

    @CacheLookup
    @FindBy(xpath="(//input[@id='product_enteredQuantity_20'])[1]")
    WebElement QtyProductNokiaLumia1020;

    @CacheLookup
    @FindBy(xpath="(//button[@id='add-to-cart-button-20'])[1]")
    WebElement ButtonAddToCartFromPageNokiaLumia1020;

    @CacheLookup
    @FindBy(xpath="//p[@class='content']")
    WebElement MessageOfProductBeingInShoppingCart;

    @CacheLookup
    @FindBy(xpath="//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement CrossFromMessage;

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Shopping cart')]")
    WebElement ShoppingCartLinkFromNokiaLumia1020Page;



    public String actualTitleTextOfProductNokiaLumia1020Page() {
        log.info("Actual Title Text Of Product NokiaLumia1020Page" );
        return getTextFromElement(TitleTextOfProductNokiaLumia1020Page);
    }

    public String actualPriceOfProductNokiaLumia1020() {
        log.info("Actual Price  Of Product NokiaLumia1020" );
        return getTextFromElement(PriceOfProductNokiaLumia1020);
    }

    public void clearAnElementBeforeEnteringQty() {
        log.info("Clear An Element Before Entering Qty" );
        clearValue(QtyProductNokiaLumia1020);
    }

    public void updateTheQuantity(String qty) {
        log.info("Update the Quantity  " + qty + "to Quantity Field" + QtyProductNokiaLumia1020.toString());
        sendTextToElement(QtyProductNokiaLumia1020, qty);
    }

    public void clickOnButtonAddToCartFromPageNokiaLumia1020() throws InterruptedException {
        log.info("Click On Button Add To Cart From Page NokiaLumia1020" );
        clickOnElement(ButtonAddToCartFromPageNokiaLumia1020);
        Thread.sleep(1000);
    }

    public String actualMessageOfProductBeingInShoppingCart() throws InterruptedException {
        log.info("Actual Message Of Product Being In Shopping Cart" );
        return getTextFromElement(MessageOfProductBeingInShoppingCart);
    }

    public void clickOnCrossFromMessage() throws InterruptedException {
        log.info("Click On Cross From Message" );
        clickOnElement(CrossFromMessage);
        Thread.sleep(1000);
    }

    public void hoverToShoppingCartAndClickOnAddToCart() throws InterruptedException {
        log.info("Hover To Shopping Cart And Click On Add To Cart" );
        mouseHoverToElementAndClick(ShoppingCartLinkFromNokiaLumia1020Page);
        Thread.sleep(2000);
    }

}
