package com.legobatmanfan.mortgagecalculator.menus.submenus;

import com.legobatmanfan.mortgagecalculator.common.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeEquitySubmenu extends BasicActions {

    private WebDriver _driverHomeEquitySubmenu;

    public HomeEquitySubmenu(WebDriver driver){
        this._driverHomeEquitySubmenu = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Home Equity Loans")
    private WebElement homeeqSubHomeEquityLoansLink;

    @FindBy(how = How.LINK_TEXT, using = "HELOC")
    private WebElement homeeqSubHELOCLink;

    @FindBy(how = How.LINK_TEXT, using = "Home Equity Loan on Rental Property")
    private WebElement homeqSubHomeEquityLoanOnRentalPropertyLink;

    @FindBy(how = How.LINK_TEXT, using = "Financing Second Home by Home Equity Loan")
    private WebElement homeeqSubFinancingSecondHomeByHomeEquityLoanLink;

    @FindBy(how = How.LINK_TEXT, using = "Home Equity & HELOC Calculator")
    private WebElement homeeqSubHomeEquityHELOCCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "HELOC Calculator")
    private WebElement homeeqSubHELOCCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Line of Credit Pay-off Calculator")
    private WebElement homeeqSubLineCreditPayOffCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "100+ Calculators")
    private WebElement homeeqSubHundredCalculatorsLink;

    @FindBy(how = How.LINK_TEXT, using = "Home Equity News")
    private WebElement homeeqSubHomeEquityNewsLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Articles")
    private WebElement homeeqSubMortgageArticlesLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Rates")
    private WebElement homeeqSubMortgageRatesLink;

    @FindBy(how = How.LINK_TEXT, using = "Finance Glossary")
    private WebElement homeeqSubFinanceGlossaryLink;

    @FindBy(how = How.LINK_TEXT, using = "Lenders")
    private WebElement homeeqSubLendersLink;

    public void clickOnLink(WebDriverWait waitForLink, String linkText){
        WebElement myElement;

        switch(linkText){
            case  "Home Equity Loans":
                myElement = homeeqSubHomeEquityLoansLink;
                break;
            case  "HELOC":
                myElement = homeeqSubHELOCLink;
                break;
            case  "Home Equity Loan on Rental Property":
                myElement = homeqSubHomeEquityLoanOnRentalPropertyLink;
                break;
            case  "Financing Second Home by Home Equity Loan":
                myElement = homeeqSubFinancingSecondHomeByHomeEquityLoanLink;
                break;
            case  "Home Equity & HELOC Calculator":
                myElement = homeeqSubHomeEquityHELOCCalculatorLink;
                break;
            case  "HELOC Calculator":
                myElement = homeeqSubHELOCCalculatorLink;
                break;
            case  "Line of Credit Pay-off Calculator":
                myElement = homeeqSubLineCreditPayOffCalculatorLink;
                break;
            case  "100+ Calculators":
                myElement = homeeqSubHundredCalculatorsLink;
                break;
            case  "Home Equity News":
                myElement = homeeqSubHomeEquityNewsLink;
                break;
            case  "Mortgage Articles":
                myElement = homeeqSubMortgageArticlesLink;
                break;
            case  "Mortgage Rates":
                myElement = homeeqSubMortgageRatesLink;
                break;
            case  "Finance Glossary":
                myElement = homeeqSubFinanceGlossaryLink;
                break;
            case "Lenders":
                myElement = homeeqSubLendersLink;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + linkText);
        }
        clickOnElement(waitForLink, myElement);
    }
}
