@login
  Feature: Login
    @smoke
    Scenario: user should able to access application with valid credential
      Given user should be on home page
      And user clicks on Sign in button
      When user provide valid username
      When user provide valid password
      When user click sign in button
      Then user should be signed in on app

    Scenario: user should not able to access application with invalid credential
      Given user should be on home page
      And user clicks on Sign in button
      When user provide invalid username
      When user provide valid password
      When user click sign in button
      Then verify error message "Invalid email address."