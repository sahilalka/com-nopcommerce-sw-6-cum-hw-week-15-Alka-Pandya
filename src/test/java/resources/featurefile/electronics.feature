Feature: Electronics Test
  As a user navigation to Cell Phones page
  @sanity @regression
  Scenario: User successfully navigate to cell phones page successfully
    Given I am on the homepage
    When  I mouse hover on the "Electronics" tab
    And   I mouse hover on "Cell phones" and click
    Then  I should see the text "Cell phones" on the page

  @smoke @regression
  Scenario: User should verify that the product added successfully and place order successfully
    Given I am on the homepage
    When  I mouse hover on the "Electronics" tab
    And   I mouse hover on "Cell phones" and click
    Then  I should see the text "Cell phones" on the page
    And   I click on the "List View" tab
    And   I click on the product name "Nokia Lumia 1020" link
    Then  I can see the text "Nokia Lumia 1020" on the page
    And   I should see the price "$349.00"
    And   I change the quantity to 2
    And   I click on the "ADD TO CART" button
    And   I should see the message "The product has been added to your shopping cart" on the top green bar
    And   I close the bar by clicking on the cross button
    And   I mouse hover on "Shopping cart" and click on "GO TO CART" button
    And   I should be able to verify message "shopping cart"
    And   I should be able to verify quantity 2
    And   I can see the total $698.00
    And   I click on the checkbox “I agree with the terms of service” on page
    And   I click on checkout
    And   I should be able to see text "Welcome, Please Sign In!"
    And   I click on register tab
    And   I should be able to see text Register on register page
    And   I enter email "random email"
    And   I fill below details in the registration form
      | John | Smith | Password1 | Password1 |
    And   I click on register button
    And   I should be able to see message "Your registration completed"
    And   I click on continue button
    And   I can see text "Shopping cart"
    And   I click on login link
    And   I enter email "random email" into email field
    And   I enter password "Password1" into password field
    And   I click on log in button
    And   I click on the checkbox I agree with the terms of service
    And   I click on the checkout tab
    And   I enter email "random email" into the email field
    And   I select country from drop down
    And   I fill below details in form in checkout after registration
      |John|Smith|London|101 House|GS1 2FG|02022039384|
    And   I click on continue tab
    And   I click on radio button "2nd Day Air ($0.00)"
    And   I click on continue from shipping method
    And   I select radio button credit card
    And   I click on continue tab from payment method
    And   I select visa from select credit card dropdown
    And   I fill below details in credit card form
      |Mr Smith|5105105105105100|12|2023|203|
    And   I click on the payment continue button
    And   I should be able to verify payment method is "Credit Card"
    And   I can see shipping method is "2nd Day Air"
    And   I can able to verify total "$698.00"
    And   I click on confirm button
    And   I should be able to verify the text Thank You
    And   I can see the message "Your order has been successfully processed!"
    And   I click on the continue tab
    And   I can able to see the text "Welcome to our store"
    And   I click on log out link
    And   I am able to verify the URL "https://demo.nopcommerce.com/"
    Then  I should be able to add product successfully and placed order successfully
