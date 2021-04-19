@createAccount
  Feature: Create account
    @smoke @endToEnd
    Scenario: user should able to create an account
      Given user should be on home page
      Given user clicks on Sign in button
      And user provide valid email to create account box
      Given user clicks Create account button
      Then user directed to Create account page
      When user fills out required fields
      Then verify user on My Account page

