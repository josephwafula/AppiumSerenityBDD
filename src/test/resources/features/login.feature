@test
Feature: As a user want to authenticate in the application to check my credentials

  Scenario Outline: Login with valid username and password
    When I login with username "<USERNAME>" and password "<PASSWORD>"
    Then I should see the home page

    Examples:
      | USERNAME      | PASSWORD     |
      | standard_user | secret_sauce |