package com.xyz.steps;

import com.xyz.pageobjects.LoginPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class LoginStepDefinition {
    private final static String expediaLogUrl = "https://www.expedia.com/%s";
    private final static int timeoutInSeconds = 5;

    private  WebDriver driver;
    private LoginPageObject loginPageObject;

    @Given("I launch chrome browser")
    public void launchChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        loginPageObject = new LoginPageObject(driver);
    }

    @When("I open {string} page")
    public void iOpenPage(String loginUrl) {
        driver.get(String.format(expediaLogUrl, loginUrl));
        driver.manage().window().maximize();

        new WebDriverWait(driver, timeoutInSeconds)
                .until(ExpectedConditions.visibilityOf(loginPageObject.emailAddressElement));
        new WebDriverWait(driver, timeoutInSeconds)
                .until(ExpectedConditions.visibilityOf(loginPageObject.passwordElement));
    }

    @And("I put {string} and {string}")
    public void iPutAnd(String username, String password) {
        loginPageObject.emailAddressElement.sendKeys(username);
        loginPageObject.passwordElement.sendKeys(password);
    }

    @And("I click sign-In button")
    public void clickButton() {
        loginPageObject.signInBtnElement.click();
    }

    @Then("I navigate to the {string} page")
    public void iNavigateToThePage(String arg0) {
    }
}
