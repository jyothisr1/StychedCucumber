package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//span[text()='Log in']/parent::a")
    WebElement loginIcon;

    @FindBy(xpath = "//a[@class='custom-link' and @href='/collections/bohoz']")
    WebElement onHomePage;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("website.url"));
    }

    public boolean isHomePageDisplayed() {
       return onHomePage.isDisplayed();
    }

    public void clickLoginIcon() {
        loginIcon.click();
    }
}
