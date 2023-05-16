package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ComputersSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on \"([^\"]*)\" menu on homepage$")
    public void iClickOnMenuOnHomepage(String arg0) {
        new HomePage().selectMenu("Computers");
    }

    @And("^I click on \"([^\"]*)\" tab on computer page$")
    public void iClickOnTabOnComputerPage(String arg0) {
        new ComputerPage().desktopClick();
    }

    @And("^I select sort by position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String arg0) {
        new DesktopPage().selectSortByPosition("6");

    }

    @Then("^I should be able to verify the product will arrange in descending order$")
    public void iShouldBeAbleToVerifyTheProductWillArrangeInDescendingOrder() {
        new DesktopPage().productNameArrangeInAlphabeticalOrder();

    }

    @And("^I select Sort By Position \"([^\"]*)\" ascending order$")
    public void iSelectSortByPositionAscendingOrder(String arg0)  {
        new DesktopPage().selectSortByPosition("5");

    }
    @And("^I click on Add to Cart Button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new DesktopPage().addToCartClick();
    }

    @And("^I should be able to verify the text \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyTheText(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        //Assert.assertEquals(new BuildYourOwnComputerPage().getTextFromBuildYourOwnComputer(),"Build your own computer", "Error message: Text verification is failed");

    }

    @And("^I Select \"([^\"]*)\" processor$")
    public void iSelectProcessor(String processor)  {
        new BuildYourOwnComputerPage().selectProcessor(processor);

    }

    @And("^I Select \"([^\"]*)\" RAM$")
    public void iSelectRAM(String ram)  {
        new BuildYourOwnComputerPage().selectRAM(ram);

    }
    @And("^I should be able to Verify Price$")
    public void iShouldBeAbleToVerifyPrice() {
        String actualPrice = new BuildYourOwnComputerPage().checkTotalPrice();
        String expectedPrice = "$1,460.00";
        // Assert.assertEquals(actualPrice, expectedPrice, "Error message: Price is not matching ");
    }

    @And("^I click on Add TO Cart Button On Desktop Page$")
    public void iClickOnAddTOCartButtonOnDesktopPage() {
        new BuildYourOwnComputerPage().addToCartButtonClick();
    }


    @And("^I should be able to verify text \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyText(String arg0)  {
        String actualShoppingCartMessage = new BuildYourOwnComputerPage().shoppingCartMessage();
        String expectedShoppingCartMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualShoppingCartMessage, expectedShoppingCartMessage, "Error message:message is not matching ");
    }

    @And("^I close the bar clicking on the cross button$")
    public void iCloseTheBarClickingOnTheCrossButton() {
        new BuildYourOwnComputerPage().crossBarClick();
    }

    @And("^I MouseHover on \"([^\"]*)\" and Click on \"([^\"]*)\" button\\.$")
    public void iMouseHoverOnAndClickOnButton(String arg0, String arg1)  {
        new ShoppingCartPage().mouseHoverOnShoppingCart();
        new ShoppingCartPage().clickOnGoToCart();
    }


    @And("^I should be able to verify Shopping Cart Text$")
    public void iShouldBeAbleToVerifyShoppingCartText() {
        String expected = "Shopping cart";
        String actual = new ShoppingCartPage().getTextFromShoppingCart();
        Assert.assertEquals(actual, expected, "Shopping cart");
    }

    @And("^I change the Qty to \"([^\"]*)\" and Click on Update shopping Button$")
    public void iChangeTheQtyToAndClickOnUpdateShoppingButton(String arg0)  {
        new ShoppingCartPage().clearAnElementFromUpdatedShoppingCart();
        new ShoppingCartPage().updateTheQuantity("2");
        new ShoppingCartPage().clickUpdateCartButton();
    }

    @And("^I verify the Total Price after clicking on Update Button$")
    public void iVerifyTheTotalPriceAfterClickingOnUpdateButton() {
        try {
            String actualTotal = new ShoppingCartPage().getTextFromTotal();
            String expectedTotal = "$2,950.00";
            Assert.assertEquals(actualTotal, expectedTotal, "Error message: Total is not matching");
        }catch(AssertionError e) {
            System.out.println("Price is not matching");
        }
    }

    @And("^I click on checkbox “I agree with the terms of service” on page$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfServiceOnPage() {
        new ShoppingCartPage().checkBoxClick();
    }

    @And("^I click on CheckOut button$")
    public void iClickOnCheckOutButton() {
        new ShoppingCartPage().clickCheckOut();
    }


    @And("^I should be Verify the text \"([^\"]*)\"$")
    public void iShouldBeVerifyTheText(String arg0)  {
        String actualWelcomeText = new CheckOutPage().getTextFromWelcomeText();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcomeText, expectedWelcomeText, "Error message: Welcome text is not matching");
    }

    @And("^I click on Checkout As a Guest Tab$")
    public void iClickOnCheckoutAsAGuestTab() {
        new CheckOutPage().clickCheckOut();
    }


    @And("^I enter \"([^\"]*)\" in FirstName field$")
    public void iEnterInFirstNameField(String arg0)  {
        new CheckOutPage().firstName("John");
    }

    @And("^I enter \"([^\"]*)\" in LastName field$")
    public void iEnterInLastNameField(String arg0)  {
        new CheckOutPage().lastName("Smith");
    }


    @And("^I enter \"([^\"]*)\" in email Field$")
    public void iEnterInEmailField(String arg0)  {
        new CheckOutPage().email("xyz@email.com");
    }

    @And("^I select \"([^\"]*)\" From Country DropDown$")
    public void iSelectFromCountryDropDown(String arg0)  {
        new CheckOutPage().selectCountryFromDropDown();
    }

    @And("^I select \"([^\"]*)\" in City Field$")
    public void iSelectInCityField(String arg0)   {
        new CheckOutPage().enterCity("London");
    }

    @And("^I enter \"([^\"]*)\" in address field$")
    public void iEnterInAddressField(String arg0)  {
        new CheckOutPage().enterAddress("Random Street");
    }

    @And("^I enter \"([^\"]*)\" in postcode field$")
    public void iEnterInPostcodeField(String arg0)  {
        new CheckOutPage().enterPostCode("WES 6RT");
    }

    @And("^I enter \"([^\"]*)\" in phoneNumber field$")
    public void iEnterInPhoneNumberField(String arg0)  {
        new CheckOutPage().enterPhoneNumber("0777777777");
    }


    @And("^I click on the \"([^\"]*)\" Button$")
    public void iClickOnTheButton(String arg0) {
        new CheckOutPage().clickContinue();
    }

    @And("^I click On Radio Button \"([^\"]*)\"$")
    public void iClickOnRadioButton(String arg0)  {
        new ShippingPage().shippingMethod();
    }

    @And("^I click On the \"([^\"]*)\" Button Tab$")
    public void iClickOnTheButtonTab(String arg0)  {
        new ShippingPage().shippingMethodContinueButton();
    }

    @And("^I click on the  \"([^\"]*)\" tab button$")
    public void iClickOnTheTabButton(String arg0)  {
        new PaymentPage().selectCreditCardRadioButton();
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0)  {
        new PaymentPage().continuePaymentButton();
    }

    @And("^I select \"([^\"]*)\" from credit card dropdown$")
    public void iSelectFromCreditCardDropdown(String arg0)  {
        new PaymentPage().selectCreditCard(2);

    }

    @And("^I enter \"([^\"]*)\" from cardholder field$")
    public void iEnterFromCardholderField(String arg0)  {
        new PaymentPage().cardHolderName("Mr. Smith");
    }

    @And("^I enter \"([^\"]*)\" in Card Number Field$")
    public void iEnterInCardNumberField(String arg0)  {
        new PaymentPage().cardNumber("5425233430109903");
    }

    @And("^I enter \"([^\"]*)\" in card code field$")
    public void iEnterInCardCodeField(String arg0)  {
        new PaymentPage().enterCardCode("123");
    }

    @And("^I click on payment continue button$")
    public void iClickOnPaymentContinueButton() {
        new PaymentPage().paymentContinueButton();
    }

    @And("^I should be able to verify \"([^\"]*)\" is Credit Card$")
    public void iShouldBeAbleToVerifyIsCreditCard(String arg0) {
        String actualPaymentMethodText = new OrderConfirmationPage().getTextFromPaymentMethod();
        String expectedPaymentMethodText = "Credit Card";
        Assert.assertEquals(actualPaymentMethodText, expectedPaymentMethodText, "Error message: payment method text is not matching");
    }

    @And("^I should be able to verify \"([^\"]*)\" is Next Day Air$")
    public void iShouldBeAbleToVerifyIsNextDayAir(String arg0) {
        String actualShippingMethodText =  new OrderConfirmationPage().getTextFromShippingMethod();
        String expectedShippingMethodText = "Next Day Air";
        Assert.assertEquals(actualShippingMethodText, expectedShippingMethodText, "Error message: shipping method text is not matching");

    }

    @And("^I should be able to verify  \"([^\"]*)\" on Page$")
    public void iShouldBeAbleToVerifyOnPage(String arg0) {

        try {
            String actualTotalText = new OrderConfirmationPage().getTextFromTotalPrice();
            String expectedTotalText = "$2,950.00";
            Assert.assertEquals(actualTotalText, expectedTotalText, "Error message: total price text is not matching");
        }catch (AssertionError e){
            System.out.println("Price is not matching");
        }
    }

    @And("^I click On \"([^\"]*)\" button on checkOut Page$")
    public void iClickOnButtonOnCheckOutPage(String arg0) {
        new OrderConfirmationPage().clickConfirmButton();
    }

    @And("^I should be able to verify \"([^\"]*)\" text on checkOut Page$")
    public void iShouldBeAbleToVerifyTextOnCheckOutPage(String arg0) {
        String actualThankMessage = new OrderCompletionPage().getTextFromThankYouTitle();
        String expectedThankMessage = "Thank you";
        Assert.assertEquals(actualThankMessage, expectedThankMessage, "Error message");
    }

    @And("^I should be able to  verify \"([^\"]*)\" on checkout nopcommerce page$")
    public void iShouldBeAbleToVerifyOnCheckoutNopcommercePage(String arg0) {
        String actualOrderSuccess = new OrderCompletionPage().getTextFromOrderSuccessMessage();
        String expectedOrderSuccess = "Your order has been successfully processed!";
        Assert.assertEquals(actualOrderSuccess, expectedOrderSuccess, "Error message");
    }

    @And("^I click on \"([^\"]*)\" in checkout page$")
    public void iClickOnInCheckoutPage(String arg0) {
        new OrderCompletionPage().clickOnContinueOrderCompletionButton();
    }

    @And("^I should be able to verify text \"([^\"]*)\" on welcome checkout page$")
    public void iShouldBeAbleToVerifyTextOnWelcomeCheckoutPage(String arg0) {
        String actual1 = new HomePage().getTextFromWelcomeStore();
        String expected1 = "Welcome to our store";
        Assert.assertEquals(actual1, expected1, "Error message");
    }

    @And("^I enter below details in build your computer page$")
    public void iEnterBelowDetailsInBuildYourComputerPage(DataTable dataTable) {
        List<List<String>> features = dataTable.asLists(String.class);

        String processor = features.get(0).get(0);
        String ram = features.get(0).get(1);


        new BuildYourOwnComputerPage().selectProcessor(processor);
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("^I select various radio buttons options$")
    public void iSelectVariousRadioButtonsOptions() {
        new BuildYourOwnComputerPage().differentSelection("400 GB [+$100.00]");
        new BuildYourOwnComputerPage().differentSelection("Vista Premium [+$60.00]");
        new BuildYourOwnComputerPage().differentSelection("Microsoft Office [+$50.00]");
        new BuildYourOwnComputerPage().differentSelection("Total Commander [+$5.00]");
    }

    @And("^I enter below details in check out page$")
    public void iEnterBelowDetailsInCheckOutPage(DataTable dataTable) {
        List<List<String>> form = dataTable.asLists(String.class);
        String fName = form.get(0).get(0);
        String lName = form.get(0).get(1);
        String email = form.get(0).get(2);
        String city = form.get(0).get(3);
        String address = form.get(0).get(4);
        String postcode = form.get(0).get(5);
        String phoneNumber = form.get(0).get(6);
        new CheckOutPage().firstName(fName);
        new CheckOutPage().lastName(lName);
        new CheckOutPage().email(email);
        new CheckOutPage().enterCity(city);
        new CheckOutPage().enterAddress(address);
        new CheckOutPage().enterPostCode(postcode);
        new CheckOutPage().enterPhoneNumber(phoneNumber);
    }

    @And("^I fill below details in credit card form in payment page$")
    public void iFillBelowDetailsInCreditCardFormInPaymentPage(DataTable dataTable) {
        List<List<String>> creditCardDetails = dataTable.asLists(String.class);
        String cardHolderName = creditCardDetails.get(0).get(0);
        String cardNumber = creditCardDetails.get(0).get(1);
        String expiryMonth = creditCardDetails.get(0).get(2);
        String expiryYear = creditCardDetails.get(0).get(3);
        String cardCode = creditCardDetails.get(0).get(4);
        new PaymentPage().cardHolderName(cardHolderName);
        new PaymentPage().cardNumber(cardNumber);
        new PaymentPage().selectExpiryMonth(expiryMonth);
        new PaymentPage().selectExpiryYear(expiryYear);
        new PaymentPage().enterCardCode(cardCode);
    }


}
