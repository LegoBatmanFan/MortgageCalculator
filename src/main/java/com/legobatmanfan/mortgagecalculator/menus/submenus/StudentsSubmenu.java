package com.legobatmanfan.mortgagecalculator.menus.submenus;

import com.legobatmanfan.mortgagecalculator.common.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentsSubmenu extends BasicActions {

    WebDriver _driverStudentsSubmenu;

    @FindBy(how = How.LINK_TEXT, using = "Student Loans")
    private WebElement studentSubStudentLoansLink;

    @FindBy(how = How.LINK_TEXT, using = "Student Budget Tool")
    private WebElement studentSubStudentBudgetToolLink;

    @FindBy(how = How.LINK_TEXT, using = "HELOC Calculator")
    private WebElement studentSubHelocCalculatorLink;

    @FindBy(how = How.LINK_TEXT, using = "Finance Glossary")
    private WebElement studentSubFinanceGlossaryLink;

    @FindBy(how = How.LINK_TEXT, using = "Paying for College")
    private WebElement studentSubPayingForCollegeLink;

    @FindBy(how = How.LINK_TEXT, using = "Saving for College")
    private WebElement studentSubSavingForCollegeLink;

    @FindBy(how = How.LINK_TEXT, using = "Lenders")
    private WebElement studentSubLendersLink;

    public StudentsSubmenu(WebDriver driver){
        this._driverStudentsSubmenu = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLink(WebDriverWait waitForLink, String linkText){
        WebElement myElement;

        switch(linkText){
            case "Student Loans":
                myElement = studentSubStudentLoansLink;
                break;
            case "Student Budget Tool":
                myElement = studentSubStudentBudgetToolLink;
                break;
            case "HELOC Calculator":
                myElement = studentSubHelocCalculatorLink;
                break;
            case "Finance Glossary":
                myElement = studentSubFinanceGlossaryLink;
                break;
            case "Paying for College":
                myElement = studentSubPayingForCollegeLink;
                break;
            case "Saving for College":
                myElement = studentSubSavingForCollegeLink;
                break;
            case "Lenders":
                myElement = studentSubLendersLink;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + linkText);
        }
        clickOnElement(waitForLink, myElement);
    }
}
