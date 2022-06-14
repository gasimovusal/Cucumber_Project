@parameterization1
Feature: US12300_parameterizing_feature_file_google_search.feature

Background: user_is_on_the_google_home_page
Given user is on the google page

  Scenario: TC01_Iphone_Search
    When user search for "apple" on google
    Then verify the page title contains "apple"
    And close the application

  Scenario: TC02_tesla_Search
    When user search for "tesla" on google
    Then verify the page title contains "tesla"
    And close the application

  Scenario: TC03_lexus_Search
    When user search for "lexus" on google
    Then verify the page title contains "lexus"
    And close the application

  Scenario: TC04_aston_martin_Search
    When user search for "aston martin" on google
    Then verify the page title contains "aston martin"
    And close the application