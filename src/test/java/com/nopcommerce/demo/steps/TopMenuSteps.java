package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TopMenuSteps {
    @When("^I am able to navigate to  top menu tab page$")
    public void iAmAbleToNavigateToTopMenuTabPage() {
        new HomePage().selectMenu("Computers");
    }

    @Then("^I navigate to top menu tab page$")
    public void iNavigateToTopMenuTabPage() {
    }

}
