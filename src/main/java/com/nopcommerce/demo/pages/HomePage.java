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

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToStoreLocator;

    @CacheLookup
    @FindBy(linkText="Electronics")
    WebElement electronicMenuLocator;

    @CacheLookup
    @FindBy(linkText="Cell phones")
    WebElement cellPhonesSubMenuLocator;



    public void selectMenu(String menu) {
        log.info("Select Menu" );
        List<WebElement> listOfMenuElements = driver.findElements(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a"));
        for (WebElement element : listOfMenuElements) {
            System.out.println(element.getText());

            if (element.getText().trim().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }
        }
    }


    public String getTextFromWelcomeStore()
    {
        log.info("Get Text From Welcome Store" );
        return getTextFromElement(welcomeToStoreLocator);
    }

    public void mouseHoverOnElectronics() {
        log.info("Mouse Hover On Electronics");
        mouseHoverToElement(electronicMenuLocator);
    }

    public void mouseHoverAndClickOnCellPhone() {
        log.info("Mouse Hover And Click OnCell Phone" );
        mouseHoverToElementAndClick(cellPhonesSubMenuLocator);
    }
    public void clickOnLogOutButtonOnHomepage() throws InterruptedException {
        clickOnElement(By.xpath("//a[normalize-space()='Log out']"));
        Thread.sleep(2000);
    }
    public void verifyCurrentUrl() {
        String actualCurrentUrl = getCurrentUrlForVerification();
        String expectedCurrentUrl = "https://demo.nopcommerce.com/";
        Assert.assertEquals(actualCurrentUrl, expectedCurrentUrl, "Error message");
    }

}
