package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ElectronicsSteps {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
    }

    //Mouse Hover on “Electronics” Tab
    @When("^I mouse hover on the \"([^\"]*)\" tab$")
    public void iMouseHoverOnTheTab(String arg0) {
        new HomePage().mouseHoverOnElectronics();
    }

    //Mouse Hover on “Cell phones” and click
    @And("^I mouse hover on \"([^\"]*)\" and click$")
    public void iMouseHoverOnAndClick(String arg0) {
        new HomePage().mouseHoverAndClickOnCellPhone();
    }

    //Verify the text “Cell phones”
    @Then("^I should see the text \"([^\"]*)\" on the page$")
    public void iShouldSeeTheTextOnThePage(String arg0) {
        String expectedMessage = "Cell phones";
        String actualMessage = new CellPhonePage().actualPageTitleTextOfCellPhonePage();
        Assert.assertEquals(expectedMessage, actualMessage, "Error message");

    }

    //Click on List View Tab
    @And("^I click on the \"([^\"]*)\" tab$")
    public void iClickOnTheTab(String arg0) {
        new CellPhonePage().clickOnListViewIcon();
    }

    //Click on product name “Nokia Lumia 1020” link
    @And("^I click on the product name \"([^\"]*)\" link$")
    public void iClickOnTheProductNameLink(String arg0) throws InterruptedException {
        new CellPhonePage().clickOnProductNokiaLumia1020();
    }

    //Verify the text “Nokia Lumia 1020”
    @Then("^I can see the text \"([^\"]*)\" on the page$")
    public void iCanSeeTheTextOnThePage(String arg0) {
        String expectedTextOfNokiaLumia1020Page = "Nokia Lumia 1020";
        Assert.assertEquals(new NokiaLumia1020Page().actualTitleTextOfProductNokiaLumia1020Page(), expectedTextOfNokiaLumia1020Page, "Nokia Lumia 1020 page title text not matched");

    }

    //Verify the price “$349.00”
    @And("^I should see the price \"([^\"]*)\"$")
    public void iShouldSeeThePrice(String arg0) {
        String expectedPriceOfNokiaLumia1020 = "$349.00";
        Assert.assertEquals(new NokiaLumia1020Page().actualPriceOfProductNokiaLumia1020(), expectedPriceOfNokiaLumia1020, "Price of nokia lumia 1020 not matched");
    }

    //Change quantity to 2
    @And("^I change the quantity to (\\d+)$")
    public void iChangeTheQuantityTo(int arg0) {
        new NokiaLumia1020Page().clearAnElementBeforeEnteringQty();
        new NokiaLumia1020Page().updateTheQuantity("2");

    }

    //Click on “ADD TO CART” tab
    @And("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String arg0) throws InterruptedException {
        new NokiaLumia1020Page().clickOnButtonAddToCartFromPageNokiaLumia1020();
    }

    //Verify the Message "The product has been added to your shopping cart" on Top green Bar
    @And("^I should see the message \"([^\"]*)\" on the top green bar$")
    public void iShouldSeeTheMessageOnTheTopGreenBar(String arg0) throws InterruptedException {
        String expectedMessageOfProductBeingInShoppingCart = "The product has been added to your shopping cart";
        Assert.assertEquals(new NokiaLumia1020Page().actualMessageOfProductBeingInShoppingCart(), expectedMessageOfProductBeingInShoppingCart, "message 'The product has been added to your shopping cart' not displayed");
    }

    //After that close the bar clicking on the cross button.
    @And("^I close the bar by clicking on the cross button$")
    public void iCloseTheBarByClickingOnTheCrossButton() throws InterruptedException {
        new NokiaLumia1020Page().clickOnCrossFromMessage();
    }

    //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    @And("^I mouse hover on \"([^\"]*)\" and click on \"([^\"]*)\" button$")
    public void iMouseHoverOnAndClickOnButton(String arg0, String arg1) throws InterruptedException {
        new NokiaLumia1020Page().hoverToShoppingCartAndClickOnAddToCart();
    }

    @And("^I should be able to verify message \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyMessage(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getTextFromShoppingCart(), "Shopping cart", "Shopping cart title message not displayed");
    }

    //Verify the quantity is 2
    @And("^I should be able to verify quantity (\\d+)$")
    public void iShouldBeAbleToVerifyQuantity(int arg0) {
        Assert.assertEquals(new ShoppingCartPage().verifyQuantity(), "2", "Qty of Nokia lumia in shopping cart not matched");
    }

    //Verify the Total $698.00
    @And("^I can see the total \\$(\\d+)\\.(\\d+)$")
    public void iCanSeeTheTotal$(int arg0, int arg1) {
        Assert.assertEquals(new ShoppingCartPage().getTextFromTotal(), "$698.00", "Total amount not matched");
    }

    @And("^I click on the checkbox “I agree with the terms of service” on page$")
    public void iClickOnTheCheckboxIAgreeWithTheTermsOfServiceOnPage() {
        new ShoppingCartPage().checkBoxClick();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new ShoppingCartPage().clickCheckOut();
    }


    @And("^I should be able to see text \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeText(String arg0) {
        Assert.assertEquals(new CheckOutPage().getTextFromWelcomeText(), "Welcome, Please Sign In!", "Error message: not matching");
    }

    @And("^I click on register tab$")
    public void iClickOnRegisterTab() throws InterruptedException {
        new CheckOutPage().clickOnButtonRegister();
    }

    @And("^I should be able to see text Register on register page$")
    public void iShouldBeAbleToSeeTextRegisterOnRegisterPage() {
        Assert.assertEquals(new RegisterPage().actualTitleTextOfRegisterPage(), "Register", "Title of register page not matched");
    }

    @And("^I fill all the mandatory fields$")
    public void iFillAllTheMandatoryFields() {

    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String fName) {
        new RegisterPage().fillInFirstName(fName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lName) {
        new RegisterPage().fillInLastName(lName);

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) {
        new RegisterPage().fillInEmail();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new RegisterPage().fillInPassword(password);

    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String password) {
        new RegisterPage().fillInConfirmPassword(password);

    }

    //Click on “REGISTER” Button
    @And("^I click on register button$")
    public void iClickOnRegisterButton() throws InterruptedException {
        new RegisterPage().clickOnButtonRegisterNextStep();
    }

    @And("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String arg0) {
        Assert.assertEquals(new RegistrationSuccessfulPage().actualMessageOfSuccessfulRegistration(), "Your registration completed", "Successful registration message not displayed");

    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() throws InterruptedException {
        new RegistrationSuccessfulPage().clickOnButtonContinue();
    }

    @And("^I can see text \"([^\"]*)\"$")
    public void iCanSeeText(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getTextFromShoppingCart(), "Shopping cart", "Shopping cart title message not displayed");

    }

    @And("^I click on login link$")
    public void iClickOnLoginLink() {
        new LoginPage().loginLink();
    }

    @And("^I enter email \"([^\"]*)\" into email field$")
    public void iEnterEmailIntoEmailField(String arg0) {
        new LoginPage().emailField(RegisterPage.generatedEmail);

    }

    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password) throws InterruptedException {
        new LoginPage().passwordField(password);

    }

    @And("^I click on log in button$")
    public void iClickOnLogInButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I click on the checkbox I agree with the terms of service$")
    public void iClickOnTheCheckboxIAgreeWithTheTermsOfService() {
        new LoginPage().checkBoxClick();
    }

    @And("^I click on the checkout tab$")
    public void iClickOnTheCheckoutTab() {
        new LoginPage().clickCheckOut();
    }

    @And("^I fill all mandatory fields$")
    public void iFillAllMandatoryFields() {
    }

    @And("^I enter first name \"([^\"]*)\" in to firstname field$")
    public void iEnterFirstNameInToFirstnameField(String fName) {
        new CheckOutAfterRegistrationPage().firstName(fName);
    }

    @And("^I enter last name \"([^\"]*)\"in to lastname field$")
    public void iEnterLastNameInToLastnameField(String lName) {
        new CheckOutAfterRegistrationPage().lastName(lName);
    }

    @And("^I enter email \"([^\"]*)\" into the email field$")
    public void iEnterEmailIntoTheEmailField(String arg0) {
        new CheckOutAfterRegistrationPage().email(RegisterPage.generatedEmail);

    }

    @And("^I select country from drop down$")
    public void iSelectCountryFromDropDown() {
        new CheckOutAfterRegistrationPage().selectCountryFromDropDown();
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        new CheckOutAfterRegistrationPage().enterCity(city);

    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String address) {
        new CheckOutAfterRegistrationPage().enterAddress(address);

    }

    @And("^I enter post code \"([^\"]*)\"$")
    public void iEnterPostCode(String postcode) {
        new CheckOutAfterRegistrationPage().enterPostCode(postcode);

    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phoneNumber) {
        new CheckOutAfterRegistrationPage().enterPhoneNumber(phoneNumber);

    }

    @And("^I click on continue tab$")
    public void iClickOnContinueTab() {
        new CheckOutAfterRegistrationPage().clickContinue();
    }

    @And("^I click on radio button \"([^\"]*)\"$")
    public void iClickOnRadioButton(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        new CheckOutAfterRegistrationPage().clickOnRadioButton2ndDayAir();

    }

    @And("^I click on continue from shipping method$")
    public void iClickOnContinueFromShippingMethod() throws InterruptedException {
        Thread.sleep(2000);
        new CheckOutAfterRegistrationPage().clickOnButtonContinueFromShippingMethod();
    }

    @And("^I select radio button credit card$")
    public void iSelectRadioButtonCreditCard() {
        new CheckOutAfterRegistrationPage().clickOnRadioButtonCreditCard();
    }

    @And("^I click on continue tab from payment method$")
    public void iClickOnContinueTabFromPaymentMethod() {
        new CheckOutAfterRegistrationPage().clickOnButtonContinueFromPaymentMethod();
    }

    @And("^I select visa from select credit card dropdown$")
    public void iSelectVisaFromSelectCreditCardDropdown() {
        new CheckOutAfterRegistrationPage().clickOnDropDownSelectCard("visa");
    }

    @And("^Fill all the details$")
    public void fillAllTheDetails() {
    }

    @And("^I enter card holder name \"([^\"]*)\"$")
    public void iEnterCardHolderName(String name) {
        new CheckOutAfterRegistrationPage().fillInCardHolderNameInputBox(name);

    }

    @And("^I enter card number \"([^\"]*)\"$")
    public void iEnterCardNumber(String number) {
        new CheckOutAfterRegistrationPage().fillInCardNumberInputBox(number);

    }

    @And("^I select month \"([^\"]*)\" from dropdown$")
    public void iSelectMonthFromDropdown(String month) {
        new CheckOutAfterRegistrationPage().selectDropDownExpiryDateMonth(month);

    }

    @And("^I select year \"([^\"]*)\" from drop down$")
    public void iSelectYearFromDropDown(String year) {
        new CheckOutAfterRegistrationPage().selectDropDownExpiryDateYear(year);

    }

    @And("^I enter card code \"([^\"]*)\"$")
    public void iEnterCardCode(String code) {
        new CheckOutAfterRegistrationPage().fillInCardCodeInputBox(code);

    }

    @And("^I click on the payment continue button$")
    public void iClickOnThePaymentContinueButton() {
        new CheckOutAfterRegistrationPage().clickOnButtonContinueFromPaymentInformation();
    }

    @And("^I should be able to verify payment method is \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyPaymentMethodIs(String arg0) {
        Assert.assertEquals(new CheckOutAfterRegistrationPage().verifyActualTextOfCardMethod(), "Credit Card", "Text of type of payment method not displayed");

    }

    @And("^I can see shipping method is \"([^\"]*)\"$")
    public void iCanSeeShippingMethodIs(String arg0) {
        Assert.assertEquals(new CheckOutAfterRegistrationPage().verifyActualTextOfShippingMethod(), "2nd Day Air", "Text of shipping method not displayed");

    }

    @And("^I can able to verify total \"([^\"]*)\"$")
    public void iCanAbleToVerifyTotal(String arg0) {
        Assert.assertEquals(new CheckOutAfterRegistrationPage().verifyActualTotalFinalPrice(), "$698.00", "Total final price not displayed");

    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton() {
        new CheckOutAfterRegistrationPage().clickOnButtonConfirm();
    }

    @And("^I should be able to verify the text Thank You$")
    public void iShouldBeAbleToVerifyTheTextThankYou() {
        Assert.assertEquals(new OrderCompletionPage().getTextFromThankYouTitle(), "Thank you", "after payment page title not displayed");
    }

    @And("^I can see the message \"([^\"]*)\"$")
    public void iCanSeeTheMessage(String arg0) {
        Assert.assertEquals(new OrderCompletionPage().getTextFromOrderSuccessMessage(), "Your order has been successfully processed!", "After payment successfull message not displayed");

    }

    @And("^I click on the continue tab$")
    public void iClickOnTheContinueTab() {
        new OrderCompletionPage().clickOnContinueOrderCompletionButton();
    }

    @And("^I can able to see the text \"([^\"]*)\"$")
    public void iCanAbleToSeeTheText(String arg0) {
        Assert.assertEquals(new HomePage().getTextFromWelcomeStore(), "Welcome to our store", "home page welcome message not displayed");

    }

    @And("^I click on log out link$")
    public void iClickOnLogOutLink() throws InterruptedException {
        new HomePage().clickOnLogOutButtonOnHomepage();
    }

    @And("^I am able to verify the URL \"([^\"]*)\"$")
    public void iAmAbleToVerifyTheURL(String arg0) {
        new HomePage().verifyCurrentUrl();

    }

    @Then("^I should be able to add product successfully and placed order successfully$")
    public void iShouldBeAbleToAddProductSuccessfullyAndPlacedOrderSuccessfully() {
    }

    @And("^I fill below details in the registration form$")
    public void iFillBelowDetailsInTheRegistrationForm(DataTable dataTable) {
        List<List<String>> form = dataTable.asLists(String.class);
        String fName = form.get(0).get(0);
        String lName = form.get(0).get(1);
        String password = form.get(0).get(2);
        String cPassword = form.get(0).get(3);

        new RegisterPage().fillInFirstName(fName);
        new RegisterPage().fillInLastName(lName);
        new RegisterPage().fillInPassword(password);
        new RegisterPage().fillInConfirmPassword(cPassword);
    }

    @And("^I fill below details in form in checkout after registration$")
    public void iFillBelowDetailsInFormInCheckoutAfterRegistration(DataTable dataTable) {
        List<List<String>> form = dataTable.asLists(String.class);
        String fName = form.get(0).get(0);
        String lName = form.get(0).get(1);
        String city = form.get(0).get(2);
        String address = form.get(0).get(3);
        String postcode = form.get(0).get(4);
        String phoneNumber = form.get(0).get(5);

        new CheckOutAfterRegistrationPage().firstName(fName);
        new CheckOutAfterRegistrationPage().lastName(lName);
        new CheckOutAfterRegistrationPage().enterCity(city);
        new CheckOutAfterRegistrationPage().enterAddress(address);
        new CheckOutAfterRegistrationPage().enterPostCode(postcode);
        new CheckOutAfterRegistrationPage().enterPhoneNumber(phoneNumber);

    }

    @And("^I fill below details in credit card form$")
    public void iFillBelowDetailsInCreditCardForm(DataTable dataTable) {
        List<List<String>> creditCardDetails = dataTable.asLists(String.class);
        String cardHolderName = creditCardDetails.get(0).get(0);
        String cardNumber = creditCardDetails.get(0).get(1);
        String expiryMonth = creditCardDetails.get(0).get(2);
        String expiryYear = creditCardDetails.get(0).get(3);
        String cardCode = creditCardDetails.get(0).get(4);
        new CheckOutAfterRegistrationPage().fillInCardHolderNameInputBox(cardHolderName);
        new CheckOutAfterRegistrationPage().fillInCardNumberInputBox(cardNumber);
        new CheckOutAfterRegistrationPage().selectDropDownExpiryDateMonth(expiryMonth);
        new CheckOutAfterRegistrationPage().selectDropDownExpiryDateYear(expiryYear);
        new CheckOutAfterRegistrationPage().fillInCardCodeInputBox(cardCode);
    }


}
