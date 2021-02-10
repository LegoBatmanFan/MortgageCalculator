Feature: Testing the header submenus
  Scenario Outline: Click on the submenu link
    Given an open browser window
    And when I hover over the "<mainMenuLink>" in the header
    When the "<subMenuLink>" link in the "<mainMenuLink>" submenu is clicked
    Then the "<pageName>" appears and the title contains the phrase "<phrase>"
    And the url contains "<url>"

    Examples:
      |mainMenuLink                 |subMenuLink              |pageName         |phrase         |url          |
      |mouse                        |cat                      |dog              |hamster        |bird         |

