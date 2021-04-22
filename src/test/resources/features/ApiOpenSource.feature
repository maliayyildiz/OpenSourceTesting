@api
  Feature: Api open source
    Scenario: How to read data in api
      Given user read data using valid endpoint "https://restful-booker.herokuapp.com/booking/11"

    Scenario: Simple positive test scenario
      Given user read data using valid endpoint "https://restful-booker.herokuapp.com/booking/5"
      Then  status code 200 and content type Json

    Scenario: Simple negative test scenario
      Given user read data using valid endpoint "https://restful-booker.herokuapp.com/booking/1000"
      Then  status code 404 response body contains "Not Found" and does not contains "Jack"

    Scenario: Validate data with api
      Given user read data using valid endpoint "https://restful-booker.herokuapp.com/booking/11"
      Then user validate firstname as "Jim" lastname as "Brown" and additionalneeds "Breakfast"

    Scenario: create a new data with post request
#      Given user read data using valid endpoint "http://dummy.restapiexample.com/api/v1/create"
      When user send a request with request body data will be created successfully

    Scenario: update data with put request
#      Given Given user read data using valid endpoint "http://dummy.restapiexample.com/api/v1/update/2"
      When user send a request with valid request body data will be updated successfully

    Scenario: delete data with delete request
#      Given Given user read data using valid endpoint "http://dummy.restapiexample.com/api/v1/delete"
      When user send a request with valid endpoint data will be deleted successfully
