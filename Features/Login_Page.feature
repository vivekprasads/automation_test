Feature: Login
  Scenario: Logo present on home page
    Given I launch chrome browser
    When I open URL
    Then I verify that the logo on the page
    And close browser