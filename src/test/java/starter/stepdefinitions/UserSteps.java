package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
//import starter.screen.InvalidLoginScreen;
////import starter.screen.Login.LoginScreen;
//import starter.screen.InvalidRegistEmailScreen;
//import starter.screen.InvalidRegisterNameScreen;
import starter.screen.AddProductToCart.AddProductToCartScreen;
import starter.screen.Login.*;
import starter.screen.Register.*;

public class UserSteps {
    @Steps
    RegistScreen regist;
//    @Steps
//    RegistSameEmailScreen registSameEmailScreen;
    @Steps
    RegistIncorrectEmailFormat registIncorrectEmailFormat;
    @Steps
    RegistBlankName registBlankName;
//    @Steps
//    RegistBlankEmail registBlankEmail;
    @Steps
    RegistBlankPassword registBlankPassword;
    @Steps
    RegistBlankData registBlankData;
    @Steps
    LoginScreen login;
//    @Steps
//    LoginInvalidEmail loginInvalidEmail;
    @Steps
    LoginInvalidPassword loginInvalidPassword;
    @Steps
    LoginBlankEmail loginBlankEmail;
    @Steps
    LoginInvalidPassword loginBlankPassword;
    @Steps
    LoginBlankData loginBlankData;
    @Steps
    AddProductToCartScreen addProductToCartScreen;



    // ====================  valid regist =====================
    @Given("user on dashboard")
    public void userOnLoginPageForRegist() { regist.onDashboard();}
    @When("user click logout")
    public void userClickLogout() { regist.onDashboardClick();}
    @And("user click link regist")
    public void userClickRegist() {regist.clickRegist();}
    @And("user input name for regist")
    public void userInputName() {regist.inputName("Zulfa Nursyadiyah");}
    @And("user input email for regist")
    public void userInputEmail() {regist.inputEmailRegist("sampleokregs@mail.com");}
    @And("user input password for regist")
    public void userInputPasswordRegist() {regist.inputPasswordRegist("123qwe");}
    @And("user click resgister button")
    public void userClickRegistButton() {
        regist.tapRegistButton();
    }
    @Then("user direct to home page")
    public void userSeeSuccessMessage() {  regist.getSuccessMessage();}


    // ====================  Invalid Regist Same Email =====================
//    @Given("user on dashboard for regist same email")
//    public void userOnLoginPageForRegistSameEmail() { registSameEmailScreen.onDashboard();}
//    @When("user click logout for regist same email")
//    public void userClickLogoutForRegistSameEmail() { registSameEmailScreen.onDashboardClick();}
//    @And("user click link regist for regist same email")
//    public void userClickRegistForRegistSameEmail() {registSameEmailScreen.clickRegist();}
//    @And("user input name for regist same email")
//    public void userInputNameForRegistSameEmail() {registSameEmailScreen.inputName("Zulfa");}
//    @And("user input email for regist same email")
//    public void userInputEmailForRegistSameEmail() {registSameEmailScreen.inputEmailRegist("cobadulu@mail.com");}
//    @And("user input password for regist same email")
//    public void userInputPasswordForRegistSameEmail() {registSameEmailScreen.inputPasswordRegist("123qwe");}
//    @And("user click resgister button for regist same email")
//    public void userClickRegistButtonForRegistSameEmail() {
//        registSameEmailScreen.tapRegistButton();
//    }
//    @Then("user direct to home page for regist same email")
//    public void userSeeSuccessMessageForRegistSameEmail() {  registSameEmailScreen.getSuccessMessage();}


    // ====================  Invalid Regist Incorrect Email Format =====================
    @Given("user on dashboard for regist incorrect email format")
    public void userOnLoginPageForRegistIncorrectEmailFormat() { registIncorrectEmailFormat.onDashboard();}
    @When("user click logout for regist incorrect email format")
    public void userClickLogoutForRegistIncorrectEmailFormat() { registIncorrectEmailFormat.onDashboardClick();}
    @And("user click link regist for regist incorrect email format")
    public void userClickRegistIncorrectEmailFormat() {registIncorrectEmailFormat.clickRegist();}
    @And("user input name for regist incorrect email format")
    public void userInputNameIncorrectEmailFormat() {registIncorrectEmailFormat.inputName("Zulfa Nursyadiyah");}
    @And("user input email for regist incorrect email format")
    public void userInputEmailIncorrectEmailFormat() {registIncorrectEmailFormat.inputEmailRegist("regssadwincorrformat.co@92#32");}
    @And("user input password for regist incorrect email format")
    public void userInputPasswordIncorrectEmailFormat() {registIncorrectEmailFormat.inputPasswordRegist("123qwe");}
    @And("user click resgister button for incorrect email format")
    public void userClickRegistButtonIncorrectEmailFormat() {registIncorrectEmailFormat.tapRegistButton();}
    @Then("user direct to home page for regist incorrect email format")
    public void userSeeSuccessMessageIncorrectEmailFormat() {  registIncorrectEmailFormat.getSuccessMessage();}


