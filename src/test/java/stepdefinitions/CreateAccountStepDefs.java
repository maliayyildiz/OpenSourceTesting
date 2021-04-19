package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.Pages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CreateAccountStepDefs {
    Pages pagesElements = new Pages();

    @Given("user should be on home page")
    public void user_should_be_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user clicks on Sign in button")
    public void user_clicks_on_Sign_in_button() {
    pagesElements.homePage().signInButton.click();
    //verify text
    }

    @Given("user provide valid email to create account box")
    public void user_provide_valid_email_to_create_account_box() {
    pagesElements.signInPage().createAccountBox.sendKeys(ConfigurationReader.getProperty("validEmail"));
    }

    @Given("user clicks Create account button")
    public void user_clicks_Create_account_button() {
    pagesElements.signInPage().createAccountButton.click();
    }

    @Then("user directed to Create account page")
    public void user_directed_to_Create_account_page() {
        Assert.assertTrue(pagesElements.signInPage().authenticationText.isDisplayed());
    }

    @When("user fills out required fields")
    public void user_fills_out_required_fields() {
       pagesElements.createAccountPage().maleRadioButton.click();
       pagesElements.createAccountPage().firstNameBox.sendKeys(ConfigurationReader.getProperty("firstName"));
       pagesElements.createAccountPage().lastNameBox.sendKeys(ConfigurationReader.getProperty("lastName"));
       pagesElements.createAccountPage().passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
       //select DD/MM/YYYY from dropdown menu <Select class will be used>
        Select selectDay = new Select(pagesElements.createAccountPage().dayForBirthDate);
        selectDay.selectByValue("25");
        Select selectMonth = new Select(pagesElements.createAccountPage().monthForBirthDate);
        selectMonth.selectByValue("10");
        Select selectYear = new Select(pagesElements.createAccountPage().yearForBirthDate);
        selectYear.selectByValue("2000");
        //check special offer from merchants
        pagesElements.createAccountPage().specialOfferInfoCheckBox.click();
        pagesElements.createAccountPage().addressBox.sendKeys(ConfigurationReader.getProperty("address"));
        pagesElements.createAccountPage().cityBox.sendKeys(ConfigurationReader.getProperty("city"));
        Select selectState = new Select(pagesElements.createAccountPage().stateBox);
        selectState.selectByVisibleText("Texas");
        pagesElements.createAccountPage().zipCode.sendKeys(ConfigurationReader.getProperty("zipCode"));
        Select selectCountry = new Select(pagesElements.createAccountPage().countryBox);
        selectCountry.selectByValue("21");
        pagesElements.createAccountPage().mobilePhoneBox.sendKeys(ConfigurationReader.getProperty("phoneNo"));
        pagesElements.createAccountPage().registerButton.click();
    }

    @Then("verify user on My Account page")
    public void verifyUserOnMyAccountPage() {
        ReusableMethods.wait(3);
        ReusableMethods.waitForVisibility(pagesElements.myAccountPage().myAccountText,5);
        Assert.assertTrue(pagesElements.myAccountPage().myAccountText.isDisplayed());
    }
}
