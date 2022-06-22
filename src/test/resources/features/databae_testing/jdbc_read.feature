Feature: database_reader_feature

  Background: Prerequisite_Connect_to_the_server
    Given user connects to database

  @db_customer_ssn
  Scenario: TC01_read_customer_ssn_information
    And user gets the "*" from "tp_customer" table
    And user reads all of the "ssn" column data
    Then close the database connection
  @db_customer_address
    Scenario: TC02_read_customer_address_information
      And user gets the "*" from "tp_customer" table
      And user reads all of the "address" column data
      Then close the database connection

  @db_customer_email
  Scenario: TC03_read_customer_address_information
    And user gets the "*" from "tp_customer" table
    And user reads all of the "email" column data
    Then close the database connection

  @db_user_email
  Scenario: TC04_read_customer_address_information
    And user gets the "*" from "jhi_user" table
    And user reads all of the "email" column data
    Then close the database connection

  @db_user_login
  Scenario: TC05_read_user_login
    And user gets the "*" from "jhi_user" table
    And user reads all of the "login" column data
    Then close the database connection
  @db_user_login_verify
  Scenario: TC06_verify_user_login
    And user gets the "*" from "jhi_user" table
    Then verify "jhi_user" table "login" column contains "scott" data
    Then close the database connection

  @db_user_login_verify
  Scenario: TC07_verify_jhi_user_email
    And user gets the "*" from "jhi_user" table
    Then verify "jhi_user" table "email" column contains "miquel.okon@hotmail.com" data
    Then close the database connection

  @db_account_type
  Scenario: TC08_verify_account_information
#    And user gets the "*" from "tp_account" table
    Then verify "tp_account" table "account_type" column contains "CHECKING" data
    Then verify "tp_account" table "account_type" column contains "SAVING" data
    Then verify "tp_account" table "account_type" column contains "CREDIT_CARD" data
    Then verify "tp_account" table "account_type" column contains "INVESTING" data
    Then close the database connection

    @db_customer
    Scenario: TC_09_read_account_registration
      And user gets the "*" from "jhi_user" table
      Then read the row count of the "jhi_user" table
      Then read column name of "jhi_user" table


