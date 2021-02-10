package com.legobatmanfan.mortgagecalculator.menus;

import com.legobatmanfan.mortgagecalculator.common.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SideMenu extends BasicActions {

    private WebDriver _driverSideMenu;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Payment Calculator")
    private WebElement sideMenuMortgagePaymentCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Principal Calculator")
    private WebElement sideMenuMortgagePrincipalCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Should I Refinance?")
    private WebElement sideMenuShouldRefinanceLink;

    @FindBy(how = How.LINK_TEXT, using = "Interest-Only Calculator")
    private WebElement sideMenuInterestOnlyCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Affordability Calculator")
    private WebElement sideMenuAffordabilityCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "What if I Pay More Every Month?")
    private WebElement sideMenuPayMoreEveryMonthLink;

    @FindBy(how = How.LINK_TEXT, using = "What is The Real APR for That Loan?")
    private WebElement sideMenuRealAPRForLoanLink;

    @FindBy(how = How.LINK_TEXT, using = "Payment per Thousand Financed")
    private WebElement sideMenuPaymentPerThousandFinancedLink;

    @FindBy(how = How.LINK_TEXT, using = "Should I Pay Points to Lower My Interest Rate?")
    private WebElement sideMenuLowerMyInterestRateLink;

    @FindBy(how = How.LINK_TEXT, using = "How Much Income do I Need in Order to Qualify?")
    private WebElement sideMenuIncomeToQualifyLink;

    @FindBy(how = How.LINK_TEXT, using = "Rent vs. Buy")
    private WebElement sideMenuRentVsBuyLink;

    @FindBy(how = How.LINK_TEXT, using = "Should I use HELOC to Lower My Debt Payments?")
    private WebElement sideMenuHelocToLowerDebtPaymentsLink;

    @FindBy(how = How.LINK_TEXT, using = "Paying off Credit Card Debt with Minimum Payments")
    private WebElement sideMenuMinimumPaymentsLink;

    @FindBy(how = How.LINK_TEXT, using = "How Can I Payoff My Credit Card Debt Sooner?")
    private WebElement sideMenuPayoffDebtSoonerLink;

    @FindBy(how = How.LINK_TEXT, using = "Interest-Only with Additional Payments")
    private WebElement sideMenuInterestOnlyAdditionalPaymentsLink;

    @FindBy(how = How.LINK_TEXT, using = "Mortgage Length Calculator")
    private WebElement sideMenuMortgageLengthCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Standard vs Bi-Weekly")
    private WebElement sideMenuStandardVsBiWeeklyLink;

    @FindBy(how = How.LINK_TEXT, using = "Tax Benefits Calculator")
    private WebElement sideMenuTaxBenefitsCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Which Loan Is Better?")
    private WebElement sideMenuWhichLoanIsBetterLink;

    @FindBy(how = How.ID, using = "upClick")
    private WebElement sideMenuUpArrow;

    @FindBy(how = How.ID, using = "downClick")
    private WebElement sideMenuDownArrow;

    public SideMenu(WebDriver driver){
        this._driverSideMenu = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMortgagePaymentCalculatorLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuMortgagePaymentCalculatorLink);
    }

    public void clickMortgagePrincipalCalculatorLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuMortgagePrincipalCalculatorLink);
    }

    public void clickShouldIRefinanceLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuShouldRefinanceLink);
    }

    public void clickInterestOnlyCalculatorLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuInterestOnlyCalculatorLink);
    }

    public void clickAffordabilityCalculatorLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuAffordabilityCalculatorLink);
    }

    public void clickWhatIfIPayMoreEveryMonthLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuPayMoreEveryMonthLink);
    }

    public void clickWhatIsTheRealAprForThatLoanLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuRealAPRForLoanLink);
    }

    public void clickPaymentPerThousandFinancedLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuPaymentPerThousandFinancedLink);
    }

    public void clickShouldIPayPointsToLowerMyInterestRateLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuLowerMyInterestRateLink);
    }

    public void clickHowMuchIncomeDoINeedInOrderToQualifyLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuIncomeToQualifyLink);
    }

    public void clickRentVsBuyLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuRentVsBuyLink);
    }

    public void clickShouldIUseHelocToLowerMyDebtPaymentsLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuHelocToLowerDebtPaymentsLink);
    }

    public void clickPayingOffCreditCardDebtWithMinimumPaymentsLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuMinimumPaymentsLink);
    }

    public void clickHowCanIPayoffMyCreditCardDebtSoonerLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuPayoffDebtSoonerLink);
    }

    public void clickInterestOnlyWithAdditionalPaymentsLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuInterestOnlyAdditionalPaymentsLink);
    }

    public void clickMortgageLengthCalculatorLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuMortgageLengthCalculatorLink);
    }

    public void clickStandardVsBiWeeklyLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuStandardVsBiWeeklyLink);
    }

    public void clickTaxBenefitsCalculatorLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuTaxBenefitsCalculatorLink);
    }

    public void clickWhichLoanIsBetterLink(WebDriverWait waitForLink){
        clickOnElement(waitForLink, sideMenuWhichLoanIsBetterLink);
    }

    public void clickUpArrow(WebDriverWait waitForArrow){
        clickOnElement(waitForArrow, sideMenuUpArrow);
    }

    public void clickDownArrow(WebDriverWait waitForArrow){
        clickOnElement(waitForArrow, sideMenuDownArrow);
    }
}
