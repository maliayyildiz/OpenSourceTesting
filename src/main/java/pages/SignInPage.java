package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(tagName = "h1")
    public WebElement authenticationText;
    @FindBy(id = "email_create")
    public WebElement createAccountBox;
    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;
    @FindBy(id = "email")
    public WebElement emailBox;
    @FindBy(id = "passwd")
    public WebElement passwordBox;
    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;
    @FindBy(xpath = "//div//ol//li")
    public WebElement errorMessage;




}
