@test
Feature: As a user want to authenticate in the application to check the logout feature

  Scenario Outline: Verify logout feature
    When I login with username "<USERNAME>" and password "<PASSWORD>"
    Then I should see the home page
    And I logoff swaglabs
    Then I should see the login page

  Examples:
  | USERNAME      | PASSWORD     |
  | standard_user | secret_sauce |