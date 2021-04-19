$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ScreenshotOfSpecificElement.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@elementScreenshot"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@elementScreenshot"
    }
  ]
});
formatter.step({
  "name": "go to webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.TakeScreenshotOfSpecificElementStepDefs.go_to_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the element which will take screenshot of element",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.TakeScreenshotOfSpecificElementStepDefs.user_select_the_element_which_will_take_screenshot_of_element()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "take a screenshot of specific element",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.TakeScreenshotOfSpecificElementStepDefs.take_a_screenshot_of_specific_element()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});