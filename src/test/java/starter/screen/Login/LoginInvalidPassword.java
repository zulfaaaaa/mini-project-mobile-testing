package starter.screen.Login;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginInvalidPassword extends BasePageObject {
    private By logoutBtn() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");}
    private By emailFiled() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");}

    private By passwordField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }


    @Step
    public void onDashboard() { Assert.assertTrue(waitUntilVisible(logoutBtn()).isDisplayed()); }
    @Step
    public void onDashboardClick() { onClick(logoutBtn()); }
    @Step
    public void onLoginPage() {
        Assert.assertTrue(waitUntilVisible(loginButton()).isDisplayed());
    }
    @Step
    public void onClickEmailField() { onClick(emailFiled()); }
    @Step
    public void inputEmail(String email) {
        onType(emailFiled(), email);
    }
    @Step
    public void onClickPasswordField() { onClick(passwordField()); }
    @Step
    public void inputPassword(String password) {
        onType(passwordField(), password);
    }
    @Step
    public void tapLoginButton() {
        onClick(loginButton());
    }
    @Step
    public String onHomepage() {
        return waitUntilVisible(loginButton()).getText();
    }

}
