package com.xyz.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPageObject {
    @FindBy(id = "create-account-firstname")
    public WebElement firstNameElement;

    @FindBy(id = "create-account-lastname")
    public WebElement lastNameElement;

    @FindBy(id = "create-account-emailId")
    public WebElement emailAddressElement;

    @FindBy(id = "create-account-password")
    public WebElement passwordElement;

    @FindBy(id = "create-account-confirm-password")
    public WebElement confirmPasswordElement;

    @FindBy(id = "create-account-submit-button")
    public WebElement createFreeAccountBtnElement;

    private WebDriver driver;

    public SignupPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
