package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Pages;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

public class LoginStepDefs {
  Pages pagesElements = new Pages();

    @When("user provide valid username")
    public void user_provide_valid_username() {
     pagesElements.signInPage().emailBox.sendKeys(ConfigurationReader.getProperty("validEmail"));
    }

    @When("user provide valid password")
    public void user_provide_valid_password() {
    pagesElements.signInPage().passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click sign in button")
    public void user_click_sign_in_button() {
    pagesElements.signInPage().signInButton.click();
    }

    @Then("user should be signed in on app")
    public void user_should_be_signed_in_on_app() {
        ReusableMethods.waitForVisibility(pagesElements.homePage().userSignedIn,5);
        Assert.assertTrue(pagesElements.homePage().userSignedIn.isDisplayed());
    }

    @When("user provide invalid username")
    public void userProvideInvalidUsername() {
        pagesElements.signInPage().emailBox.sendKeys("abcd");
    }

    @Then("verify error message {string}")
    public void verifyErrorMessage(String errorMessage) {
      ReusableMethods.wait(3);
        Assert.assertEquals(pagesElements.signInPage().errorMessage.getText(),errorMessage);
    }
}
