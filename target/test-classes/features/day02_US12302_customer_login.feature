@customer_login
Feature: day02_US12302_customer_login.feature

  Scenario Outline: login_customer_profile

    Given user is on the login page
    And user login dropdown
    And user send username "<username>"
    And user send password "<password>"
    When user clicks on login button
    Then capture the screenshot
    Then close the application

    Examples: customer_credentials
    |username                     |password|
    |customer@bluerentalcars.com  |12345   |
    |customer1@bluerentalcars.com |12346   |
    |customer2@bluerentalcars.com |12347   |
    |customer3@bluerentalcars.com |12348   |