    // ====================  Invalid Regist Blank Name =====================
    @Given("user on dashboard for regist blank name")
    public void userOnLoginPageForRegistBlankName() { registBlankName.onDashboard();}
    @When("user click logout for regist blank name")
    public void userClickLogoutForRegistBlankName() { registBlankName.onDashboardClick();}
    @And("user click link regist for regist blank name")
    public void userClickRegistBlankName() {registBlankName.clickRegist();}
    @And("user input name for regist blank name")
    public void userInputNameBlankName() {registBlankName.inputName("");}
    @And("user input email for regist blank name")
    public void userInputEmailBlankName() {registBlankName.inputEmailRegist("registernfdame@mail.com");}
    @And("user input password for regist blank name")
    public void userInputPasswordBlankName() {registBlankName.inputPasswordRegist("123qwe");}
    @And("user click resgister button for blank name")
    public void userClickRegistButtonBlankName() {registBlankName.tapRegistButton();}
    @Then("user direct to home page for regist blank name")
    public void userSeeSuccessMessageBlankName() {  registBlankName.getSuccessMessage();}


    // ====================  Invalid regist blank email =====================
//    @Given("user on dashboard for regist blank email")
//    public void userOnLoginPageForRegistBlankEmail() { registBlankEmail.onDashboard();}
//    @When("user click logout for regist blank email")
//    public void userClickLogoutForRegistBlankEmail() { registBlankEmail.onDashboardClick();}
//    @And("user click link regist for regist blank email")
//    public void userClickRegistForRegistBlankEmail() {registBlankEmail.clickRegist();}
//    @And("user input name for regist blank email")
//    public void userInputNameForRegistBlankEmail() {registBlankEmail.inputName("Zulfa Nursyadiyah");}
//    @And("user input email for regist blank email")
//    public void userInputEmailForRegistBlankEmail() {registBlankEmail.inputEmailRegist("");}
//    @And("user input password for regist blank email")
//    public void userInputPasswordForRegistBlankEmail() {registBlankEmail.inputPasswordRegist("123qwe");}
//    @And("user click resgister button for regist blank email")
//    public void userClickRegistButtonForRegistBlankEmail() {
//        registBlankEmail.tapRegistButton();
//    }
//    @Then("user direct to home page for regist blank email")
//    public void userSeeSuccessMessageForRegistBlankEmail() {  registBlankEmail.getSuccessMessage();}


    // ====================  Invalid regist blank password =====================
    @Given("user on dashboard for regist blank password")
    public void userOnLoginPageForRegistBlankPassword() { registBlankPassword.onDashboard();}
    @When("user click logout for regist blank password")
    public void userClickLogoutForRegistBlankPassword() { registBlankPassword.onDashboardClick();}
    @And("user click link regist for regist blank password")
    public void userClickRegistForRegistBlankPassword() {registBlankPassword.clickRegist();}
    @And("user input name for regist blank password")
    public void userInputNameForRegistBlankPassword() {registBlankPassword.inputName("Zulfa Nursyadiyah");}
    @And("user input email for regist blank password")
    public void userInputEmailForRegistBlankPassword() {registBlankPassword.inputEmailRegist("regsitdfdspass@mail.com");}
    @And("user input password for regist blank password")
    public void userInputPasswordForRegistBlankPassword() {registBlankPassword.inputPasswordRegist("");}
    @And("user click resgister button for regist blank password")
    public void userClickRegistButtonForRegistBlankPassword() {
        registBlankPassword.tapRegistButton();
    }
    @Then("user direct to home page for regist blank password")
    public void userSeeSuccessMessageForRegistBlankPassword() {  registBlankPassword.getSuccessMessage();}


