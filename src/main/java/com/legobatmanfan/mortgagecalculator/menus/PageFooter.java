package com.legobatmanfan.mortgagecalculator.menus;

import com.legobatmanfan.mortgagecalculator.common.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFooter extends BasicActions {

    private WebDriver _driverPageFooter;

    @FindBy(how = How.LINK_TEXT, using = "News")
    private WebElement footerResourcesNewsLink;

    @FindBy(how = How.LINK_TEXT, using = "Articles")
    private WebElement footerResourcesArticlesLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Calculators")
    private WebElement footerResourcesMortgageCalculatorsLink;

    @FindBy(how = How.LINK_TEXT, using = "Financial Glossary")
    private WebElement footerResourcesFinancialGlossaryLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Widgets")
    private WebElement footerResourcesMortgageWidgetsLink;

    @FindBy(how = How.LINK_TEXT, using = "Sitemap")
    private WebElement footerResourcesSitemapLink;

    @FindBy(how = How.LINK_TEXT, using = "Fixed Mortgage Rates")
    private WebElement footerFeaturedRatesFixedMortgageRatesLink;

    @FindBy(how = How.LINK_TEXT, using = "HELOC Rates")
    private WebElement footerFeaturedRatesHelocRatesLink;

    @FindBy(how = How.LINK_TEXT, using = "Jumbo Mortgage Rates")
    private WebElement footerFeaturedRatesJumboMortgageRatesLink;

    @FindBy(how = How.LINK_TEXT, using = "Reverse Mortgage Rates")
    private WebElement footerFeaturedRatesReverseMortgageRatesLink;

    @FindBy(how = How.LINK_TEXT, using = "Loan Modification")
    private WebElement footerPopularPagesLoanModificationLink;

    @FindBy(how = How.LINK_TEXT, using = "VA Mortgages")
    private WebElement footerPopularPagesVaMortgagesLink;

    @FindBy(how = How.LINK_TEXT, using = "FHA Mortgages")
    private WebElement footerPopularPagesFhaMortgagesLink;

    @FindBy(how = How.LINK_TEXT, using = "Second Mortgages")
    private WebElement footerPopularPagesSecondMortgagesLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Types")
    private WebElement footerPopularPagesMortgageTypesLink;

    @FindBy(how = How.LINK_TEXT, using = "Twitter")
    private WebElement footerConnectTwitterLink;

    @FindBy(how = How.LINK_TEXT, using = "Facebook")
    private WebElement footerConnectFacebookLink;

    @FindBy(how = How.LINK_TEXT, using = "Google+")
    private WebElement footerConnectGooglePlusLink;

    @FindBy(how = How.LINK_TEXT, using = "Who We Are")
    private WebElement footerAboutUsWhoWeAreLink;

    @FindBy(how = How.LINK_TEXT, using = "Contact Us")
    private WebElement footerAboutUsContactUsLink;

    @FindBy(how = How.LINK_TEXT, using = "Fraud Information")
    private WebElement footerAboutUsFraudInformationLink;

    @FindBy(how = How.LINK_TEXT, using = "Privacy Policy")
    private WebElement footerAboutUsPrivacyPolicyLink;

    @FindBy(how = How.LINK_TEXT, using = "Terms Of Use")
    private WebElement footerAboutUsTermsOfUseLink;

    public PageFooter(WebDriver driver) {
        this._driverPageFooter = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLink(WebDriverWait waitForLink, String linkText){
        WebElement myElement;

        switch(linkText){
            case "News":
                myElement = footerResourcesNewsLink;
                break;
            case "Articles":
                myElement = footerResourcesArticlesLink;
                break;
            case "Mortgage Calculators":
                myElement = footerResourcesMortgageCalculatorsLink;
                break;
            case "Financial Glossary":
                myElement = footerResourcesFinancialGlossaryLink;
                break;
            case "Mortgage Widgets":
                myElement = footerResourcesMortgageWidgetsLink;
                break;
            case "Sitemap":
                myElement = footerResourcesSitemapLink;
                break;
            case "Fixed Mortgage Rates":
                myElement = footerFeaturedRatesFixedMortgageRatesLink;
                break;
            case "HELOC Rates":
                myElement = footerFeaturedRatesHelocRatesLink;
                break;
            case "Jumbo Mortgage Rates":
                myElement = footerFeaturedRatesJumboMortgageRatesLink;
                break;
            case "Reverse Mortgage Rates":
                myElement = footerFeaturedRatesReverseMortgageRatesLink;
                break;
            case "Loan Modification":
                myElement = footerPopularPagesLoanModificationLink;
                break;
            case "VA Mortgages":
                myElement = footerPopularPagesVaMortgagesLink;
                break;
            case "FHA Mortgages":
                myElement = footerPopularPagesFhaMortgagesLink;
                break;
            case "Second Mortgages":
                myElement = footerPopularPagesSecondMortgagesLink;
                break;
            case "Mortgage Types":
                myElement = footerPopularPagesMortgageTypesLink;
                break;
            case "Twitter":
                myElement = footerConnectTwitterLink;
                break;
            case "Facebook":
                myElement = footerConnectFacebookLink;
                break;
            case "Google+":
                myElement = footerConnectGooglePlusLink;
                break;
            case "Who We Are":
                myElement = footerAboutUsWhoWeAreLink;
                break;
            case "Contact Us":
                myElement = footerAboutUsContactUsLink;
                break;
            case "Fraud Information":
                myElement = footerAboutUsFraudInformationLink;
                break;
            case "Privacy Policy":
                myElement = footerAboutUsPrivacyPolicyLink;
                break;
            case "Terms Of Use":
                myElement = footerAboutUsTermsOfUseLink;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + linkText);
        }
        clickOnElement(waitForLink, myElement);
    }

}