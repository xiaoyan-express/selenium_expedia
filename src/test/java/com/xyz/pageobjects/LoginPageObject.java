package com.xyz.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
    @FindBy(id = "signin-loginid")
    public WebElement emailAddressElement;
    @FindBy(id = "signin-password")
    public WebElement passwordElement;
    @FindBy(id = "submitButton")
    public WebElement signInBtnElement;

    private WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