    // ====================  Invalid Register Blank Data =====================
    @Given("user on dashboard for regist blank data")
    public void userOnLoginPageForRegistBlankData() { registBlankData.onDashboard();}
    @When("user click logout for regist blank data")
    public void userClickLogoutForRegistBlankData() { registBlankData.onDashboardClick();}
    @And("user click link regist for regist blank data")
    public void userClickRegistForRegistBlankData() {registBlankData.clickRegist();}
    @And("user input name for regist blank data")
    public void userInputNameForRegistBlankData() {registBlankData.inputName("");}
    @And("user input email for regist blank data")
    public void userInputEmailForRegistBlankData() {registBlankData.inputEmailRegist("");}
    @And("user input password for regist blank data")
    public void userInputPasswordForRegistBlankData() {registBlankData.inputPasswordRegist("");}
    @And("user click resgister button for regist blank data")
    public void userClickRegistButtonForRegistBlankData() {
        registBlankData.tapRegistButton();
    }
    @Then("user direct to home page for regist blank data")
    public void userSeeSuccessMessageForRegistBlankData() {  registBlankData.getSuccessMessage();}



    // ====================  Login Valid =====================
    @Given("user on dashboard for login")
    public void userOnLoginPageForLogin() { login.onDashboard();}
    @When("user click logout for login")
    public void userClickLogoutForLogin() { login.onDashboardClick();}
    @And("user on login page for login")
    public void userOnLoginPage() { login.onLoginPage();}
    @And("user click email field")
    public void userClickEmailField() { login.onClickEmailField();}
    @And("user input valid email")
    public void userInputEmailForLogin() {login.inputEmail("cobadulu@mail.com");}
    @And("user click password field")
    public void userClickPasswordField() { login.onClickPasswordField();}
    @And("user input password")
    public void userInputPasswordForLogin() {login.inputPassword("123qwe");}
    @And("user click login button")
    public void userClickBtnLogin() {login.tapLoginButton();}
    @Then("user can see hompegae and list products")
    public void userSuccessLogin() { login.onHomepage();}


    // ====================  Login Invalid Email =====================
//    @Given("user on dashboard for login invalid email")
//    public void userOnLoginPageForLoginInvalidEmail() { loginInvalidEmail.onDashboard();}
//    @When("user click logout for login invalid email")
//    public void userClickLogoutForLoginInvalidEmail() { loginInvalidEmail.onDashboardClick();}
//    @And("user on login page for login invalid email")
//    public void userOnLoginPageInvalidEmail() { loginInvalidEmail.onLoginPage();}
//    @And("user click email field invalid email")
//    public void userClickEmailFieldInvalidEmail() { loginInvalidEmail.onClickEmailField();}
//    @And("user input invalid email")
//    public void userInputEmailForLoginInvalidEmail() {loginInvalidEmail.inputEmail("cobacobasdwmail.com");}
//    @And("user click password field invalid email")
//    public void userClickPasswordFieldInvalidEmail() { loginInvalidEmail.onClickPasswordField();}
//    @And("user input invalid password invalid email")
//    public void userInputPasswordForLoginInvalidEmail() {loginInvalidEmail.inputPassword("123qwe");}
//    @And("user click login button invalid email")
//    public void userClickBtnLoginInvalidEmail() {loginInvalidEmail.tapLoginButton();}
//    @Then("user can see hompegae and list products invalid email")
//    public void userSuccessLoginInvalidEmail() { loginInvalidEmail.onHomepage();}


    // ====================  Login Invalid Password =====================
    @Given("user on dashboard for login invalid password")
    public void userOnLoginPageForLoginInvalidPassword() { loginInvalidPassword.onDashboard();}
    @When("user click logout for login invalid password")
    public void userClickLogoutForLoginInvalidPassword() { loginInvalidPassword.onDashboardClick();}
    @And("user on login page for login invalid password")
    public void userOnLoginPageInvalidPassword() { loginInvalidPassword.onLoginPage();}
    @And("user click email field invalid password")
    public void userClickEmailFieldInvalidPassword() { loginInvalidPassword.onClickEmailField();}
    @And("user input valid email invalid password")
    public void userInputEmailForLoginInvalidPassword() {loginInvalidPassword.inputEmail("cobadulu@mail.com");}
    @And("user click password field invalid password")
    public void userClickPasswordFieldInvalidPassword() { loginInvalidPassword.onClickPasswordField();}
    @And("user input invalid password")
    public void userInputPasswordForLoginInvalidPassword() {loginInvalidPassword.inputPassword("cobacobsadulu");}
    @And("user click login button invalid password")
    public void userClickBtnLoginInvalidPassword() {loginInvalidPassword.tapLoginButton();}
    @Then("user can see hompegae and list products invalid password")
    public void userSuccessLoginInvalidPassword() { loginInvalidPassword.onHomepage();}

