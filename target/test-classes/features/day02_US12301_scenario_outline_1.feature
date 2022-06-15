@scenario_outline_1
Feature: day02_US12300_scenario_outline_1.feature

  Background: user_is_on_the_google_home_page
    Given user is on the google page

    Scenario Outline: TC_Google_Search_Test
      When user search for "<data>" on google
      Then verify the page title contains "<data>"
      Then close the application

      Examples: test_data
      |data|
      |mercedes|
      |tesla|
      |lamborgini|
      |Baku|

# Scenario outline is used to run same scenario multiple times with different data
# Scenario Outline must be followed by Example keyword
# Examples keyword is used for passing test data
# Scenario Outline is used for DDT-Data Driven testing. This is similar to testing with excel sheet
# Scenario Outline makes feature files shorter and cleaner