package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "search_query_top")
    public WebElement searchBox;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement signInButton;
    @FindBy(xpath = "//a[@class='account']")
    public WebElement userSignedIn;
    @FindBy(xpath = "//a[@title='Printed Summer Dress']")
    public WebElement firstProduct;
    @FindBy(xpath = "//button[@class='exclusive']")
    public WebElement firstItemAddCartButton;
    @FindBy(tagName = "h2")
    public WebElement addToCartVerifyedText;
    @FindBy(xpath = "(//a[@title='Proceed to checkout'])")
    public WebElement proceedToCheckOutButton;
    @FindBy(xpath = "(//span[contains(text(),'Your shopping cart')])[1]")
    public WebElement verifyShoppingPageText;
    @FindBy(id = "summary_products_quantity")
    public WebElement quantityOfProductsInCart;
    @FindBy(xpath = "//a[contains(text(),'Printed Summer Dress')]")
    public WebElement selectedProduct;






}
