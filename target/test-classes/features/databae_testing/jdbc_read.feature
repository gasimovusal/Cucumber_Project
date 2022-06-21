Feature: database_reader_feature
  @db_customer_ssn
  Scenario: TC01_read_customer_ssn_information
    Given user connects to database
    And user gets the "*" from "tp_customer" table
    And user reads all of the "ssn" column data