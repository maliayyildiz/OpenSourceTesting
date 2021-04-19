package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.Pages;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

public class ShoppingStepDefs {
    Pages pagesElements = new Pages();

    @When("user search product as {string}")
    public void user_search_product_as(String dress) {
        pagesElements.homePage().searchBox.sendKeys(dress+ Keys.ENTER);
    }

    @When("user select first product")
    public void user_select_first_product() {
      pagesElements.homePage().firstProduct.click();
    }

    @When("user add selected product to Cart")
    public void user_add_selected_product_to_Cart() {
       pagesElements.homePage().firstItemAddCartButton.click();
    }

    @Then("user verify selected product in the cart")
    public void user_verify_selected_product_in_the_cart() {
        ReusableMethods.waitForVisibility(pagesElements.homePage().addToCartVerifyedText,10);
        Assert.assertTrue(pagesElements.homePage().addToCartVerifyedText.isDisplayed());
    }

    @Then("user clicks proceed to checkout")
    public void user_clicks_proceed_to_checkout() {
       ReusableMethods.clickWithJS(pagesElements.homePage().proceedToCheckOutButton);
    }

    @Then("user verify selected product is on the summary page")
    public void user_verify_selected_product_is_on_the_summary_page() {
        ReusableMethods.waitForVisibility(pagesElements.cartPage().selectedProductOnSummaryPage,10);
       Assert.assertTrue(pagesElements.cartPage().selectedProductOnSummaryPage.isDisplayed());
    }


    @Then("user select delivery address")
    public void user_select_delivery_address() {
        ReusableMethods.wait(3);
       if (pagesElements.cartPage().addressUncheck.size()==0){
           pagesElements.cartPage().addressCheckBox.click();
       }
    }

    @Then("user select shipping option and checked terms of condition box")
    public void user_select_shipping_option_and_checked_terms_of_condition_box() {
        ReusableMethods.wait(3);
        pagesElements.cartPage().agreementCheckBox.click();
        ReusableMethods.wait(3);
    }

    @When("user select payment method")
    public void user_select_payment_method() {
        ReusableMethods.waitForVisibility(pagesElements.cartPage().paymentPageText,5);
        Assert.assertTrue(pagesElements.cartPage().paymentPageText.isDisplayed());
        pagesElements.cartPage().payBankWireButton.click();
    }

    @Then("verify payment option")
    public void verify_payment_option() {
       Assert.assertTrue(pagesElements.cartPage().verifyPaymentOption.isDisplayed());
    }

    @When("user clicks conformation button")
    public void user_clicks_conformation_button() {
        pagesElements.cartPage().confirmButton.click();
    }

    @Then("verify order completed message")
    public void verify_order_completed_message() {
        ReusableMethods.wait(3);
        Assert.assertTrue(pagesElements.cartPage().confirmationText.isDisplayed());
    }

    @When("user clicks proceed to checkout on summary page")
    public void userClicksProceedToCheckoutOnSummaryPage() {
        ReusableMethods.clickWithJS(pagesElements.cartPage().proceedToCheckOutOnSummaryPage);
    }

    @When("user clicks proceed to checkout on address page")
    public void userClicksProceedToCheckoutOnAddressPage() {
        ReusableMethods.clickWithJS(pagesElements.cartPage().proceedToCheckOutOnAddressPage);
    }

    @When("user clicks proceed to checkout shipping page")
    public void userClicksProceedToCheckoutShippingPage() {
        pagesElements.cartPage().proceedToCheckOutOnShippingPage.click();
    }
}
