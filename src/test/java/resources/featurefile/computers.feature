Feature: Computers Test
  As a user I want to add product in shopping cart successfully

  @sanity @regression
  Scenario: Verify user should be able to verify product arrange in alphabetical order on page
    Given  I am on homepage
    When   I click on "Computer" menu on homepage
    And    I click on "Desktop" tab on computer page
    And    I select sort by position "Name: Z to A"
    Then   I should be able to verify the product will arrange in descending order

  @smoke @regression
  Scenario: Verify User Should be able to add product successfully in shopping cart
    Given  I am on homepage
    When   I click on "Computer" menu on homepage
    And    I click on "Desktop" tab on computer page
    And    I select Sort By Position "Name: A to Z" ascending order
    And    I click on Add to Cart Button
    And    I should be able to verify the text "Build your own computer"
    And I enter below details in build your computer page
      | 2.2 GHz Intel Pentium Dual-Core E2200 | 8GB [+$60.00] |
    And   I select various radio buttons options
    And   I should be able to Verify Price
    And   I click on Add TO Cart Button On Desktop Page
    And   I should be able to verify text "The product has been added to your shopping cart on Top green Bar"
    And   I close the bar clicking on the cross button
    And   I MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    And   I should be able to verify Shopping Cart Text
    And   I change the Qty to "2" and Click on Update shopping Button
    And   I verify the Total Price after clicking on Update Button
    And   I click on checkbox “I agree with the terms of service” on page
    And   I click on CheckOut button
    And   I should be Verify the text "Welcome, Please Sign In!"
    And   I click on Checkout As a Guest Tab
    And   I select "country" From Country DropDown
    And   I enter below details in check out page
      |John | Smith | xyz@gmail.com | London | random street | WE0 00T | 9825655114 |
    And   I click on the "Continue" Button
    And   I click On Radio Button "Next Day Air($0.00)"
    And   I click On the "shippingMethodContinueButton" Button Tab
    And   I click on the  "selectCreditCardRadioButton" tab button
    And   I click on "continuePaymentButton" button
    And   I select "Master Card" from credit card dropdown
    And   I fill below details in credit card form in payment page
      |Mr Smith|5105105105105100|12|2023|203|
    And   I click on payment continue button
    And   I should be able to verify "payment method" is Credit Card
    And   I should be able to verify "shipping method" is Next Day Air
    And   I should be able to verify  "price" on Page
    And   I click On "Confirm" button on checkOut Page
    And   I should be able to verify "Thank You" text on checkOut Page
    And   I should be able to  verify "Your order has been successfully processed!" on checkout nopcommerce page
    And   I click on "continue" in checkout page
    Then  I should be able to verify text "Welcome to our store" on welcome checkout page