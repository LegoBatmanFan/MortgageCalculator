package com.legobatmanfan.mortgagecalculator.menus;

import com.legobatmanfan.mortgagecalculator.common.BasicActions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageHeader extends BasicActions {

    private WebDriver _driverPageHeader;

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/ul/li[2]/a")
    private WebElement headerHomeLink;

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/ul/li[3]/a")
    private WebElement headerRefinanceLink;

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/ul/li[4]/a")
    private WebElement headerHomeEquityLink;

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/ul/li[5]/a")
    private WebElement headerMortgageRatesLink;

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/ul/li[6]/a")
    private WebElement headerResourcesLink;

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/ul/li[7]/a")
    private WebElement headerStudentsLink;

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/ul/li[8]/a")
    private WebElement headerAskQuestionLink;

    @FindBy(how = How.ID_OR_NAME, using = "q")
    private WebElement headerSearchBox;

    @FindBy(how = How.ID, using = "submit-search")
    private WebElement headerSearchButton;

    public PageHeader(WebDriver driver){
        this._driverPageHeader = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTextInSearchBox(WebDriverWait waitForSearchBox, String myText){
        enterTextInField(waitForSearchBox, headerSearchBox, myText);
    }

    public void clickSearchButton(WebDriverWait waitForButton){
        clickOnElement(waitForButton, headerSearchButton);
    }

    public void clickOnLink(WebDriverWait waitForLink, String linkText){
        WebElement myElement;

        switch(linkText){
            case "Home":
                myElement = headerHomeLink;
                break;
            case "Refinance":
                myElement = headerRefinanceLink;
                break;
            case "Home Equity":
                myElement = headerHomeEquityLink;
                break;
            case "Mortgage Rates":
                myElement = headerMortgageRatesLink;
                break;
            case "Resources":
                myElement = headerResourcesLink;
                break;
            case "Students":
                myElement = headerStudentsLink;
                break;
            case "Ask a Question":
                myElement = headerAskQuestionLink;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + linkText);
        }
        clickOnElement(waitForLink, myElement);
    }

}
