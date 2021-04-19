package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateAccountPage {
    public CreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(tagName = "h1")
    public WebElement createAccountText;
    @FindBy(id = "uniform-id_gender1")
    public WebElement maleRadioButton;
    @FindBy(id = "id_gender2")
    public WebElement femaleRadioButton;
    @FindBy(id = "customer_firstname")
    public WebElement firstNameBox;
    @FindBy(id = "customer_lastname")
    public WebElement lastNameBox;
    @FindBy(id = "passwd")
    public WebElement passwordBox;
    @FindBy(id = "days")
    public WebElement dayForBirthDate;
    @FindBy(id = "months")
    public WebElement monthForBirthDate;
    @FindBy(id = "years")
    public WebElement yearForBirthDate;
    @FindBy(id = "uniform-optin")
    public WebElement specialOfferInfoCheckBox;
    @FindBy(id = "address1")
    public WebElement addressBox;
    @FindBy(id = "city")
    public WebElement cityBox;
    @FindBy(id = "id_state")
    public WebElement stateBox;
    @FindBy(id = "phone_mobile")
    public WebElement mobilePhoneBox;
    @FindBy(id = "submitAccount")
    public WebElement registerButton;
    @FindBy(id = "postcode")
    public WebElement zipCode;
    @FindBy(id = "id_country")
    public WebElement countryBox;



}
