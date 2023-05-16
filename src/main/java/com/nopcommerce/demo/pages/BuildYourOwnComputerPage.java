package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerTitleLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_1")
    WebElement processorDropdownLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_2")
    WebElement ramDropdownLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_3_7")
    WebElement hddRadioButtonLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_4_9")
    WebElement osRadioButtonLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_5_10")
    WebElement msOfficeCheckBoxLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_5_12")
    WebElement totalCommanderCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath="(//span[@id='price-value-1'])[1]")
    WebElement priceTotalLocator;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton1Locator;

    @CacheLookup
    @FindBy(css = ".content")
    WebElement messageConfirmationLocator;


    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement crossToCloseLocator;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='option-list']//li//label")
    List<WebElement> radioButtonSelection;


    public String getTextFromBuildYourOwnComputer() {
        log.info("Get Text From build your own computer");
        return getTextFromElement(buildYourOwnComputerTitleLocator);
    }

    public void selectProcessor(String processor) {
        log.info("select processor" + processorDropdownLocator.toString());
        selectByVisibleTextFromDropDown(processorDropdownLocator, processor);

    }

    public void selectRAM(String ram) {
        log.info("select RAM" + ramDropdownLocator.toString());
        selectByVisibleTextFromDropDown(ramDropdownLocator, ram);
    }

    public String checkTotalPrice(){
        log.info("Check Total Price" );
        return getTextFromElement(priceTotalLocator);
    }

    public void addToCartButtonClick() {
        log.info("click on add to cart button" + addToCartButton1Locator.toString());
        clickOnElement(addToCartButton1Locator);

    }

    public String shoppingCartMessage() {
        log.info("Get shopping cart message");
        return getTextFromElement(messageConfirmationLocator);

    }

    public void crossBarClick() {
        log.info("click on cross bar" + crossToCloseLocator.toString());
        clickOnElement(crossToCloseLocator);
    }

    public void differentSelection(String visibleText) {
        for (WebElement element : radioButtonSelection) {
            System.out.println("RadioButton: " + element.getText());
            if (element.getText().equalsIgnoreCase(visibleText)) {
                clickOnElement(element);
                break;
            }
        }

    }

}
