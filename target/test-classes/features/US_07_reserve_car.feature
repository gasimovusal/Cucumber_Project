@reserve_car
  Feature: reserve_car
    Scenario Outline: reserve_car_as_customer
      Given user is on the login page
      And user login dropdown
      And user send username "<username>"
      And user send password "<password>"
      When user clicks on login button
      And user selects a "<car>"
      And user enters pick up place "<pick_place>"
      And user enters drop off place "<drop_place>"
      And user enters pick up data "<pick_date>"
      And user enters pick up time "<pick_time>"
      And user enters drop off date "<drop_date>"
      And user enters drop off time "<drop_time>"
      Then user clicks on continue reservation
      Then verify complete reservation screen pop up
      And user enters card number "<card_number>"
      And user enters "<name>" on the card
      And user enters "<expire_date>" and "<CVC>"
      And user checks the agreement
      And user clicks complete reservation
      Then verify Reservation created successfully pop up
#      And user navigated to Reservations screen
#      And user verifies the last reservation is created
#      Then user clicks on the last reservation
#      And verify reservation detail page is displayed
#      And verify the table has the following fields: Model, Doors, Seats, Luggage, Transmission, Air Conditioning, Fuel Type, Age
#      Then user clicks on back to reservations
#      And verify Reservations page is displayed
#      And user clicks on Home link
#      Then verify the home page is displayed
#      And user close the browser


      Examples:
      |username                    |password|car        |pick_place|drop_place|pick_date |pick_time| drop_date|drop_time|card_number     |name         |expire_date|CVC|
      |customer2@bluerentalcars.com|12347   |VW Polo|istanbul    |istanbul  |07/07/2022|01:00PM  |08/082022 |08:00AM  |1234123412341234|Vusal Gasimov|12/25      |555|