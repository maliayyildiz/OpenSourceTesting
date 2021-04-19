package pages;

public class Pages {
    public Pages(){
    }
    //create private object for each class
    private HomePage homePage;
    private SignInPage signInPage;
    private CreateAccountPage createAccountPage;
    private CartPage cartPage;
    private MyAccountPage myAccountPage;


    //create public method with class return type and put  if condition and if object is equal to null create new object and return it
    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }return homePage;
    }

    public SignInPage signInPage(){
        if (signInPage == null){
            signInPage = new SignInPage();
        }return signInPage;
    }

    public CreateAccountPage createAccountPage(){
        if (createAccountPage ==  null){
            createAccountPage = new CreateAccountPage();
        }return createAccountPage;
    }

    public CartPage cartPage(){
        if (cartPage == null){
            cartPage = new CartPage();
        }return cartPage;
    }

    public MyAccountPage myAccountPage(){
        if (myAccountPage == null){
            myAccountPage = new MyAccountPage();
        }return myAccountPage;
    }

}
