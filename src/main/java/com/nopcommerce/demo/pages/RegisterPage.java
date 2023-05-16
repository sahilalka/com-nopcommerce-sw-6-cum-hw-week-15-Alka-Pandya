package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import net.bytebuddy.utility.RandomString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    public static String generatedEmail;


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement titleTextOfRegisterPage;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordInputBox;

    @CacheLookup
    @FindBy(css = ".button-1.register-next-step-button")
    WebElement buttonRegister;


    public void fillInFirstName(String fName){
        log.info("Enter first name " + fName + " to username field " + firstNameInputBox.toString());
        sendTextToElement(firstNameInputBox, fName);
    }

    public void fillInLastName(String lName){
        log.info("Enter last name " + lName + " to username field " + lastNameInputBox.toString());
        sendTextToElement(lastNameInputBox, lName);
    }

    public void fillInEmail(){
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "mocky" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
        log.info("Enter email " + emailInputBox.toString());
        sendTextToElement(emailInputBox, generatedEmail);
    }
    public void fillInPassword(String password){
        log.info("Enter password " + password + " to password field " + passwordInputBox.toString());
        sendTextToElement(passwordInputBox, password);
    }

    public void fillInConfirmPassword(String confirmPassword){
        log.info("Enter confirm password " + confirmPassword + " to confirm password field " + confirmPasswordInputBox.toString());
        sendTextToElement(confirmPasswordInputBox, confirmPassword);
    }

    public void clickOnButtonRegisterNextStep() throws InterruptedException {
        log.info("click on button register next step " );
        clickOnElement(buttonRegister);
        Thread.sleep(2000);
    }

    public String actualTitleTextOfRegisterPage() {
        log.info("get actual title text of register page");
        return getTextFromElement(titleTextOfRegisterPage);
    }

}
