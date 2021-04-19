@shopping
Feature: Shopping
  @smoke @endToEnd
  Scenario: user should able to buy product from app
    Given user should be on home page
    And user clicks on Sign in button
    When user provide valid username
    When user provide valid password
    When user click sign in button
    And user search product as "dress"
    When user select first product
    When user add selected product to Cart
    Then user verify selected product in the cart
    And user clicks proceed to checkout
    Then user verify selected product is on the summary page
    When user clicks proceed to checkout on summary page
    Then user select delivery address
    When user clicks proceed to checkout on address page
    Then user select shipping option and checked terms of condition box
    When user clicks proceed to checkout shipping page
    When user select payment method
    Then verify payment option
    When user clicks conformation button
    Then verify order completed message





