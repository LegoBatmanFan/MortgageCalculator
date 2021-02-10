package com.legobatmanfan.mortgagecalculator.stepdefinitions;

import com.legobatmanfan.mortgagecalculator.common.BrowserActions;
import com.legobatmanfan.mortgagecalculator.helpers.WebDriverProcessing;
import com.legobatmanfan.mortgagecalculator.menus.PageFooter;
import com.legobatmanfan.mortgagecalculator.menus.PageHeader;
import com.legobatmanfan.mortgagecalculator.menus.SideMenu;

import io.cucumber.java8.En;

public class StepDefinitionsMainMenus extends WebDriverProcessing implements En {

    public StepDefinitionsMainMenus(){
        Given("an open browser window", () -> {
            goToMainPage();
        });

        When("I scroll the menu into view", () -> {
            BrowserActions.scrollDown(getGeckoDriver());
        });

        When("the {string} link in the footer is clicked", (String footerLink) -> {
            PageFooter links = new PageFooter(getGeckoDriver());
            links.clickOnLink(getWebDriverWait(), footerLink);
            BrowserActions.pageLoadWait();
            if(footerLink.contains("News") | footerLink.contains("Twitter") | footerLink.contains("Facebook") | footerLink.contains("Google+")){
                BrowserActions.switchToPopupWindow(getGeckoDriver());
            }
            BrowserActions.pageLoadWait();
        });

        When("the {string} link in the header is clicked", (String headerLink) -> {
            PageHeader links = new PageHeader(getGeckoDriver());
            links.clickOnLink(getWebDriverWait(), headerLink);
            BrowserActions.pageLoadWait();
        });

        Then("I click Mortgage Principal Calculator and the down arrow", () -> {
            SideMenu button = new SideMenu(getGeckoDriver());

            BrowserActions.pageLoadWait();
            button.clickMortgagePrincipalCalculatorLink(getWebDriverWait());
            BrowserActions.pageLoadWait();
            button.clickDownArrow(getWebDriverWait());
        });

        Then("the page title contains the phrase {string}", (String phrase) -> {
            BrowserActions.pageLoadWait();
            assert BrowserActions.getPageTitle(getGeckoDriver()).contains(phrase);
        });

        Then("the url is {string}", (String urlString) -> {
            BrowserActions.pageLoadWait();
            assert BrowserActions.getPageUrl(getGeckoDriver()).contains(urlString);
        });

        And("when I hover over the {string} in the header", (String mainMenuLink) -> {
            // Write code here that turns the phrase above into concrete actions
        });

        When("the {string} link in the {string} submenu is clicked", (String subMenuLink, String mainMenuLink) -> {
            // Write code here that turns the phrase above into concrete actions
        });

        Then("the {string} appears and the title contains the phrase {string}", (String pageName, String phrase) -> {
            // Write code here that turns the phrase above into concrete actions
        });

        And("the url contains {string}", (String urlLink) -> {
            // Write code here that turns the phrase above into concrete actions
        });
    }
}
