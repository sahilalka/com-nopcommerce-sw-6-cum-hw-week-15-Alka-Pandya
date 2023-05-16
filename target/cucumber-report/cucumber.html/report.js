$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computers.feature");
formatter.feature({
  "line": 1,
  "name": "Computers Test",
  "description": "As a user I want to add product in shopping cart successfully",
  "id": "computers-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3729499700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user should be able to verify product arrange in alphabetical order on page",
  "description": "",
  "id": "computers-test;verify-user-should-be-able-to-verify-product-arrange-in-alphabetical-order-on-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \"Computer\" menu on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on \"Desktop\" tab on computer page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select sort by position \"Name: Z to A\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to verify the product will arrange in descending order",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputersSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 67718300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computer",
      "offset": 12
    }
  ],
  "location": "ComputersSteps.iClickOnMenuOnHomepage(String)"
});
formatter.result({
  "duration": 1186988900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Desktop",
      "offset": 12
    }
  ],
  "location": "ComputersSteps.iClickOnTabOnComputerPage(String)"
});
formatter.result({
  "duration": 504405000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: Z to A",
      "offset": 27
    }
  ],
  "location": "ComputersSteps.iSelectSortByPosition(String)"
});
formatter.result({
  "duration": 113980500,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iShouldBeAbleToVerifyTheProductWillArrangeInDescendingOrder()"
});
formatter.result({
  "duration": 70694900,
  "status": "passed"
});
formatter.after({
  "duration": 686439400,
  "status": "passed"
});
formatter.before({
  "duration": 1993471200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify User Should be able to add product successfully in shopping cart",
  "description": "",
  "id": "computers-test;verify-user-should-be-able-to-add-product-successfully-in-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@smoke"
    },
    {
      "line": 12,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on \"Computer\" menu on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on \"Desktop\" tab on computer page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select Sort By Position \"Name: A to Z\" ascending order",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Add to Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should be able to verify the text \"Build your own computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter below details in build your computer page",
  "rows": [
    {
      "cells": [
        "2.2 GHz Intel Pentium Dual-Core E2200",
        "8GB [+$60.00]"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select various radio buttons options",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should be able to Verify Price",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on Add TO Cart Button On Desktop Page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should be able to verify text \"The product has been added to your shopping cart on Top green Bar\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I close the bar clicking on the cross button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I MouseHover on \"Shopping cart\" and Click on \"GO TO CART\" button.",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should be able to verify Shopping Cart Text",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I change the Qty to \"2\" and Click on Update shopping Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify the Total Price after clicking on Update Button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on checkbox “I agree with the terms of service” on page",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on CheckOut button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I should be Verify the text \"Welcome, Please Sign In!\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on Checkout As a Guest Tab",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I select \"country\" From Country DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I enter below details in check out page",
  "rows": [
    {
      "cells": [
        "John",
        "Smith",
        "xyz@gmail.com",
        "London",
        "random street",
        "WE0 00T",
        "9825655114"
      ],
      "line": 37
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click on the \"Continue\" Button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click On Radio Button \"Next Day Air($0.00)\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click On the \"shippingMethodContinueButton\" Button Tab",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on the  \"selectCreditCardRadioButton\" tab button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on \"continuePaymentButton\" button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I select \"Master Card\" from credit card dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I fill below details in credit card form in payment page",
  "rows": [
    {
      "cells": [
        "Mr Smith",
        "5105105105105100",
        "12",
        "2023",
        "203"
      ],
      "line": 45
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click on payment continue button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I should be able to verify \"payment method\" is Credit Card",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I should be able to verify \"shipping method\" is Next Day Air",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I should be able to verify  \"price\" on Page",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click On \"Confirm\" button on checkOut Page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I should be able to verify \"Thank You\" text on checkOut Page",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I should be able to  verify \"Your order has been successfully processed!\" on checkout nopcommerce page",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click on \"continue\" in checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I should be able to verify text \"Welcome to our store\" on welcome checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputersSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 41900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computer",
      "offset": 12
    }
  ],
  "location": "ComputersSteps.iClickOnMenuOnHomepage(String)"
});
formatter.result({
  "duration": 935858200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Desktop",
      "offset": 12
    }
  ],
  "location": "ComputersSteps.iClickOnTabOnComputerPage(String)"
});
formatter.result({
  "duration": 471833400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: A to Z",
      "offset": 27
    }
  ],
  "location": "ComputersSteps.iSelectSortByPositionAscendingOrder(String)"
});
formatter.result({
  "duration": 99713600,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 2068410100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build your own computer",
      "offset": 37
    }
  ],
  "location": "ComputersSteps.iShouldBeAbleToVerifyTheText(String)"
});
formatter.result({
  "duration": 3000347300,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iEnterBelowDetailsInBuildYourComputerPage(DataTable)"
});
formatter.result({
  "duration": 148317000,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iSelectVariousRadioButtonsOptions()"
});
formatter.result({
  "duration": 440181700,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iShouldBeAbleToVerifyPrice()"
});
formatter.result({
  "duration": 21812000,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnAddTOCartButtonOnDesktopPage()"
});
formatter.result({
  "duration": 45692300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart on Top green Bar",
      "offset": 33
    }
  ],
  "location": "ComputersSteps.iShouldBeAbleToVerifyText(String)"
});
formatter.result({
  "duration": 445070300,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iCloseTheBarClickingOnTheCrossButton()"
});
formatter.result({
  "duration": 75697300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 17
    },
    {
      "val": "GO TO CART",
      "offset": 46
    }
  ],
  "location": "ComputersSteps.iMouseHoverOnAndClickOnButton(String,String)"
});
formatter.result({
  "duration": 1619985400,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iShouldBeAbleToVerifyShoppingCartText()"
});
formatter.result({
  "duration": 29550600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "ComputersSteps.iChangeTheQtyToAndClickOnUpdateShoppingButton(String)"
});
formatter.result({
  "duration": 568536500,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iVerifyTheTotalPriceAfterClickingOnUpdateButton()"
});
formatter.result({
  "duration": 26863800,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnCheckboxIAgreeWithTheTermsOfServiceOnPage()"
});
formatter.result({
  "duration": 52338300,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnCheckOutButton()"
});
formatter.result({
  "duration": 764395600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 29
    }
  ],
  "location": "ComputersSteps.iShouldBeVerifyTheText(String)"
});
formatter.result({
  "duration": 28790500,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnCheckoutAsAGuestTab()"
});
formatter.result({
  "duration": 820821400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "country",
      "offset": 10
    }
  ],
  "location": "ComputersSteps.iSelectFromCountryDropDown(String)"
});
formatter.result({
  "duration": 155103300,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iEnterBelowDetailsInCheckOutPage(DataTable)"
});
formatter.result({
  "duration": 496853300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Continue",
      "offset": 16
    }
  ],
  "location": "ComputersSteps.iClickOnTheButton(String)"
});
formatter.result({
  "duration": 43276700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Next Day Air($0.00)",
      "offset": 25
    }
  ],
  "location": "ComputersSteps.iClickOnRadioButton(String)"
});
formatter.result({
  "duration": 500366200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shippingMethodContinueButton",
      "offset": 16
    }
  ],
  "location": "ComputersSteps.iClickOnTheButtonTab(String)"
});
formatter.result({
  "duration": 44201900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selectCreditCardRadioButton",
      "offset": 17
    }
  ],
  "location": "ComputersSteps.iClickOnTheTabButton(String)"
});
formatter.result({
  "duration": 332448000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "continuePaymentButton",
      "offset": 12
    }
  ],
  "location": "ComputersSteps.iClickOnButton(String)"
});
formatter.result({
  "duration": 38969600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Master Card",
      "offset": 10
    }
  ],
  "location": "ComputersSteps.iSelectFromCreditCardDropdown(String)"
});
formatter.result({
  "duration": 419586700,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iFillBelowDetailsInCreditCardFormInPaymentPage(DataTable)"
});
formatter.result({
  "duration": 431867100,
  "status": "passed"
});
formatter.match({
  "location": "ComputersSteps.iClickOnPaymentContinueButton()"
});
formatter.result({
  "duration": 55782300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "payment method",
      "offset": 28
    }
  ],
  "location": "ComputersSteps.iShouldBeAbleToVerifyIsCreditCard(String)"
});
formatter.result({
  "duration": 293682100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shipping method",
      "offset": 28
    }
  ],
  "location": "ComputersSteps.iShouldBeAbleToVerifyIsNextDayAir(String)"
});
formatter.result({
  "duration": 35578300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "price",
      "offset": 29
    }
  ],
  "location": "ComputersSteps.iShouldBeAbleToVerifyOnPage(String)"
});
formatter.result({
  "duration": 38000500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Confirm",
      "offset": 12
    }
  ],
  "location": "ComputersSteps.iClickOnButtonOnCheckOutPage(String)"
});
formatter.result({
  "duration": 91480300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank You",
      "offset": 28
    }
  ],
  "location": "ComputersSteps.iShouldBeAbleToVerifyTextOnCheckOutPage(String)"
});
formatter.result({
  "duration": 768217000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order has been successfully processed!",
      "offset": 29
    }
  ],
  "location": "ComputersSteps.iShouldBeAbleToVerifyOnCheckoutNopcommercePage(String)"
});
formatter.result({
  "duration": 30321100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "continue",
      "offset": 12
    }
  ],
  "location": "ComputersSteps.iClickOnInCheckoutPage(String)"
});
formatter.result({
  "duration": 400782800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to our store",
      "offset": 33
    }
  ],
  "location": "ComputersSteps.iShouldBeAbleToVerifyTextOnWelcomeCheckoutPage(String)"
});
formatter.result({
  "duration": 42507200,
  "status": "passed"
});
formatter.after({
  "duration": 760147700,
  "status": "passed"
});
formatter.uri("electronics.feature");
formatter.feature({
  "line": 1,
  "name": "Electronics Test",
  "description": "As a user navigation to Cell Phones page",
  "id": "electronics-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1475647600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User successfully navigate to cell phones page successfully",
  "description": "",
  "id": "electronics-test;user-successfully-navigate-to-cell-phones-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on the \"Electronics\" tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on \"Cell phones\" and click",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see the text \"Cell phones\" on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "ElectronicsSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 85400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 22
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOnTheTab(String)"
});
formatter.result({
  "duration": 20036505300,
  "error_message": "org.openqa.selenium.json.JsonException: java.lang.reflect.InvocationTargetException\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d9f6b5b2444acfa2c5e7358e62f14ecd, actions {actions\u003d[org.openqa.selenium.interactions.Sequence@7e53339]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\sahil\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59097}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59097/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: d9f6b5b2444acfa2c5e7358e62f14ecd\r\n\tat org.openqa.selenium.json.JsonOutput.convertUsingMethod(JsonOutput.java:362)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$16(JsonOutput.java:154)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:287)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$22(JsonOutput.java:169)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)\r\n\tat java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)\r\n\tat java.util.Iterator.forEachRemaining(Iterator.java:116)\r\n\tat java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$23(JsonOutput.java:169)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:287)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$24(JsonOutput.java:182)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.forEach(SingletonImmutableBiMap.java:68)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$25(JsonOutput.java:177)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:287)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:278)\r\n\tat org.openqa.selenium.json.Json.toJson(Json.java:42)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:258)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:122)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:181)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:611)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:567)\r\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:536)\r\n\tat com.nopcommerce.demo.utilities.Utility.mouseHoverToElement(Utility.java:230)\r\n\tat com.nopcommerce.demo.pages.HomePage.mouseHoverOnElectronics(HomePage.java:59)\r\n\tat com.nopcommerce.demo.steps.ElectronicsSteps.iMouseHoverOnTheTab(ElectronicsSteps.java:21)\r\n\tat ✽.When I mouse hover on the \"Electronics\" tab(electronics.feature:6)\r\n\tSuppressed: org.openqa.selenium.json.JsonException: Attempting to close incomplete json stream\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\t\tat org.openqa.selenium.json.JsonOutput.close(JsonOutput.java:303)\r\n\t\tat org.openqa.selenium.json.Json.toJson(Json.java:40)\r\n\t\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:258)\r\n\t\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:122)\r\n\t\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:181)\r\n\t\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\t\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\t\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\t\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:611)\r\n\t\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:567)\r\n\t\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:536)\r\n\t\tat com.nopcommerce.demo.utilities.Utility.mouseHoverToElement(Utility.java:230)\r\n\t\tat com.nopcommerce.demo.pages.HomePage.mouseHoverOnElectronics(HomePage.java:59)\r\n\t\tat com.nopcommerce.demo.steps.ElectronicsSteps.iMouseHoverOnTheTab(ElectronicsSteps.java:21)\r\n\t\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\t\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\t\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\t\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\t\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\t\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\t\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\t\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\t\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\t\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\t\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\t\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\t\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\t\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\t\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\t\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\t\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\t\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\t\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\t\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\t\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\t\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\t\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\t\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\t\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\t\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\t\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\t\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\t\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\t\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\t\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\t\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\t\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\t\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\t\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\t\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\t\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\t\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.json.JsonOutput.convertUsingMethod(JsonOutput.java:358)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$16(JsonOutput.java:154)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:287)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$22(JsonOutput.java:169)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)\r\n\tat java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:175)\r\n\tat java.util.Iterator.forEachRemaining(Iterator.java:116)\r\n\tat java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)\r\n\tat java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$23(JsonOutput.java:169)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:287)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$24(JsonOutput.java:182)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.forEach(SingletonImmutableBiMap.java:68)\r\n\tat org.openqa.selenium.json.JsonOutput.lambda$new$25(JsonOutput.java:177)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:287)\r\n\tat org.openqa.selenium.json.JsonOutput.write(JsonOutput.java:278)\r\n\tat org.openqa.selenium.json.Json.toJson(Json.java:42)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:258)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpCommandCodec.encode(AbstractHttpCommandCodec.java:122)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:181)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:611)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:567)\r\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:536)\r\n\tat com.nopcommerce.demo.utilities.Utility.mouseHoverToElement(Utility.java:230)\r\n\tat com.nopcommerce.demo.pages.HomePage.mouseHoverOnElectronics(HomePage.java:59)\r\n\tat com.nopcommerce.demo.steps.ElectronicsSteps.iMouseHoverOnTheTab(ElectronicsSteps.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Electronics\"}\n  (Session info: chrome\u003d113.0.5672.93)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d9f6b5b2444acfa2c5e7358e62f14ecd, findElement {using\u003dlink text, value\u003dElectronics}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\sahil\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:59097}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59097/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: d9f6b5b2444acfa2c5e7358e62f14ecd\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.interactions.PointerInput$Origin.asArg(PointerInput.java:269)\r\n\tat org.openqa.selenium.interactions.PointerInput$Move.encode(PointerInput.java:218)\r\n\tat org.openqa.selenium.interactions.Sequence.encode(Sequence.java:73)\r\n\tat org.openqa.selenium.interactions.Sequence.toJson(Sequence.java:82)\r\n\t... 78 more\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 18
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOnAndClick(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 23
    }
  ],
  "location": "ElectronicsSteps.iShouldSeeTheTextOnThePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 811104100,
  "status": "passed"
});
formatter.before({
  "duration": 2179700400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should verify that the product added successfully and place order successfully",
  "description": "",
  "id": "electronics-test;user-should-verify-that-the-product-added-successfully-and-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    },
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I mouse hover on the \"Electronics\" tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I mouse hover on \"Cell phones\" and click",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see the text \"Cell phones\" on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click on the \"List View\" tab",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on the product name \"Nokia Lumia 1020\" link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I can see the text \"Nokia Lumia 1020\" on the page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I should see the price \"$349.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I change the quantity to 2",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on the \"ADD TO CART\" button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I should see the message \"The product has been added to your shopping cart\" on the top green bar",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I close the bar by clicking on the cross button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I mouse hover on \"Shopping cart\" and click on \"GO TO CART\" button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should be able to verify message \"shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I should be able to verify quantity 2",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I can see the total $698.00",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on the checkbox “I agree with the terms of service” on page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click on checkout",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I should be able to see text \"Welcome, Please Sign In!\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on register tab",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I should be able to see text Register on register page",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter email \"random email\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I fill below details in the registration form",
  "rows": [
    {
      "cells": [
        "John",
        "Smith",
        "Password1",
        "Password1"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should be able to see message \"Your registration completed\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I can see text \"Shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on login link",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I enter email \"random email\" into email field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter password \"Password1\" into password field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I click on the checkbox I agree with the terms of service",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I click on the checkout tab",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I enter email \"random email\" into the email field",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I select country from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I fill below details in form in checkout after registration",
  "rows": [
    {
      "cells": [
        "John",
        "Smith",
        "London",
        "101 House",
        "GS1 2FG",
        "02022039384"
      ],
      "line": 49
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I click on continue tab",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I click on radio button \"2nd Day Air ($0.00)\"",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I click on continue from shipping method",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I select radio button credit card",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I click on continue tab from payment method",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I select visa from select credit card dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I fill below details in credit card form",
  "rows": [
    {
      "cells": [
        "Mr Smith",
        "5105105105105100",
        "12",
        "2023",
        "203"
      ],
      "line": 57
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I click on the payment continue button",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I should be able to verify payment method is \"Credit Card\"",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I can see shipping method is \"2nd Day Air\"",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I can able to verify total \"$698.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I click on confirm button",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "I should be able to verify the text Thank You",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "I can see the message \"Your order has been successfully processed!\"",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "I click on the continue tab",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "I can able to see the text \"Welcome to our store\"",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I click on log out link",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "I am able to verify the URL \"https://demo.nopcommerce.com/\"",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "I should be able to add product successfully and placed order successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ElectronicsSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 26000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 22
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOnTheTab(String)"
});
formatter.result({
  "duration": 146212300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 18
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOnAndClick(String)"
});
formatter.result({
  "duration": 1106013700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 23
    }
  ],
  "location": "ElectronicsSteps.iShouldSeeTheTextOnThePage(String)"
});
formatter.result({
  "duration": 38010700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "List View",
      "offset": 16
    }
  ],
  "location": "ElectronicsSteps.iClickOnTheTab(String)"
});
formatter.result({
  "duration": 58181800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nokia Lumia 1020",
      "offset": 29
    }
  ],
  "location": "ElectronicsSteps.iClickOnTheProductNameLink(String)"
});
formatter.result({
  "duration": 3045403800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nokia Lumia 1020",
      "offset": 20
    }
  ],
  "location": "ElectronicsSteps.iCanSeeTheTextOnThePage(String)"
});
formatter.result({
  "duration": 29403800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$349.00",
      "offset": 24
    }
  ],
  "location": "ElectronicsSteps.iShouldSeeThePrice(String)"
});
formatter.result({
  "duration": 25485400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "ElectronicsSteps.iChangeTheQuantityTo(int)"
});
formatter.result({
  "duration": 165215600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADD TO CART",
      "offset": 16
    }
  ],
  "location": "ElectronicsSteps.iClickOnTheButton(String)"
});
formatter.result({
  "duration": 1079375800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 26
    }
  ],
  "location": "ElectronicsSteps.iShouldSeeTheMessageOnTheTopGreenBar(String)"
});
formatter.result({
  "duration": 26220600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iCloseTheBarByClickingOnTheCrossButton()"
});
formatter.result({
  "duration": 1057906500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 18
    },
    {
      "val": "GO TO CART",
      "offset": 47
    }
  ],
  "location": "ElectronicsSteps.iMouseHoverOnAndClickOnButton(String,String)"
});
formatter.result({
  "duration": 2505320500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shopping cart",
      "offset": 36
    }
  ],
  "location": "ElectronicsSteps.iShouldBeAbleToVerifyMessage(String)"
});
formatter.result({
  "duration": 22461500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 36
    }
  ],
  "location": "ElectronicsSteps.iShouldBeAbleToVerifyQuantity(int)"
});
formatter.result({
  "duration": 24964100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "698",
      "offset": 21
    },
    {
      "val": "00",
      "offset": 25
    }
  ],
  "location": "ElectronicsSteps.iCanSeeTheTotal$(int,int)"
});
formatter.result({
  "duration": 16973800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnTheCheckboxIAgreeWithTheTermsOfServiceOnPage()"
});
formatter.result({
  "duration": 49812300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCheckout()"
});
formatter.result({
  "duration": 687350400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 30
    }
  ],
  "location": "ElectronicsSteps.iShouldBeAbleToSeeText(String)"
});
formatter.result({
  "duration": 27055100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnRegisterTab()"
});
formatter.result({
  "duration": 1390518600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iShouldBeAbleToSeeTextRegisterOnRegisterPage()"
});
formatter.result({
  "duration": 21865500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random email",
      "offset": 15
    }
  ],
  "location": "ElectronicsSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 115989500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iFillBelowDetailsInTheRegistrationForm(DataTable)"
});
formatter.result({
  "duration": 260498600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 2826756400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your registration completed",
      "offset": 33
    }
  ],
  "location": "ElectronicsSteps.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 22131200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 2394875800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 16
    }
  ],
  "location": "ElectronicsSteps.iCanSeeText(String)"
});
formatter.result({
  "duration": 30470600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 380728000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random email",
      "offset": 15
    }
  ],
  "location": "ElectronicsSteps.iEnterEmailIntoEmailField(String)"
});
formatter.result({
  "duration": 124758400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password1",
      "offset": 18
    }
  ],
  "location": "ElectronicsSteps.iEnterPasswordIntoPasswordField(String)"
});
formatter.result({
  "duration": 2094878700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnLogInButton()"
});
formatter.result({
  "duration": 944240800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnTheCheckboxIAgreeWithTheTermsOfService()"
});
formatter.result({
  "duration": 70135900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnTheCheckoutTab()"
});
formatter.result({
  "duration": 1814197900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "random email",
      "offset": 15
    }
  ],
  "location": "ElectronicsSteps.iEnterEmailIntoTheEmailField(String)"
});
formatter.result({
  "duration": 188781900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iSelectCountryFromDropDown()"
});
formatter.result({
  "duration": 117899900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iFillBelowDetailsInFormInCheckoutAfterRegistration(DataTable)"
});
formatter.result({
  "duration": 498747500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinueTab()"
});
formatter.result({
  "duration": 41882100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2nd Day Air ($0.00)",
      "offset": 25
    }
  ],
  "location": "ElectronicsSteps.iClickOnRadioButton(String)"
});
formatter.result({
  "duration": 3057964200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinueFromShippingMethod()"
});
formatter.result({
  "duration": 2055682200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iSelectRadioButtonCreditCard()"
});
formatter.result({
  "duration": 549719700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnContinueTabFromPaymentMethod()"
});
formatter.result({
  "duration": 37783300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iSelectVisaFromSelectCreditCardDropdown()"
});
formatter.result({
  "duration": 339757200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iFillBelowDetailsInCreditCardForm(DataTable)"
});
formatter.result({
  "duration": 330040100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnThePaymentContinueButton()"
});
formatter.result({
  "duration": 44094400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Credit Card",
      "offset": 46
    }
  ],
  "location": "ElectronicsSteps.iShouldBeAbleToVerifyPaymentMethodIs(String)"
});
formatter.result({
  "duration": 445958800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2nd Day Air",
      "offset": 30
    }
  ],
  "location": "ElectronicsSteps.iCanSeeShippingMethodIs(String)"
});
formatter.result({
  "duration": 25302100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$698.00",
      "offset": 28
    }
  ],
  "location": "ElectronicsSteps.iCanAbleToVerifyTotal(String)"
});
formatter.result({
  "duration": 26767600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnConfirmButton()"
});
formatter.result({
  "duration": 56349500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iShouldBeAbleToVerifyTheTextThankYou()"
});
formatter.result({
  "duration": 938632500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order has been successfully processed!",
      "offset": 23
    }
  ],
  "location": "ElectronicsSteps.iCanSeeTheMessage(String)"
});
formatter.result({
  "duration": 18811300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnTheContinueTab()"
});
formatter.result({
  "duration": 404734100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to our store",
      "offset": 28
    }
  ],
  "location": "ElectronicsSteps.iCanAbleToSeeTheText(String)"
});
formatter.result({
  "duration": 37413200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnLogOutLink()"
});
formatter.result({
  "duration": 2780283200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://demo.nopcommerce.com/",
      "offset": 29
    }
  ],
  "location": "ElectronicsSteps.iAmAbleToVerifyTheURL(String)"
});
formatter.result({
  "duration": 7765600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iShouldBeAbleToAddProductSuccessfullyAndPlacedOrderSuccessfully()"
});
formatter.result({
  "duration": 15800,
  "status": "passed"
});
formatter.after({
  "duration": 742064200,
  "status": "passed"
});
formatter.uri("topmenu.feature");
formatter.feature({
  "line": 1,
  "name": "Top Menu Test",
  "description": "As a user I should navigate to homepage",
  "id": "top-menu-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2145773500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to homepage",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am able to navigate to  top menu tab page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I navigate to top menu tab page",
  "keyword": "Then "
});
formatter.match({
  "location": "ElectronicsSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 15600,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iAmAbleToNavigateToTopMenuTabPage()"
});
formatter.result({
  "duration": 928706600,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iNavigateToTopMenuTabPage()"
});
formatter.result({
  "duration": 30500,
  "status": "passed"
});
formatter.after({
  "duration": 695224900,
  "status": "passed"
});
});