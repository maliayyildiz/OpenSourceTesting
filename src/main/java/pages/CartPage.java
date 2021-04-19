package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "uniform-addressesAreEquals")
    public WebElement deliveryAddress;
    @FindBy(id = "uniform-cgv")
    public WebElement agreementCheckBox;
    @FindBy(xpath = "//span[contains(text(),'Your payment method')]")
    public WebElement paymentPageText;
    @FindBy(xpath = "//a[@title='Pay by bank wire']")
    public WebElement payBankWireButton;
    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    public WebElement confirmButton;
    @FindBy(xpath = "(//div//p)[3]")
    public WebElement confirmationText;
    @FindBy(xpath = "(//tbody/tr/td)[1]")
    public WebElement selectedProductOnSummaryPage;
    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    public WebElement proceedToCheckOutOnSummaryPage;
    @FindBy(xpath = "//span[@class='checked']")
    public List<WebElement> addressUncheck;
    @FindBy(id = "uniform-addressesAreEquals")
    public WebElement addressCheckBox;
    @FindBy(xpath = "(//button[@class='button btn btn-default button-medium'])")
    public WebElement proceedToCheckOutOnAddressPage;
    @FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
    public WebElement proceedToCheckOutOnShippingPage;
    @FindBy(tagName = "h3")
    public WebElement verifyPaymentOption;
}
