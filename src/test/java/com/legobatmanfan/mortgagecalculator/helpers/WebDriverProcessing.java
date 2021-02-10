package com.legobatmanfan.mortgagecalculator.helpers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class WebDriverProcessing {

    private static WebDriverWait wait;
    protected static WebDriver driver;

    public WebDriverProcessing() {
        initialize();
    }

    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
//        System.setProperty(Constants.CHROMEDRIVER,  Constants.CHROMEDRIVERPATH);
        System.setProperty(Constants.GECKODRIVER,  Constants.GECKODRIVERPATH);
//        setChromeDriver();
        setGeckoDriver();
        setWebDriverWait(getChromeDriver());
        driver = this.getChromeDriver();
        driver.get(Constants.BASEURL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public WebDriverWait getWebDriverWait(){ return this.wait; }

    public void setWebDriverWait(WebDriver driver) { this.wait = new WebDriverWait(driver, 60); }

    public void setChromeDriver(){ this.driver = new ChromeDriver(); }

    public WebDriver getChromeDriver(){ return this.driver; }

    public void setGeckoDriver(){ this.driver = new FirefoxDriver(); }

    public WebDriver getGeckoDriver(){ return this.driver; }

    public void tearDown(){
        this.driver.close();
    }

    public void goToMainPage(){
        driver.navigate().to(Constants.BASEURL);
    }

}
