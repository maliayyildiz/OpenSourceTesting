@elementScreenshot
  Feature: screenshot of specific element
    Scenario: click on picture and take screenshot
      Given go to webpage
      When user select the element which will take screenshot of element
      Then take a screenshot of specific element

    Scenario: click on view button and take screenshot
      Given go to webpage
      When user view button on element which will take screenshot of element
      Then take a screenshot of specific element II

    Scenario: download picture save as method
      Given go to webpage
      When select the element
      Then download picture like save as