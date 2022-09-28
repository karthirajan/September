#Author: your.email@your.domain.com
@Tv @smoke 
Feature: Tv Validation

  Scenario: Tv validation scenario
    Given User launches flipkart application
    And User handles login
    When User search tv
    And User select the tv and click add to cart
    And User doing the payment
    Then User receive the confirmation message