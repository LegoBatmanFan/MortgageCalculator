package com.legobatmanfan.mortgagecalculator.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasicActions {
    protected void clickOnElement(WebDriverWait waitForPageElement, WebElement myPageElement){
        waitForPageElement.until(ExpectedConditions.visibilityOf(myPageElement));
        myPageElement.click();
    }

    protected void enterTextInField(WebDriverWait waitForTextField, WebElement myTextField, String myText){
        waitForTextField.until(ExpectedConditions.visibilityOf(myTextField));
        myTextField.click();
        myTextField.clear();
        myTextField.sendKeys(myText);
    }

    protected void selectDropDownOption(WebDriverWait waitForDropDown, WebElement myDropDown, String myDropDownOption){
        Select selectDropDownElement = new Select(myDropDown);
        waitForDropDown.until(ExpectedConditions.visibilityOf(myDropDown));
        selectDropDownElement.selectByVisibleText(myDropDownOption);
    }

    protected void enterDropDownInput(WebDriverWait waitForInputDropDown, WebElement myInputDropDown, String myInputDropDownOption){
        waitForInputDropDown.until(ExpectedConditions.visibilityOf(myInputDropDown));
        myInputDropDown.sendKeys(myInputDropDownOption);
    }

    protected String getFieldValue(WebDriverWait waitForField, WebElement myField){
        waitForField.until(ExpectedConditions.visibilityOf(myField));
        return myField.getText();
    }

    protected void clickOnMenu(WebDriver driverMenu, WebElement mainMenu, WebElement subMenu){
        WebDriverWait waitForMainMenu = new WebDriverWait(driverMenu, 30);
        WebDriverWait waitForSubMenu = new WebDriverWait(driverMenu, 40);
        JavascriptExecutor js = (JavascriptExecutor)driverMenu;
        Actions action = new Actions(driverMenu);

        waitForMainMenu.until(ExpectedConditions.visibilityOf(mainMenu));
        action.moveToElement(mainMenu).build().perform();
        waitForSubMenu.until(ExpectedConditions.visibilityOf(subMenu));
        js.executeScript("arguments[0].click()", subMenu);
    }

    protected void selectDropDownIndex(WebDriverWait waitForIndexDropDown, WebElement myIndexDropDown, int myIndex){
        Select selectIndexDropDownElement = new Select(myIndexDropDown);
        waitForIndexDropDown.until(ExpectedConditions.visibilityOf(myIndexDropDown));
        selectIndexDropDownElement.selectByIndex(myIndex);
    }
}