    // ====================  Login Invalid Blank Email =====================
    @Given("user on dashboard for login blank email")
    public void userOnLoginPageForLoginBlankEmail() { loginBlankEmail.onDashboard();}
    @When("user click logout for login blank email")
    public void userClickLogoutForLoginBlankEmail() { loginBlankEmail.onDashboardClick();}
    @And("user on login page for login blank email")
    public void userOnLoginPageBlankEmail() { loginBlankEmail.onLoginPage();}
    @And("user click email field blank email")
    public void userClickEmailFieldBlankEmail() { loginBlankEmail.onClickEmailField();}
    @And("user input blank email")
    public void userInputEmailForLoginBlankEmail() {loginBlankEmail.inputEmail("");}
    @And("user click password field blank email")
    public void userClickPasswordFieldBlankEmail() { loginBlankEmail.onClickPasswordField();}
    @And("user input valid password blank email")
    public void userInputPasswordForLoginBlankEmail() {loginBlankEmail.inputPassword("123qwe");}
    @And("user click login button blank email")
    public void userClickBtnLoginBlankEmail() {loginBlankEmail.tapLoginButton();}
    @Then("user can see hompegae and list products blank email")
    public void userSuccessLoginBlankEmail() { loginBlankEmail.onHomepage();}

    // ====================  Login Invalid Blank Password =====================
    @Given("user on dashboard for login blank password")
    public void userOnLoginPageForLoginPassword() { loginBlankPassword.onDashboard();}
    @When("user click logout for login blank password")
    public void userClickLogoutForLoginPassword() { loginBlankPassword.onDashboardClick();}
    @And("user on login page for login blank password")
    public void userOnLoginPagePassword() { loginBlankPassword.onLoginPage();}
    @And("user click email field blank password")
    public void userClickEmailFieldPassword() { loginBlankPassword.onClickEmailField();}
    @And("user input valid email blank password")
    public void userInputEmailForLoginPassword() {loginBlankPassword.inputEmail("cobadulu@mail.com");}
    @And("user click password field blank password")
    public void userClickPasswordFieldPassword() { loginBlankPassword.onClickPasswordField();}
    @And("user input blank password")
    public void userInputPasswordForLoginPassword() {loginBlankPassword.inputPassword("");}
    @And("user click login button blank password")
    public void userClickBtnLoginPassword() {loginBlankPassword.tapLoginButton();}
    @Then("user can see hompegae and list products blank password")
    public void userSuccessLoginPassword() { loginBlankPassword.onHomepage();}

    // ====================  Login Invalid Blank Data =====================
    @Given("user on dashboard for login blank data")
    public void userOnLoginPageForLoginBlankData() { loginBlankData.onDashboard();}
    @When("user click logout for login blank data")
    public void userClickLogoutForLoginBlankData() { loginBlankData.onDashboardClick();}
    @And("user on login page for login blank data")
    public void userOnLoginPageBlankData() { loginBlankData.onLoginPage();}
    @And("user click email field blank data")
    public void userClickEmailFieldBlankData() { loginBlankData.onClickEmailField();}
    @And("user input email blank data")
    public void userInputEmailForLoginBlankData() {loginBlankData.inputEmail("");}
    @And("user click password field blank data")
    public void userClickPasswordFieldBlankData() { loginBlankData.onClickPasswordField();}
    @And("user input password blank data")
    public void userInputPasswordForLoginBlankData() {loginBlankData.inputPassword("");}
    @And("user click login button blank data")
    public void userClickBtnLoginBlankData() {loginBlankData.tapLoginButton();}
    @Then("user can see hompegae and list products blank data")
    public void userSuccessLoginBlankData() { loginBlankData.onHomepage();}

    //invalid login
//    @Given("user on login page")
//    public void userOnLoginPage() {
//        invalidlogin.onLoginPage();
//    }
//
//    @When("user input valid username")
//    public void userInputValidUsername() {
//        invalidlogin.inputEmail("adi@gmail.com");
//    }
//
//    @And("user input invalid password")
//    public void userInputInvalidPassword() {
//        invalidlogin.inputPassword("123123123");
//    }
//
//    @Then("user see error message {string}")
//    public void userSeeErrorMessage(String message) { Assert.assertEquals(message, invalidlogin.getErrorMessage());}
//
//    @And("user click login button")
//    public void userClickLoginButton() {
//        invalidlogin.tapLoginButton();
//    }










