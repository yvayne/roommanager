Feature: Test Login to Room Manager
  Scenario: Test login with valid credentials
    Given Open Browser and start application
    When I enter valid username and valid password
    Then User should be able to login successfully