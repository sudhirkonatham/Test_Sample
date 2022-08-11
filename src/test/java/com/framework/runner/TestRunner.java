package com.framework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = "src/test/resources/features",
        glue= "com.framework.steps",
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "json:target/cucumber.json"}
)
public class TestRunner {

}