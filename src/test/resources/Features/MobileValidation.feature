#Author: karthi@your.domain.com
@Mobile @smoke
Feature: Mobile Validation

Background:
    Given User launches flipkart application
    And User handles login

  Scenario: Mobile validation scenario
    When User search mobile
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

@list @sanity
  Scenario: Mobile validation scenario by using list
    When User search mobile by using OneD list
      | realme | iPhone | SAMSUNG |
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

@map @sanity
  Scenario: Mobile validation scenario by using map
    When User search mobile by using OneD map
      | A | realme  |
      | B | iPhone  |
      | C | SAMSUNG |
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

  Scenario Outline: 
    When User search mobile "<Phone>"
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

    Examples: 
      | Phone   |
      | realme  |
      | iPhone  |
      | SAMSUNG |
