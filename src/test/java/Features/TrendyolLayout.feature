Feature: Layout Controls

  Scenario: Trendyol HomePage Layout Controls
    Given I launch "https://www.trendyol.com/"
    When I closed gender popup
    And I load gspec file homePage.gspec
    Then Test Info Basic HomePage layout control and Report Info HomePage is updated

  Scenario: Trendyol Login Page Layout Controls
    Given I launch "https://www.trendyol.com/"
    When I closed gender popup
    And Click Login button
    When I load gspec file login.gspec
    Then Test Info Basic Login layout control and Report Info Login is updated