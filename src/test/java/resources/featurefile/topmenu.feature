Feature: Top Menu Test
  As a user I should navigate to homepage

  @sanity @regression
  Scenario: User should navigate to homepage
    Given  I am on the homepage
    When   I am able to navigate to  top menu tab page
    Then   I navigate to top menu tab page
