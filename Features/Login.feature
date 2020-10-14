# new feature
# Tags: optional

Feature: Login in KaBum e-commerce

  Scenario: Check login successful with valid credentials
    Given User in on login page
    When User enters username and password
    Then The user access the home page