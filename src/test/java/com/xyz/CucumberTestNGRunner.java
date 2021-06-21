package com.xyz;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/xyz/features",
        glue = {"com.xyz.steps"}
)
public class CucumberTestNGRunner extends AbstractTestNGCucumberTests {
}
