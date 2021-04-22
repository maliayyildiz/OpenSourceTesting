package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class ApiOpenSourceStepDefs {
        Response response;
    @Given("user read data using valid endpoint {string}")
    public void user_read_data_using_valid_endpoint(String endPoint) {
        response = given().when().get(endPoint);
        response.prettyPrint();
    }

    @Then("status code {int} and content type Json")
    public void status_code_and_content_type_Json(Integer statusCode) {
         response.then().assertThat().statusCode(statusCode).contentType(ContentType.JSON);

        System.out.println(response.getStatusCode());
        System.out.println(response.getContentType());
    }

    @Then("status code {int} response body contains {string} and does not contains {string}")
    public void status_code_response_body_contains_and_does_not_contains(Integer statusCode, String exist, String notExist) {
        response.then().assertThat().statusCode(statusCode);
        Assert.assertTrue(response.asString().contains(exist));
        Assert.assertFalse(response.asString().contains(notExist));

    }

    @Then("user validate firstname as {string} lastname as {string} and additionalneeds {string}")
    public void user_validate_firstname_as_lastname_as_and_additionalneeds(String firstname, String lastname, String add) {
        JsonPath jsonPath = response.jsonPath();

        Assert.assertEquals(firstname,jsonPath.getString("firstname"));
        Assert.assertEquals(lastname,jsonPath.getString("lastname"));
        Assert.assertEquals(add,jsonPath.getString("additionalneeds"));


    }

    @When("user send a request with request body data will be created successfully")
    public void userSendARequestWithRequestBodyDataWillBeCreatedSuccessfully() {
        Map<String,String> reqBody = new HashMap<>();
        reqBody.put("name","Mary");
        reqBody.put("salary","500");
        reqBody.put("age","35");

        response = given()
                .auth().basic("admin","password123").
                        body(reqBody).
                        when().
                        post("http://dummy.restapiexample.com/api/v1/create");
        response.prettyPrint();

        Map<String ,String> map = response.as(HashMap.class);

        Assert.assertEquals(map.get("status"),"success");
        Assert.assertEquals(map.get("message"),"Successfully! Record has been added.");

    }



    @When("user send a request with valid request body data will be updated successfully")
    public void user_send_a_request_with_valid_request_body_data_will_be_updated_successfully() {
        Map<String,String> reqBody = new HashMap<>();
        reqBody.put("name","Angel");
        reqBody.put("salary","600");
        reqBody.put("age","20");

        response = given()
                .auth().basic("admin","password123").
                        body(reqBody).
                        when().
                        put("http://dummy.restapiexample.com/api/v1/update/5967");
        response.prettyPrint();

        Map<String ,String> map = response.as(HashMap.class);

        Assert.assertEquals(map.get("status"),"success");
        Assert.assertEquals(map.get("message"),"Successfully! Record has been updated.");


    }
    @When("user send a request with valid endpoint data will be deleted successfully")
    public void user_send_a_request_with_valid_endpoint_data_will_be_deleted_successfully() {

        response = given()
                .auth().basic("admin","password123").
                        when().
                        delete("http://dummy.restapiexample.com/api/v1/delete/4097");
        response.prettyPrint();

        Map<String ,String> map = response.as(HashMap.class);

        Assert.assertEquals(map.get("status"),"success");
        Assert.assertEquals(map.get("message"),"Successfully! Record has been deleted");

        }

}
