package com.legobatmanfan.mortgagecalculator.menus.submenus;

import com.legobatmanfan.mortgagecalculator.common.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResourcesSubmenu extends BasicActions {

    private WebDriver _driverResourcesSubmenu;

    @FindBy(how = How.LINK_TEXT, using = "Refinance Calculator")
    private WebElement resSubRefinanceCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Home Equity & HELOC Calculator")
    private WebElement resSubHomeEquityHELOCCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "HELOC Calculator")
    private WebElement resSubHelocCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Interest Only Calculator")
    private WebElement resSubInterestOnlyCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "100+ Calculators")
    private WebElement resSubHundredCalculatorsLink;

    @FindBy(how = How.LINK_TEXT, using = "Finance Glossary")
    private WebElement resSubFinanceGlossaryLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage News")
    private WebElement resSubMortgageNewsLink;

    @FindBy(how = How.LINK_TEXT, using = "Lenders")
    private WebElement resSubLendersLink;

    @FindBy(how = How.LINK_TEXT, using = "New Home Mortgage")
    private WebElement resSubNewHomeMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Home Refinance")
    private WebElement resSubHomeRefinanceLink;

    @FindBy(how = How.LINK_TEXT, using = "")
    private WebElement resSubHomeEquityLoansLink;

    @FindBy(how = How.LINK_TEXT, using = "HELOC")
    private WebElement resSubHelocLink;

    @FindBy(how = How.LINK_TEXT, using = "Second Mortgage")
    private WebElement resSubSecondMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Reverse Mortgage")
    private WebElement resSubReverseMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Interest Only Mortgage")
    private WebElement resSubInterestOnlyMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Cash-out Refinance")
    private WebElement reSubCashoutRefinanceLink;

    @FindBy(how = How.LINK_TEXT, using = "FHA Loan")
    private WebElement resSubFhaLoanLink;

    @FindBy(how = How.LINK_TEXT, using = "ARM")
    private WebElement reSubArmLink;

    public ResourcesSubmenu(WebDriver driver){
        this._driverResourcesSubmenu = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLink(WebDriverWait waitForLink, String linkText){
        WebElement myElement;

        switch(linkText){
            case "Refinance Calculator":
                myElement = resSubRefinanceCalculatorLink;
                break;
            case "Home Equity & HELOC Calculator":
                myElement = resSubHomeEquityHELOCCalculatorLink;
                break;
            case "HELOC Calculator":
                myElement = resSubHelocCalculatorLink;
                break;
            case "Interest Only Calculator":
                myElement = resSubInterestOnlyCalculatorLink;
                break;
            case "100+ Calculators":
                myElement = resSubHundredCalculatorsLink;
                break;
            case "Finance Glossary":
                myElement = resSubFinanceGlossaryLink;
                break;
            case "Mortgage News":
                myElement = resSubMortgageNewsLink;
                break;
            case "Lenders":
                myElement = resSubLendersLink;
                break;
            case "New Home Mortgage":
                myElement = resSubNewHomeMortgageLink;
                break;
            case "Home Refinance":
                myElement = resSubHomeRefinanceLink;
                break;
            case "Home Equity Loans":
                myElement = resSubHomeEquityLoansLink;
                break;
            case "HELOC":
                myElement = resSubHelocLink;
                break;
            case "Second Mortgage":
                myElement = resSubSecondMortgageLink;
                break;
            case "Reverse Mortgage":
                myElement = resSubReverseMortgageLink;
                break;
            case "Interest Only Mortgage":
                myElement = resSubInterestOnlyMortgageLink;
                break;
            case "Cash-out Refinance":
                myElement = reSubCashoutRefinanceLink;
                break;
            case "FHA Loan":
                myElement = resSubFhaLoanLink;
                break;
            case "ARM":
                myElement = reSubArmLink;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + linkText);
        }
        clickOnElement(waitForLink, myElement);
    }
}
