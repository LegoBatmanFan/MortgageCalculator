package com.legobatmanfan.mortgagecalculator.stepdefinitions;

import com.legobatmanfan.mortgagecalculator.helpers.WebDriverProcessing;
import io.cucumber.java.After;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Hooks extends WebDriverProcessing {
    @BeforeClass
    public void testSetup(){
        initialize();
    }

    @AfterClass
    public void shutDown(){
        tearDown();
    }
}
