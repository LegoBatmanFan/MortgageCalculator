package com.legobatmanfan.mortgagecalculator.menus.submenus;

import com.legobatmanfan.mortgagecalculator.common.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MortgageRatesSubmenu extends BasicActions {

    private WebDriver _driverMortgageRatesSubmenu;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Loan Rates")
    private WebElement mortrateSubMortgageLoanRatesLink;

    @FindBy(how = How.LINK_TEXT, using = "VA Mortgage")
    private WebElement mortrateSubVaMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Home Purchase")
    private WebElement mortrateSubHomePurchaseLink;

    @FindBy(how = How.LINK_TEXT, using = "Interest Only Mortgage")
    private WebElement mortrateSubInterestOnlyMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "FHA Loan")
    private  WebElement mortrateSubFhaLoanLink;

    @FindBy(how = How.LINK_TEXT, using = "Second Mortgage")
    private WebElement mortrateSubSecondMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Fixed Mortgage Rates")
    private WebElement mortrateSubFixedMortgageRatesLink;

    @FindBy(how = How.LINK_TEXT, using = "Jumbo Mortgage")
    private WebElement mortrateSubJumboMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Reverse Mortgage")
    private WebElement mortrateReverseMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Adjustable Rate Mortgage")
    private WebElement mortrateAdjustableRateMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Piggyback Loan")
    private WebElement mortrateSubPiggybackLoanLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Payment Calculator")
    private WebElement mortratSubeMortgagePaymentCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Qualifying Calculator")
    private WebElement mortrateSubMortgageQualifyingCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Rent Vs. Buy Calculator")
    private WebElement mortrateSubRentBuyCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "ARM Vs. Fixed Rate Calculator")
    private WebElement mortrateSubArmFixedRateCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Articles")
    private WebElement mortrateSubMortgageArticlesLink;

    @FindBy(how = How.LINK_TEXT, using = "Lenders")
    private WebElement mortrateSubLendersLink;

    @FindBy(how = How.LINK_TEXT, using = "Finance Glossary")
    private WebElement mortrateSubFinanceGlossaryLink;

    public MortgageRatesSubmenu(WebDriver driver){
        this._driverMortgageRatesSubmenu = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLink(WebDriverWait waitForLink, String linkText){
        WebElement myElement;

        switch(linkText){
            case "Mortgage Loan Rates":
                myElement = mortrateSubMortgageLoanRatesLink;
                break;
            case "VA Mortgage":
                myElement = mortrateSubVaMortgageLink;
                break;
            case "Home Purchase":
                myElement = mortrateSubHomePurchaseLink;
                break;
            case "Interest Only Mortgage":
                myElement = mortrateSubInterestOnlyMortgageLink;
                break;
            case "FHA Loan":
                myElement = mortrateSubFhaLoanLink;
                break;
            case "Second Mortgage":
                myElement = mortrateSubSecondMortgageLink;
                break;
            case "Fixed Mortgage Rates":
                myElement = mortrateSubFixedMortgageRatesLink;
                break;
            case "Jumbo Mortgage":
                myElement = mortrateSubJumboMortgageLink;
                break;
            case "Reverse Mortgage":
                myElement = mortrateReverseMortgageLink;
                break;
            case  "Adjustable Rate Mortgage":
                myElement = mortrateAdjustableRateMortgageLink;
                break;
            case  "Piggyback Loan":
                myElement = mortrateSubPiggybackLoanLink;
                break;
            case  "Mortgage Payment Calculator":
                myElement = mortratSubeMortgagePaymentCalculatorLink;
                break;
            case  "Mortgage Qualifying Calculator":
                myElement = mortrateSubMortgageQualifyingCalculatorLink;
                break;
            case  "Rent Vs. Buy Calculator":
                myElement = mortrateSubRentBuyCalculatorLink;
                break;
            case  "ARM Vs. Fixed Rate Calculator":
                myElement = mortrateSubArmFixedRateCalculatorLink;
                break;
            case  "Mortgage Articles":
                myElement = mortrateSubMortgageArticlesLink;
                break;
            case  "Lenders":
                myElement = mortrateSubLendersLink;
                break;
            case  "Finance Glossary":
                myElement =  mortrateSubFinanceGlossaryLink;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + linkText);
        }
        clickOnElement(waitForLink, myElement);
    }
}