    // ========== invalid regist by name ===========
//    @Given("user on login page for invalid regist")
//    public void userOnLogincdddddddddddddRegist() {
//        invalidregistname.onLoginPageFoRegist();
//    }
//    @When("user click create one for invalid regist")
//    public void userClickCreateOneForRegist() { invalidregistname.tapCreateButton();
//    }
//    @And("user input invalid name")
//    public void userInputInvalidName() {invalidregistname.inputName("");
//    }
//    @And("user input email for invalid regist")
//    public void userInputEmailForRegsit() {invalidregistname.inputEmailRegist("zulfasyadia@gmailcom");}
//    @And("user input password for invalid regist")
//    public void userInputPasswordForRegist() {invalidregistname.inputPasswordRegist("123qwe");
//    }
//    @And("user input confirm password for invalid regist")
//    public void userInputConfirmPasswordForRegist() {invalidregistname.inputConfirmPassword("123qwe");
//    }
//    @And("user click resgist button for invalid regist")
//    public void userClickRegistButtonForRegist() {
//        invalidregistname.tapRegistButton();
//    }
//    @Then("user see error message on name field {string}")
//        public void userErrorMessageOnNameField(String message) { Assert.assertEquals(message, invalidregistname.getErrorMessageOnNameField());}

    // ========== invalid regist by email ===========
//    @Given("user on login page for invalid register")
//    public void userOnLoginPageForInvalidRegister() {
//        invalidregistemail.onLoginPageFoRegist();
//    }
//    @When("user click create one for invalid register")
//    public void userClickCreateOneForRegister() { invalidregistemail.tapCreateButton();
//    }
//    @And("user input name for register")
//    public void userInputNameForInvalidRegister() {invalidregistemail.inputName("Zulfa Nursyadiya");
//    }
//    @And("user input invalid email")
//    public void userInputInvalidEmail() {invalidregistemail.inputEmailRegist("zulfasyadiamail.com");}
//    @And("user input password for invalid register")
//    public void userInputPasswordForRegister() {invalidregistemail.inputPasswordRegist("123qwe");
//    }
//    @And("user input confirm password for invalid register")
//    public void userInputConfirmPasswordForRegister() {invalidregistemail.inputConfirmPassword("123qwe");
//    }
//    @And("user click resgister button for invalid register")
//    public void userClickRegistButtonForRegister() {
//        invalidregistemail.tapRegistButton();
//    }
//    @Then("user see error message on email field {string}")
//    public void userErrorMessageOnEmailField(String message) { Assert.assertEquals(message, invalidregistemail.getErrorMessageOnEmailField());}

    // ==================== invalid regist by email =====================



    // ==================== Add Product To Cart =====================
    @Given("user on dashboard for add product to cart")
    public void userOnDashboardPageForAddProduct() { addProductToCartScreen.onDashboard();}
    @When("user click logout for add product to cart")
    public void userClickLogoutForAddProduct() { addProductToCartScreen.onDashboardClick();}
    @And("user on login page for add product to cart")
    public void userOnLoginPageForAddProduct() { addProductToCartScreen.onLoginPage();}
    @And("user click email field for input")
    public void userClickEmailFieldForAddProduct() { addProductToCartScreen.onClickEmailField();}
    @And("user input valid email on field email")
    public void userInputEmailForLoginForAddProduct() {addProductToCartScreen.inputEmail("cobadulu@mail.com");}
    @And("user click password field for input")
    public void userClickPasswordFieldForAddProduct() { addProductToCartScreen.onClickPasswordField();}
    @And("user input valid password on field")
    public void userInputPasswordForLoginForAddProduct() {addProductToCartScreen.inputPassword("123qwe");}
    @And("user click login button for login")
    public void userClickBtnLoginForAddProduct() {addProductToCartScreen.tapLoginButton();}
    @And("user can see homepage and list products")
    public void userSuccessLoginForAddProduct() { addProductToCartScreen.onHomepage();}
    @And("user click beli on product")
    public void userClickBeli() { addProductToCartScreen.clickBeli();}
    @Then("Users can see that the product has been added")
    public void userSuccessAddProduct(){addProductToCartScreen.onHomepage();}

}
