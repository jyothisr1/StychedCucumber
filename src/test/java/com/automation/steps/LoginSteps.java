package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage=new LoginPage();

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("user enters the email {string}")
    public void user_enters_the_email(String username) {
        loginPage.userEmailInput(ConfigReader.getConfigValue(username));
    }

    @When("user enters the password {string}")
    public void user_enters_the_password(String password) {
        loginPage.passwordInput(ConfigReader.getConfigValue(password));
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("verify the error message")
    public void verify_the_error_message(String message) {
        Assert.assertTrue(loginPage.verifyMessage(message));
    }
}
