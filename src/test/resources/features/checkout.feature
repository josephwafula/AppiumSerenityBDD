@test
Feature: As a user want to purchase sauce_labs_backpack

  Scenario Outline: Checkout Sauce Labs Backpack from the store
    When I login with username "<USERNAME>" and password "<PASSWORD>"
    And I add Sauce Labs Backpack to cart
    And I checkout with firstname "<FIRSTNAME>", lastname "<LASTNAME>" and zipcode "<ZIPCODE>"
    Then I should see sauce_labs_backpack in checkout confirmation page

  Examples:
  | USERNAME      | PASSWORD     | FIRSTNAME | LASTNAME | ZIPCODE |
  | standard_user | secret_sauce | Tobi      | Maguire  |25412    |
