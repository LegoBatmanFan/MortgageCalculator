Feature: Checking the header menu

  Scenario Outline: Check all of the links in the header
    Given an open browser window
    When the "<link>" link in the header is clicked
    Then the page title contains the phrase "<phrase>"

    Examples:
    |link                     |phrase                                                     |
    |Home                     |Advice Since 1995 \| MortgageLoan                          |
    |Refinance                |Guide to Refinance Mortgage                                |
    |Home Equity              |Rates - The Ultimate Equity Guide                          |
    |Mortgage Rates           |Mortgage Rates Today                                       |
    |Resources                |Mortgage Resources - News, Glossary                        |
    |Students                 |Top Student Finance Advice and Tools \| MortgageLoan.com   |
    |Ask a Question           |Advice By MortgageLoan.com                                 |