Feature: Checking the footer menu

  Scenario Outline: Check all of the links in the footer
    Given an open browser window
    When the "<link>" link in the footer is clicked
    Then the page title contains the phrase "<phrase>"
    And the url is "<url>"

    Examples:
    |link                       |phrase                                                         |url                                                        |
    |News	                    |MortgageLoan.com	                                            |https://www.mortgageloan.com/tags/mortgage-news            |
    |Articles	                |Articles on MortgageLoan.com	                                |https://www.mortgageloan.com/articles                      |
    |Mortgage Calculators	    |Mortgage Calculators and other Financial Calculators	        |https://www.mortgageloan.com/calculator                    |
    |Financial Glossary	        |Finance glossary	                                            |https://www.mortgageloan.com/finance-glossary-terms        |
    |Mortgage Widgets	        |Real Estate Widgets	                                        |https://www.mortgageloan.com/widgets                       |
    |Sitemap	                |MortgageLoan.com Sitemap	                                    |https://www.mortgageloan.com/sitemap                       |
    |Fixed Mortgage Rates	    |Fixed-Rate Mortgage \| 15-Year, 30-Year Fixed Mortgage Rates	|https://www.mortgageloan.com/rates/fixed-mortgage-rates    |
    |HELOC Rates	            |Home Equity Line of Credit - HELOC Refinance Rates	            |https://www.mortgageloan.com/home-equity-line-of-credit    |
    |Jumbo Mortgage Rates	    |Jumbo Mortgage Rates and Jumbo Loans	                        |https://www.mortgageloan.com/jumbo-mortgages               |
    |Reverse Mortgage Rates	    |Reverse Mortgage Loan Rates - Reverse Mortgage Lenders	        |https://www.mortgageloan.com/reverse-mortgage              |
    |Loan Modification	        |Consumer Guide to Loan Modification	                        |https://www.mortgageloan.com/loan-modification             |
    |VA Mortgages	            |VA Mortgage Loans - VA Refinance Rates	                        |https://www.mortgageloan.com/va-mortgage                   |
    |FHA Mortgages	            |FHA Mortgage Loans - FHA Refinance Rates	                    |https://www.mortgageloan.com/fha                           |
    |Second Mortgages	        |A guide to second mortgages	                                |https://www.mortgageloan.com/second-mortgage               |
    |Mortgage Types	            |Mortgage Types - Mortgage Option	                            |https://www.mortgageloan.com/mortgage-types                |
    |Twitter	                | Twitter	                                                    |https://twitter.com/mortgageloan                           |
    |Facebook                   |MortgageLoan.com - Home \| Facebook	                        |https://www.facebook.com/mortgageloancom                   |
    |Google+	                |Sign in - Google Accounts	                                    |google.com/                                                |
    |Who We Are	                |MortgageLoan.com - About Us	                                |https://www.mortgageloan.com/about-us                      |
    |Contact Us	                |MortgageLoan.com - About Us	                                |https://www.mortgageloan.com/about-us                      |
    |Fraud Information	        |Important Fraud Information by MortgageLoan.com	            |https://www.mortgageloan.com/fraud-information             |
    |Privacy Policy	            |Privacy Policy \| MortgageLoan.com	                            |https://www.mortgageloan.com/privacy                       |
    |Terms Of Use	            |Terms and Conditions \| MortgageLoan.com	                    |https://www.mortgageloan.com/legal                         |