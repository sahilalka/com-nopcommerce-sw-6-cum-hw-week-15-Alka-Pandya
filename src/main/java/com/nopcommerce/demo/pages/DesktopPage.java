package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//select[@id='products-orderby']")
    WebElement sortByPosition;

    @CacheLookup
    @FindBy(xpath="//h2[@class='product-title']/a")
    List<WebElement> productArrangement;

    @CacheLookup
    @FindBy(xpath="//div[@class='details']//button[@type='button']")
    WebElement addToCart;


    public void selectSortByPosition(String value) {
        log.info("Select Sort By Position" );
        selectByValueFromDropDown(sortByPosition, value);
    }

    public void productNameArrangeInAlphabeticalOrder() {
        log.info("Products arranged in alphabetical order" );
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(productArrangement);
        System.out.println("actual list: " + actualList);
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(productArrangement);
        System.out.println("Expected list of products: " + expectedList);

        Collections.sort(expectedList);
        System.out.println("expected= " + expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not arranged in descending order");
    }


    public List<WebElement> returnListOfProductNamesElementsLocator() {
        log.info("Return List of Product Name Elements" );
        List<WebElement> listOfElement = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        return listOfElement;
    }


    public void addToCartClick() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Click On Add To Cart" );
        clickOnElement(addToCart);
    }

}
