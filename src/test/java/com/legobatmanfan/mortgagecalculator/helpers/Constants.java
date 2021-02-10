package com.legobatmanfan.mortgagecalculator.helpers;

import java.io.File;

public class Constants {
    public static final String BASEURL = "https://www.mortgageloan.com/calculator";
    public static final String PATH = System.getProperty("user.dir");
    public static final String CHROMEDRIVER = "webdriver.chrome.driver";
    public static final String CHROMEDRIVERDIR = "chromedriver_78_0_3904_108";
    public static final String CHROMEDRIVERPATH = PATH + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "webdriver" + File.separator + CHROMEDRIVERDIR  + File.separator + "chromedriver";
    public static final String GECKODRIVER = "webdriver.gecko.driver";
    public static final String GECKODRIVERDIR = "geckodriver_v0_26_0";
    public static final String GECKODRIVERPATH = PATH + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "webdriver" + File.separator + GECKODRIVERDIR  + File.separator + "geckodriver";

    public Constants(){
        super();
    }
}
