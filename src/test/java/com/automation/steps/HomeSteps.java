package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage=new HomePage();

    @Given("user opens the website")
    public void user_opens_the_website() {
        homePage.openWebsite();
    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user click on login icon")
    public void user_click_on_login_icon() {
        homePage.clickLoginIcon();
    }
}
