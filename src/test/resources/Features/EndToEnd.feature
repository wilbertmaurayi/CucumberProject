@EndToEnd
Feature: EndToEnd

  Scenario: As a user i want to be able to login to source demo
    Given I am on the Login Page
    And I enter the username admin
    And I enter the password admin
    When I click login button
    Then I must be directed to the Products Page
    And I click the Sauce Labs Backpack

