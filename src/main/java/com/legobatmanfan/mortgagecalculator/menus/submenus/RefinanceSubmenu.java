package com.legobatmanfan.mortgagecalculator.menus.submenus;

import com.legobatmanfan.mortgagecalculator.common.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefinanceSubmenu extends BasicActions {

    private WebDriver _driverRefinanceSubmenu;


    @FindBy(how = How.LINK_TEXT, using = "Refinance Mortgage")
    private WebElement refiSubRefinanceMortgageLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage refinance FAQ")
    private WebElement refiSubMortgageRefinanceFaqLink;

    @FindBy(how = How.LINK_TEXT, using = "Refinancing with Bad Credit")
    private WebElement refiSubRefinancingBadCreditLink;

    @FindBy(how = How.LINK_TEXT, using = "Documents for Refinance")
    private WebElement refiSubDocumentsForRefinancelink;

    @FindBy(how = How.LINK_TEXT, using = "Refinance Fees")
    private WebElement refiSubRefinanceFeesLink;

    @FindBy(how = How.LINK_TEXT, using = "No-Cost Refinance")
    private WebElement refiSubNoCostRefinanceLink;

    @FindBy(how = How.LINK_TEXT, using = "Renovation Refinance Loans")
    private WebElement refSubRenovationRefinanceLoansLink;

    @FindBy(how = How.LINK_TEXT, using = "Home Loans")
    private WebElement refiSubHomeLoansLink;

    @FindBy(how = How.LINK_TEXT, using = "Refinance Calculator")
    private WebElement refiSubRefinanceCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Refinance Break-Even Calculator")
    private WebElement refiSubRefinanceBreakEvenCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Should I Refinance Calculator")
    private WebElement refiSubShouldRefinanceCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Finance Glossary")
    private WebElement refiSubFinanceGlossaryLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Rates")
    private WebElement refiSubMortgageRatesLink;

    @FindBy(how = How.LINK_TEXT, using = "Refinance News")
    private WebElement refiSubRefinanceNewsLink;

    @FindBy(how = How.LINK_TEXT, using = "Lenders")
    private WebElement refoSubLendersLink;

    public RefinanceSubmenu(WebDriver driver){
        this._driverRefinanceSubmenu = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLink(WebDriverWait waitForLink, String linkText){
        WebElement myElement;

        switch(linkText){
            case "Refinance Mortgage":
                myElement = refiSubRefinanceMortgageLink;
                break;
            case "Mortgage refinance FAQ":
                myElement = refiSubMortgageRefinanceFaqLink;
                break;
            case "Refinancing with Bad Credit":
                myElement = refiSubRefinancingBadCreditLink;
                break;
            case "Documents for Refinance":
                myElement =  refiSubDocumentsForRefinancelink;
                break;
            case "Refinance Fees":
                myElement = refiSubRefinanceFeesLink;
                break;
            case "No-Cost Refinance":
                myElement = refiSubNoCostRefinanceLink;
                break;
            case "Renovation Refinance Loans":
                myElement = refSubRenovationRefinanceLoansLink;
                break;
            case "Home Loans":
                myElement = refiSubHomeLoansLink;
                break;
            case "Refinance Calculator":
                myElement = refiSubRefinanceCalculatorLink;
                break;
            case "Refinance Break-Even Calculator":
                myElement = refiSubRefinanceBreakEvenCalculatorLink;
                break;
            case "Should I Refinance Calculator":
                myElement = refiSubShouldRefinanceCalculatorLink;
                break;
            case "Finance Glossary":
                myElement = refiSubFinanceGlossaryLink;
                break;
            case "Mortgage Rates":
                myElement = refiSubMortgageRatesLink;
                break;
            case "Refinance News":
                myElement = refiSubRefinanceNewsLink;
                break;
            case "Lenders":
                myElement = refoSubLendersLink;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + linkText);
        }
        clickOnElement(waitForLink, myElement);
    }
}
