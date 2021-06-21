package com.xyz;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/xyz/features",
        glue = {"com.xyz.steps"}
        )
public class CucumberJunitTestRunner {
}
