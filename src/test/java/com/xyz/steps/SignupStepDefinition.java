package com.xyz.steps;

import io.cucumber.java.en.And;

public class SignupStepDefinition {
    @And("I click submit button")
    public void clickSubmitButton() {
        System.out.println("Signup Button");
    }
}
