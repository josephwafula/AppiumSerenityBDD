@test
Feature: As a user want to add sauce_labs_backpack to my shopping cart

  Scenario Outline: Add Sauce Labs Backpack to Cart
    When I login with username "<USERNAME>" and password "<PASSWORD>"
    And I add Sauce Labs Backpack to cart
    Then I should see sauce_labs_backpack in shopping cart

    Examples:
      | USERNAME      | PASSWORD     |
      | standard_user | secret_sauce |