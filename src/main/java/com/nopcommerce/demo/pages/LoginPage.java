package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement logInLink;

    @CacheLookup
    @FindBy(css = "#Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(css = "#Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(css = ".button-1.login-button")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='termsofservice'])[1]")
    WebElement termsOfServiceCheckBoxLocator;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButtonLocator;



    public void loginLink() {
        log.info("Click On Login Link");
        clickOnElement(logInLink);
    }

    public void emailField(String email) {
        log.info("Enter email  " + email + " to Email  field " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void passwordField(String password) throws InterruptedException {
        log.info("Enter Password  " + password + " to Password  field " + passwordField.toString());
        Thread.sleep(2000);
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Click On Login Button");
        clickOnElement(loginButton);
    }

    public void checkBoxClick() {
        log.info("click on check box ");
        clickOnElement(termsOfServiceCheckBoxLocator);
    }

    public void clickCheckOut() {
        log.info("click on check out ");
        clickOnElement(checkoutButtonLocator);
    }

}
