package com.legobatmanfan.mortgagecalculator.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports"},
    features = "src/test/resources/features/",
    glue = "/com/legobatmanfan/mortgagecalculator/stepdefinitions/",
    monochrome = true)
public class TestRunner {

}

